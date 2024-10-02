package classwork_14;

public class ArrayMethodsAppl14 {

    public static void main(String[] args) {
        //create array with random numbers
        int[] myArray = ArrayMethods14.fillArray(0,100,10);

        //print array
        ArrayMethods14.printArray(myArray);

        //sort array
        ArrayMethods14.bubleSort(myArray);

        //print array
        ArrayMethods14.printArray(myArray);

        int[] newArray = ArrayMethods14.fillArray(1,20,6);
        ArrayMethods14.printArray(newArray);
        ArrayMethods14.reverseArray(newArray);
        ArrayMethods14.printArray(newArray);





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
        System.out.println(ArrayMethods14.linearSearch(myArray,10));
        System.out.println(ArrayMethods14.linearSearch(myArray,100));


        System.out.println("-----------------------");
        int index= ArrayMethods14.binarySearch(myArray,35);
        System.out.println(index);


    }
}
