package homework_13;

public class ArrayHW13 {

    public static int [] copyOfArray (int[] array, int newLength){

        int [] newArray = new int[newLength];
        for (int i = 0; i < array.length && i < newArray.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

}
