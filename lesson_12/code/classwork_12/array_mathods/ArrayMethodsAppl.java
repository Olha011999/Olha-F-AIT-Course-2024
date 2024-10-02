package classwork_12.array_mathods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods13.fillArray(10,20,30);

        ArrayMethods13.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n =scanner.nextInt();

        boolean isInArray = ArrayMethods13.searchInArray(myArray, n);
        System.out.println("Nymber "+n+ "is in array: "+ isInArray);



    }
}
