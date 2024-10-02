package homework_06;

import java.util.Scanner;

public class Salary {
    // Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$. За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many years have you been working?");
        int years = scanner.nextInt();
        double salary = 500;
        double finalSalary = totalSalaty(salary, years);

        System.out.println("Your total salary with rabate is:" + finalSalary);
    }

    public static double totalSalaty(double salary, int years) {
        double bonus = 0;
        if (years >= 15) {
            bonus = 150;
        } else if (years >= 10) {
            bonus = 100;
        } else if (years >= 5) {
            bonus = 50;
        } else if (years >= 3) {
            bonus = 10;
        }
        return salary + (salary * bonus / 100);

    }
}


