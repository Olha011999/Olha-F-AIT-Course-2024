package homework_36;

import java.util.Random;

public class BubleSort {
    public static void main(String[] args) {

        int[] size = {10, 100, 1000};

        for (int i = 0; i < size.length; i++) {
            int[] array = randomArray(size[i]);
            int count = bubleSort(array);

            System.out.println("Number of operations performed: " + count);
            System.out.println("Array size: " + size[i]);
            System.out.println();
        }

    }

    public static int[] randomArray(int size){
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);

        }
        return array;

    }

    public static int bubleSort(int [] array){
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                count++;
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j +1] = temp;
                    flag = true;
                }
            }
        }
        return count;
    }
}
