package homework_22;

import java.util.Objects;
import java.util.Scanner;

public class ArrayMethods {

    private int[] array;

    public ArrayMethods(int[] array) {
        this.array = array;
    }



    public int[] getArray() {
        return array;
    }

    public void setArray(int array) {
        this.array = new int[]{array};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayMethods that)) return false;
        return array == that.array;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(array);
    }

    @Override
    public String toString() {
        return "ArrayMethods{" +
                "array=" + array +
                '}';
    }



    public int sumOfElementsWithOddIndex(int[] array){

        int sum = 0;

        for (int i = 1; i <array.length ; i+=2) {
            sum += array[i];
        }
        return sum;
    }


    public int getFifthElement (int[] array){

        if (array.length < 5){
            System.out.println("The array is too small to contain 5 elements.");
        }
        return array[4];
    }


}
