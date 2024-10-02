package homework_08;

import java.util.Scanner;

//Oпределение времени суток. Напишите программу,
// которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print time of day from 0 to 23 hour: ");
        int hour= scanner.nextInt();

        if (hour>0 && hour<6){

            System.out.println("Good night!");
        } else if (hour>6 && hour<12) {
            System.out.println("Good morning!");
        } else if (hour>12 && hour<18) {
            System.out.println("Good afternoon!");
        } else if (hour>1 && hour<0) {
            System.out.println("Good evening!");
        }else
            System.out.println("Please enter time from 0 to 23. Other data entered is incorrect!!!");


    }
}
