package homework_06;

import java.util.Scanner;

// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$. За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.
public class calculatingThePayment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //// Ввод количества лет стажа
        System.out.println("Input how many years the employee has worked: " + " years");
        int yearsWork = scanner.nextInt();

// Базовая зарплата
        double basesalary = 500;

switch (yearsWork){
    case 1,2->{

        basesalary= basesalary;
        System.out.println("For those working less than 3 years: " +basesalary);
        break;
    }
    case 3, 4->{

        basesalary= basesalary+basesalary*10/100;
        System.out.println("For 3 years of work with 10% bonus: " +basesalary);
        break;
    }
    case 5, 6, 7, 8, 9->{

        basesalary= basesalary+basesalary*50/100;
        System.out.println("For 5 years of work with 50% bonus: " +basesalary);
        break;
    }
    case 10, 11, 12, 13, 14->{

        basesalary= basesalary+basesalary*100/100;
        System.out.println("For 10 years of work with 100% bonus: " +basesalary);
        break;
    }
    case 15, 16, 17, 18, 19, 20, 21, 22, 23, 24->{

        basesalary= basesalary+basesalary*150/100;
        System.out.println("For 15 years of work with 150% bonus: " +basesalary);
        break;
    }
    default->{
        System.out.println("Wrong input!");
    }
}
    }
}
