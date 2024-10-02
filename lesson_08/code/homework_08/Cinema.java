package homework_08;

import java.util.Scanner;

//В кинотеатре есть разные типы билетов:
// стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость.
// Клиент может также выбрать место в VIP-зоне,
// что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента,
// статус студента и флаг VIP-места,
// а возвращает итоговую стоимость билета.
// Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a student?(true/false)");
        boolean student = scanner.nextBoolean();

        System.out.println("Are you a pensioner? (true/false)");
        boolean pensioner = scanner.nextBoolean();

        System.out.println("Do you want a VIP ticket? (true/false)");
        boolean vip = scanner.nextBoolean();

        double price = calculateTicketPrice(student, pensioner, vip);
        System.out.println("Total cost of tickets:" + price + " Euro");

    }

    public static double calculateTicketPrice(boolean student, boolean pensioner, boolean vip) {

        double startingPrice = 30;


        if (student) {
            startingPrice = startingPrice - (startingPrice * 0.1);
            System.out.println("The price of a ticket for a student is: " + startingPrice + "Euro");
        } else if (pensioner) {
            startingPrice = startingPrice - (startingPrice * 0.25);
            System.out.println("The price of a ticket for a pensioner is: " + startingPrice + "Euro");
        } else if (vip) {
            startingPrice = startingPrice + (startingPrice * 0.25);
            System.out.println("The price of a VIP ticket is: " + startingPrice + "Euro");
        } else {
            System.out.println("Unfortunately we cannot process your data, please try again.");
        }

        return startingPrice;
    }
}