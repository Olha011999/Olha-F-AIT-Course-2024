package classwork_11;

//Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
//Найдите минимальный элемент массива и его индекс.
//Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
//Найдите максимальный элемент массива и его индекс.
//Поменяйте местами минимальный и максимальный элементы, распечатайте массив.
public class Task1 {

    public static void main(String[] args) {


        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int minOfArray = array[0];// guess
        int indexOfMinElevent = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOfArray) {
                minOfArray = array[i];
                indexOfMinElevent = i;
            }

        }
        System.out.println("Min element of array = " + minOfArray + ", index of min element= " + indexOfMinElevent);


        int maxOfArray = array[0];// guess
        int indexOfMaxElevent = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElevent = i;
            }

        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element= " + indexOfMaxElevent);
        int temp = array[indexOfMinElevent];
        array[indexOfMinElevent] = array[indexOfMaxElevent];
        array[indexOfMaxElevent] = temp;

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();// next line
    }
}
