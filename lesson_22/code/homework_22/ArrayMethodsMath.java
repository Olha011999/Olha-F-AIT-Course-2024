package homework_22;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class ArrayMethodsMath {

    private int[] array;


    public ArrayMethodsMath(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayMethodsMath{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayMethodsMath that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }



    public int[] generateRandomArray(){
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }


    public int countPositiveNumbers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] > 0){
                count++;
            }

        }
        return count;
    }



    public int countNegativeNumbers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 0){
                count++;
            }

        }
        return count;
    }

    public int countEvenNumbers(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] %2 == 0){
                count++;
            }

        }
        return count;
    }


    public int countZeros(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array [i] == 0){
                count++;
            }

        }
        return count;
    }

}
