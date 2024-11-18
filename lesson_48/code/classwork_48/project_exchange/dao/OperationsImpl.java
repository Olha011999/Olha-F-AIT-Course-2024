package classwork_48.project_exchange.dao;

import classwork_48.project_exchange.model.Transaction;
import classwork_48.project_exchange.view.CurrencyExchange;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationsImpl implements Operations {

    List<Transaction> transactions;

    public OperationsImpl(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Friend!");

        while (true) {
            System.out.println("Choose a currency to exchange to EUROs:");
            for (CurrencyExchange currency : CurrencyExchange.values()) {
                System.out.println(currency.getNumber() + " -> " + currency.getCurrency_codes());
            }
            System.out.println("Press 7 to Exit.");

            try {
                int actionNum = scanner.nextInt();

                if (actionNum == 7) {
                    System.out.println("See you later! Bye.");
                    break;
                }

                CurrencyExchange choice = CurrencyExchange.findByNumber(actionNum);
                if (choice == null) {
                    System.out.println("Invalid currency number. Try again.");
                    continue;
                }

                System.out.println("Enter the amount to exchange:");
                double amount = scanner.nextDouble();

                System.out.println("Select transaction type: 1 - Buy, 2 - Sell");
                int operationType = scanner.nextInt();

                double result = calcRes(choice.getCurrency_codes(), amount, operationType);

                System.out.printf("Result: %.2f %s exchanged to %.2f EUR%n",
                        amount, choice.getCurrency_codes(), result);

                double marge = choice.getCurrent_exchange() * 0.05;
                transactions.add(new Transaction(transactions.size() + 1, choice.getCurrency_codes(), operationType == 2, LocalDate.now(), result, marge));
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
        }

    }

    @Override
    public Transaction addTrans(int num) {

        return null;
    }

    @Override
    public boolean removeTrans(int num) {
        return transactions.removeIf(t -> t.getNumber() == num);
    }

    @Override
    public Transaction findTrans(int num) {
        return transactions.stream()
                .filter(t -> t.getNumber() == num)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Transaction> findTransByDate(LocalDate dateFrom, LocalDate dateTo) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            LocalDate date = transaction.getDate();
            if ((date.isEqual(dateFrom) || date.isAfter(dateFrom)) &&
                    (date.isEqual(dateTo) || date.isBefore(dateTo))) {
                result.add(transaction);
            }
        }
        return result;
    }


    @Override
    public List<Transaction> findTransByType(boolean type) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.isType() == type) {
                result.add(transaction);
            }
        }
        return result;
    }


    @Override
    public int quantity() {
        return transactions.size();
    }


    @Override
    public double calcRes(String currencyCode, double amount, int operationType) {
       //поиск валюты по коду
        CurrencyExchange currency = CurrencyExchange.findByCode(currencyCode);
        if (currency == null) {
            throw new IllegalArgumentException("Currency with code " + currencyCode + " not found.");
        }

        double rate = currency.getCurrent_exchange();
        double marge = rate * 0.05;
        double rateWithMarge = (operationType == 2) ? (rate - marge) : (rate + marge);


        return (operationType == 2) ? amount * rateWithMarge : amount / rateWithMarge;
    }
//    @Override
//    public double calcRes(String name) {
////        Scanner scanner = new Scanner(System.in);
////
////        // спрашиваем у пользователя сумму валюты для обмена
////        System.out.println("Enter the number of the currency to be exchanged with: ");
////        double amount = scanner.nextDouble();  // сумма, кот. пользователь хочет обменять
//
//        CurrencyExchange currency = null; // ищем курс в enum
//        for (CurrencyExchange ce : CurrencyExchange.values()) {
//            if (ce.getCurrency_codes().equals(name)) // название валюты "name" передано в этот метод
//            {
//                currency = ce;
//                break;
//            }
//        }
//        // если валюта не найдена, сообщаем об этом и возвращаем 0
//        if (currency == null) {
//            System.out.println("Currency with code " + name + " not found");
//            return 0;
//        }
//
//        // получили курс из enum для валюты
//        double rate = currency.getCurrent_exchange();
//
//        double rateWithMargin = 0;
//
////        // уточняем тип операции (покупка или продажа) ?
////        System.out.println("Input the type of transaction (1 - buy, 2 - sell): ");
////        int operationType = scanner.nextInt();
//
//        //  1 - покупка, 2 - продажа
//        // считаем курс с маржей
//        double margin = rate * 0.05; // 5% от курса
//        if (operationType == 2) {  // продажа
//            //  маржа вычитается из курса
//            rateWithMargin = rate - margin;
//        } else {  // покупка
//            // маржа добавляется к курсу
//            rateWithMargin = rate + margin;
//        }
//
//        // Рассчитываем результат обмена с учетом маржи
//        double result = 0;
//        if (operationType == 2) {  // продажа
//            result = amount * rateWithMargin;  // продаем валюту и получаем евро
//        } else {  // покупка
//            result = amount / rateWithMargin;  // покупаем валюту за евро
//        }
//
//        // результат обмена
//        System.out.println("Exchange result: " + result + " EUR");  // результат в EUR
//        return result;
//
//    }

    @Override
    public double calcMarge(String name) {

        CurrencyExchange currency = CurrencyExchange.findByCode(name);
        if (currency == null) {
            throw new IllegalArgumentException("Currency with code " + name + " not found.");
        }
        double rate = currency.getCurrent_exchange();
        double marge = rate * 0.05;

        return marge;
    }

    @Override
    public void printTrans() {

    }
}
