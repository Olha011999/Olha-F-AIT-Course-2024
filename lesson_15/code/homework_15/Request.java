package homework_15;

import java.util.Scanner;

//Напишите программу, которая запрашивает строку от пользователя и затем:
public class Request {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String text = scanner.nextLine();

       //сообщает сколько слов в строке
        String[] arr = text.split(" ");
        System.out.println(arr.length + " words per line");

        //сообщает сколько букв (символов) в строке
        int lettersCount = text.length();
        System.out.println("Numbers of letters and symbols in sentence:" + lettersCount);

        //печатает строку задом наперед, начиная с последнего слова.
        String [] words = text.split(" ");
        System.out.println("Line in reverse order: ");
        for ( int i= words.length - 1; i>= 0; i--){
            System.out.println(words[i] + " ");
        }




    }
}
