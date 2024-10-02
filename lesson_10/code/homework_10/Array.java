package homework_10;

import java.util.Random;

//Создайте массив из 20 случайных(*) целых чисел в интервале
// от 10 до 30. Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива
// и снова выведите массив на печать.
public class Array {
    public static void main(String[] args) {

        // массив из 20 чисел
        int[] numbers = new int[20];
        Random random = new Random();// генератор случайных чисел

        System.out.println("Random numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] =(int) random.nextInt(20) + 10;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int first = numbers[19];
        int last = numbers[0];
        numbers[19]=last;
        numbers[0] = first;

        System.out.println("Replacement of numbers:");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
