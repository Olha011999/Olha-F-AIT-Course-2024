package classwork_07.cycles;

import java.util.Scanner;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.
public class Digits {

    public static void main(String[] args) {

        //5 467
        // 5 467 % 10= 7  это первая справа цифра числа
        // 5 467/10= 546
        // продолжим в цикле деления на 10 пока результат >0

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input positive integer number: ");

        int number=scanner.nextInt();
        int number1 =number;

        int count= 0;

        while (number>0){

            number= number/10;// параметр цикла
            System.out.println(number);
            count= count+1;// count++



        }
        System.out.println("Digits in number "+number1+ " are ="+count);


    }
}
