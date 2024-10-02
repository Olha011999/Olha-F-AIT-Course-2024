package homework_09;

import java.util.Scanner;

//Написать программу, выводящую на экран максимальное из трех целых чисел.
// Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.
public class maxOfThree {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double num1= scanner.nextDouble();

        System.out.println("Enter 2nd number: ");
        double num2= scanner.nextDouble();

        System.out.println("Enter 3rd number: ");
        double num3= scanner.nextDouble();

        //ternary method

        double max= (num1 > num2)?((num1 > num3) ? num1:num3): ((num2 > num3) ? num2:num3);
        System.out.println("Max (ternary)"+ max);

        //if else

        if (num1 > num2 && num1 > num3){
            System.out.println("The maximum number is" +num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The maximum number is" +num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("The maximum number is" +num3);
        }


    }
}
