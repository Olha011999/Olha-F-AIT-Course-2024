package homework_10;

//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
// Распечатать массив в порядке возрастания, затем в порядке убывания.
public class EvenNumbers {

    public static void main(String[] args) {

        int[] evenNumbers = new int[26];// массив для четных чисел (50:2+1)
        int number = 0;//позиция в массиве, по которой будем отслеживать четные числа

        //заполняем массив четными цифрами
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumbers[number] = i;
                number++;
            }
        }
        System.out.println("Print paired digits in ascending order: " );
        for (int i=1; i < evenNumbers.length; i++ ){
            System.out.print(evenNumbers[i] + " ");// печатаем число
        }

        System.out.println();
        System.out.println("Print paired digits in decrease order: " );
        for (int i= evenNumbers.length - 1; i >0; i-- ){
            System.out.print(evenNumbers[i] + " ");
        }

    }

}
