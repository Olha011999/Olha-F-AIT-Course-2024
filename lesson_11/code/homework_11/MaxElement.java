package homework_11;
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.
public class MaxElement {

    public static void main(String[] args) {

        int [] element = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int maxElemen = element[0];
        int maxElementIndex = 0;

        for (int i = 0; i < element.length; i++){
        if (maxElemen < element[i]){
            maxElemen = element[i];
            maxElementIndex = i;
        }
        }
        System.out.println("Maximal elemebt is: "+ maxElemen);
        System.out.println("Index of maximal element is: "+ maxElementIndex);

        System.out.println("Given array");

        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] +" ");
        }
        int start = element[0];
        int end = element [9];
        element[0] = end;
        element [9] = start;

        System.out.println();
        System.out.println("Replacement of numbers:");

        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
        }
    }

