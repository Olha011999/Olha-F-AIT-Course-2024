package classwork_48.project_exchange.view;

public enum CurrencyExchange
{
    USD(1,"USD", 0.9178),
    AUD(2,"AUD", 0.6080),
    EGP(3,"EGP", 0.0187),
    KZT(4,"KZT", 0.0019),
    GBP(5,"GBP", 1.19),
    FJD(6,"FJD", 0.4091);
    //EGPP("EGP", 0.0187);

    private final int number;
    private String currency_codes;
    private double current_exchange;

    CurrencyExchange(int number, String currency_codes, double current_exchange) {
        this.number = number;
        this.currency_codes = currency_codes;
        this.current_exchange = current_exchange;
    }

    public int getNumber() {
        return number;
    }

    public String getCurrency_codes() {
        return currency_codes;
    }

    public double getCurrent_exchange() {
        return current_exchange;
    }

    public static CurrencyExchange findByNumber(int number) {
        for (CurrencyExchange currency : CurrencyExchange.values()) {
            if (currency.getNumber() == number) {
                return currency;
            }
        }
        throw new IllegalArgumentException("Invalid currency number: " + number);
    }
    // Метод для поиска валюты по коду
    public static CurrencyExchange findByCode(String currencyCode) {
        for (CurrencyExchange currency : CurrencyExchange.values()) {
            if (currency.currency_codes.equalsIgnoreCase(currencyCode)) {
                return currency;
            }
        }
        return null;  // Если валюта не найдена, возвращаем null
    }

    @Override
    public String toString()
    {
        return currency_codes + " - курс: " + current_exchange + " EUR";
    }
}
