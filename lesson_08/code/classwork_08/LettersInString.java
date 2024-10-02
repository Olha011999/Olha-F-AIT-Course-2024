package classwork_08;
//Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строкина новой строчек.
//Используйте методы length и charAt() класса String.
import java.util.Scanner;

public class LettersInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input String: ");
        String str = scanner.nextLine();
        System.out.println(str);

        int l= str.length();
        System.out.println(l);
        int i=0;

        // OlhaFatina
        // 0123456789


        while (i<l){
            System.out.println(str.charAt(i));
            i++;//i=i+1


        }



    }
}
