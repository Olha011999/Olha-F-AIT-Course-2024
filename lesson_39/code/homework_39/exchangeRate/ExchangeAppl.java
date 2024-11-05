package homework_39.exchangeRate;

import java.util.Scanner;

//Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.
public class ExchangeAppl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //we display a list of available currencies and their rates
        Exchange.listOfCurrenciesAndRates();

        System.out.println("Enter currency code for conversion: ");
        String code = scanner.nextLine().toUpperCase();

        //Let's check if such currency exists
        if (Exchange.isValidExchange(code)){
            System.out.println(" Please enter the amount you want to convert to euros " + code);
            double sum = scanner.nextDouble();

            //convert into euro
            double euro = Exchange.convertToEuro(code, sum);
            System.out.println("For " +sum+ " euros you will receive: " + euro);
        }

    }
}
