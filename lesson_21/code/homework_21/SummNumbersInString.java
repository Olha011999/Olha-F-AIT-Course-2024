package homework_21;

import java.util.Scanner;
//Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
public class SummNumbersInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers with space: ");

        String number = scanner.nextLine();
        int res = 0;

        String num = ""; // переменная для хранения текущего числа

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (ch != ' ') {//если это не пробел, добавляем символ к текущему числу
                num += ch;
            } else {
                res += Integer.parseInt(num);//преобразуем и суммируем число
                num = "";//обнуляем для следующего числа
            }

        }
        //добавляем последнее число (если не было пробела в конце)
        if (!num.isEmpty()){
            res += Integer.parseInt(num);
        }
        System.out.println("The sum of all the numbers typed in a row: " + res);

    }
}
