package homework_12.array_methods_hw_12;

import java.util.Scanner;

public class ArrayMethodsApplHW12 {
    public static void main(String[] args) {

        double[] balance = {650, 65, 800, 1098};
        int[] newBalance = new int[balance.length];


        double[] testArrayHW = ArrayMethodsHW12.calculatePercent(balance, 5);
        System.out.print("Balance of funds in the account with interest: " );


        ArrayMethodsHW12.printArrayDouble(newBalance);

        double sum = ArrayMethodsHW12.sumArray(balance);
        System.out.println("Sum of all elements of the array: " +sum);

        double average = ArrayMethodsHW12.averageValue(balance);
        System.out.println("Average value of array elements: " +average);
    }
}
