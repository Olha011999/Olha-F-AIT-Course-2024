package homework_21.elemebtsOfArray;

public class ElementaOfArray {

    public static int minElementInArray(int[] array){

        if (array.length ==0){
            System.out.println("Array missing!");
        }
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]){
                minElement = array[i];
            }
        }return minElement;
    }


    public static int maxElementInArray(int[] array){

        if (array.length ==0){
            System.out.println("Array missing!");
        }
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]){
                maxElement = array[i];
            }
        }return maxElement;
    }


    public static int minIndexInArray(int[] array){

        if (array.length ==0){
            System.out.println("Array missing!");
        }
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] > array[i]){
                minIndex = i;
            }
        }return minIndex;



    }


    public static int maxIndexInArray(int[] array){

        if (array.length ==0){
            System.out.println("Array missing!");
        }
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]){
                maxIndex = i;
            }
        }return maxIndex;



    }
}
