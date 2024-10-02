package classwork_06;

import java.util.Scanner;

public class Month {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    //Приглашение пользователю
        System.out.println("Input number of month, please: ");
    int choice = scanner.nextInt();

        switch(choice){


        case 1 -> System.out.println("This is January ");
        case 2 -> System.out.println("This is Febuary ");
        case 3 -> System.out.println("This is March ");
        }
    }

}

