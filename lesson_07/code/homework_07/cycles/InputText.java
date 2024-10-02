package homework_07.cycles;

import java.util.Scanner;

//Задача 1. Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
public class InputText {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a text: ");
        String text= scanner.nextLine();
        System.out.println("How many times?: ");
        int number= scanner.nextInt();

        while (number>0){

            System.out.println(text+ " , " +number);
            number--;

        }
    }

}
