package homework_10;
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.
public class MinimalArrayNumber {

    public static void main(String[] args) {

        int [] num = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int minNum = num[0];
        int indexMin = 0;

        for(int i = 0; i < num.length; i++) {
            if (num[i] < minNum){
                minNum = num[i];
                indexMin = i;
            }
        }
        System.out.println(" Minimal number is " + minNum+ " and index of minimum number: " + indexMin);
    }
}
