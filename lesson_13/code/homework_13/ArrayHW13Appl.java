package homework_13;

public class ArrayHW13Appl {

    public static void main(String[] args) {
        int [] arrayToday = {1, 4, 7, 7, 3};

        int[] newArrayToday = ArrayHW13.copyOfArray(arrayToday,4);
        System.out.println(arrayToday);

        for (int i = 0; i < newArrayToday.length; i++){

            System.out.println(newArrayToday[i] + " ");
        }
    }
}
