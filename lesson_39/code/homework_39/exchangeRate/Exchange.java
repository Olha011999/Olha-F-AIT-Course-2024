package homework_39.exchangeRate;

import java.util.HashSet;
import java.util.Set;

////Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран.
public enum Exchange {
    USD(1.09), UAH(44.91), PLN(4.36), CAD(1.51);

    private double rateToEuro;

    Exchange(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    public void setRateToEuro(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    @Override
    public String toString() {
        return name() + " exchange rate to euro: " + rateToEuro;
    }

    //block for checking duplicates when loading a class

    static {
        Set<String> uniqueCodes = new HashSet<>();
        for (Exchange currency : Exchange.values()) { // we go through enum values
            if (!uniqueCodes.add(currency.name())) { // if the code already exists
                System.out.println("Duplicate code found: " + currency.name());
            }
        }
    }

    public static void listOfCurrenciesAndRates() {
        System.out.println("Available currencies and their exchange rates to the euro: ");
        for (Exchange exchange : Exchange.values()) {
            System.out.println(exchange);
        }
    }

    public static boolean isValidExchange(String code) {
        for (Exchange exchange : Exchange.values()) {
            if (exchange.name().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public static double convertToEuro(String code, double sum) {
        for (Exchange exchange : Exchange.values()) {
            if (exchange.name().equalsIgnoreCase(code)) {
                return sum * exchange.getRateToEuro();//convert currency into euro
            }
        }
        return 0;//if currency not found return zero
    }
}
