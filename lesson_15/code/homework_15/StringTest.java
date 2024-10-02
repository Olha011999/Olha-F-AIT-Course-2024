package homework_15;
//Задача 1. Дана строка "I'm proud to learn Java! Java is the most
// famous programming language!!!" Выполнить практикум с этой строкой:

//Проверить, начинается ли строка подстрокой “I'm proud”.
public class StringTest {

    public static void main(String[] args) {

        //Распечатать последний символ строки.
        String text = "I'm proud to learn Java! Java is the most famous programming language!!!";
        char lastSymbol = text.charAt(text.length() - 1);
        System.out.println("Last symbol: " + lastSymbol);

        //Найти позицию подстроки “Java” в строке.
        System.out.println();
        System.out.println(text);
        int index = text.indexOf("Java");
        System.out.println("Position of the substring “Java” in the string: " + index);

        //Проверить, содержит ли заданная строка подстроку “Java”.
        System.out.println();
        boolean contains = text.contains("Java");
        System.out.println("Does the given string contain the substring 'Java': " +contains);

        //Заменить все символы “o” на “a”.
        System.out.println();
        System.out.println("Source: " +text);
        String newText = text.replace("o", "a");
        System.out.println("Replaced all 'o' symbols with 'a': " +newText);

        //Преобразуйте строку к верхнему регистру.

        String newText2 = text.toUpperCase();
        System.out.println("Converted string to uppercase: " + newText2);

        //Преобразуйте строку к нижнему регистру.
        String newText3 = text.toLowerCase();
        System.out.println("Converted string to lowercase: " +newText3);

        //Вырезать подстроку Java c помощью метода substring().
        index = text.indexOf("Java");
        int endWord =index + "Java".length();
        String word = text.substring(index, endWord);
        System.out.println("Cut out a substring: " +word);

        //Проверить, заканчивается ли строка подстрокой “!!!”.

        boolean str = text.endsWith("!!!");
        System.out.println("Does the string end with the substring '!!!': " + str);

        //Проверить, начинается ли строка подстрокой “I'm proud”.

        boolean str2 = text.startsWith("I'm proud");
        System.out.println("does the string start with the substring “I'm proud”: " + str2);
    }
}
