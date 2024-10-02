package homework_06;

import java.util.Scanner;

//Пользователь с клавиатуры вводит число от 1 до 12,
// программа сообщает, какому времени года принадлежит введенный месяц.
public class SeasonsOfTheYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the month number from 1 to 12: ");
        int month= scanner.nextInt();


        switch (month){
        case 12, 1, 2 ->{
            System.out.println( "Refers to the month entered: Winter");
            break;
        }
            case 3, 4, 5 ->{
                System.out.println("Refers to the month entered: Spring");
                break;
            }
            case 6, 7, 8 ->{
                System.out.println("Refers to the month entered: Summer");
                break;
            }
            case 9, 10, 11 ->{
                System.out.println("Refers to the month entered: Autumn");
                break;
            }
            default ->{
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }
        }


    }
}
