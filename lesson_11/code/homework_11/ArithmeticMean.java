package homework_11;
//Написать метод, принимающий массив целых чисел,
// и возвращающий среднее арифметическое всех его элементов.
// Проверьте его работу на массиве ageOfGroup =
// {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
public class ArithmeticMean {

    public static void main(String[] args) {
        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        double arithmeticMean= totalArithmetic (ageOfGroup);

        System.out.println("Arithmetic mean of all numbers: " +arithmeticMean);
    }

    public static double totalArithmetic (int [] ageOfGroup){
        int sum = 0;
        for (int i = 0; i < ageOfGroup.length; i++){
            sum = sum + ageOfGroup[i];
        }
        return (double) sum / ageOfGroup.length;

    }
}
