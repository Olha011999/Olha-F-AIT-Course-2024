package classwork_12.array_mathods;

import java.util.Scanner;

public class ArrayMethodsAppl13 {

    public static void main(String[] args) {
        //create array wiyh random numbers
        int[] myArray = ArrayMethods13.fillArray(0,100,10);

        //print array
        ArrayMethods13.printArray(myArray);

        //sort array
        ArrayMethods13.bubleSort(myArray);

        //print array
        ArrayMethods13.printArray(myArray);





//        int[] myArray = ArrayMethods13.fillArray(10,20,30);
//
//        ArrayMethods13.printArray(myArray);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number for searching: ");
//        int n =scanner.nextInt();
//
//        boolean isInArray = ArrayMethods13.searchInArray(myArray, n);
//        System.out.println("Nymber "+n+ "is in array: "+ isInArray);

       // int[] myArray = {10, 20, 30, 40, 50};
        System.out.println(ArrayMethods13.linearSearch(myArray,10));
        System.out.println(ArrayMethods13.linearSearch(myArray,100));


        System.out.println("-----------------------");
        int index= ArrayMethods13.binarySearch(myArray,35);
        System.out.println(index);


    }
}
