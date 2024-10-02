package homework_12.array_methods_hw_12;

public class ArrayMethodsHW12 {

    public static double [] calculatePercent(double [] rest, double percent){

        double [] balance = new double[rest.length];
        for (int i = 0; i < balance.length; i++){
            balance[i] = rest[i] + (rest[i]*percent/100);
        }
        return  balance;
    }

    public static void printArrayDouble(int[] funds){

        for (int i = 0; i < funds.length; i++){
            System.out.print(funds[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------");
    }

    public static int sumArray (double[] array){

        int sum=0;
        for (int i = 0; i < array.length; i++){
            sum +=array[i];
        }
        return sum;
    }


    public static double averageValue(double[] array){

        double average = 0;
        for (int i = 0; i < array.length; i++){
           average += array[i];
        }
        return average/array.length;
    }


}
