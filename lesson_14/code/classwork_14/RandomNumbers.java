package classwork_14;

import classwork_12.array_mathods.ArrayMethods13;

public class RandomNumbers {
//    Задача 1.**
//    Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//    Выполните сортировку полученного массива.
//    Попало ли число 0 в этот массив? (выяснить с помощью binary search)
//    Если да, то на какое место (индекс) в массиве?
//    Если нет, то на какой индекс его следует поставить?

    public static void main(String[] args) {

        int[] numbers = new int[20];

        numbers = ArrayMethods13.fillArray(-100,100,20);

        ArrayMethods13.printArray(numbers);
        ArrayMethods13.bubleSort(numbers);
        ArrayMethods13.printArray(numbers);
        int index= ArrayMethods13.binarySearch(numbers, 0);// n iskomiy element
        System.out.println(index);
        index = (index > 0) ? index : -index -1;
        System.out.println(index);
    }
}
