package homework_12.array_methods_hw_12;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println( "Enter the number n: ");
        int n= scanner.nextInt();

        double sum = 0.0;

        for (int i=1; i <= n; i++){
            sum += 1.0/i;
        }
        System.out.println("Sum is: " + sum);
        }



    }

