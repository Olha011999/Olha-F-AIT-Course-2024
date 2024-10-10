package homework_21;
//Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
////количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.
import java.util.Scanner;

public class Line {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String str = scanner.nextLine();

        int nChars = str.length();//количество символов в строке;
        int countUpperCase = 0;
        int countDidit = 0;
        int countSpases = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (Character.isUpperCase(ch)){
                countUpperCase ++;
            }
            if (Character.isDigit(ch)){
                countDidit ++;
            }
            if (ch == ' '){
                countSpases ++;
            }
        }

        System.out.println("Number of characters per line: " +nChars);

        System.out.println("Number of uppercase characters: " + countUpperCase);

        System.out.println("Number of digits in a line: " + countDidit);

        System.out.println("Number of spaces in a line: " + countSpases);

        //определяем тип предложения по последнему символу
        char lastChar = str.charAt(str.length() - 1);

        String stringType = "Unknown";

        if (lastChar == '.'){
            stringType = "Declarative";
        } else if (lastChar == '?'){
            stringType = "Interrogative";
        } else if (lastChar == '!'){
            stringType = "Exclamatory";
        }


        System.out.println("This sentence is: " + stringType);

        }


    }

