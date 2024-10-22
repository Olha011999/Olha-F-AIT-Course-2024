package homework_29.odd_even_comparator;

import homework_10.Array;

import java.util.Arrays;
import java.util.Random;

public class Compare {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        System.out.println("--------------");
        // Sort the array using OddEvenComparator
        Arrays.sort(numbers, new OddEvenComparator());

        System.out.println("Sorted array: ");
        printArray(numbers); // Используем метод для печати массива
    }

    // Метод для печати массива
    private static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); //there is no comma after the last element
            }
        }
    }
}