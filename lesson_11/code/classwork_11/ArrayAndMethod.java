package classwork_11;

//Задача 3 (*).
//Написать метод, принимающий массив целых чисел,
// и возвращающий среднее арифметическое
//всех его элементов.
//Проверьте его работу на массиве ageOfGroup =
// {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
public class ArrayAndMethod {

    public static void main(String[] args) {
        int[] ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
        double average = averageAge(ageOfGroup);
        System.out.println(average);

    }

    private static double averageAge(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;

    }


}
