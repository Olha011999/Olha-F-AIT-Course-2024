package classwork_12.array_mathods;
//  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - поиск элемента

public class ArrayMethods {

    //fill array  random numbers наполнять
    // a- left boarder,
    //b- right border,
    // n-quantity количество
    public static int[] fillArray(int a, int b, int n) {

        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }
    //print array

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
    }


    //search in array
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }




}
