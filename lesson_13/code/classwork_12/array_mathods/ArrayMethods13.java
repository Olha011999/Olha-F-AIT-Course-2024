package classwork_12.array_mathods;
//_____________________________________________
//  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - поиск элемента

public class ArrayMethods13 {

//    //array turn around, reverse
//    //step 1 -method swap
//    public static void swap(int[] array, int i, int j){
//        int temp = array[j];
//        array[j]= array[j+1];
//        array[j+1] = temp;
//    }
//
//    //step 2 -reverse array
//    public static void  reverseArray(int[]array){
//        for (int i = 0; j= array.length-1; i < j; i++; j--){
//            swap(array, i, j);
//        }
//    }




    //buble sort

    //- сравниваем всегда 2 соседних элемента,
    // переставляем их местами, если они расположены не в порядке возрастания
    //- цикл должен идти слева направо
    //- упорядоченные элементы выключаются из цикла

    public static void bubleSort(int[]array){

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array.length-1-i; j++){
                if (array[j] > array[j+1]){// compare 2 elements of array, ig left
                    //elevent> right then swap
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }



    //--------------------------------
//0(n) чеm больше элементов массива , тем дольше работает метод
    //linear seRCH, RETURN INDEX (IF ELEMENT ABSeNT RETURN -1)

    public static int linearSearch (int[] array, int n){

        for (int i = 0; i < array.length; i++) {
        if ( array[i] ==n){
            return i;// go out from methos
        }
        }
        return  -1;
    }
    //O(log(n))
    //binary search

    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length-1;

        while (leftIndex<= rightIndex){

            int midIndex = (leftIndex + rightIndex)/2;
            if (array[midIndex] == n){
                return midIndex;
            }else if (n< array[midIndex]){
                rightIndex=midIndex-1;//правую надо отбросить
            }else {
                leftIndex = midIndex + 1; //левую надо отбросить
            }

        }
        return -leftIndex - 1; //усли не нашлось
    }


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
