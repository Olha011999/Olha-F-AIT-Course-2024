package classwork_10;
//Создайте массив и заполните его символами латинского алфавита от A до Z.
//Раcпечатайте полученный массив.
public class Alphabet {

    public static void main(String[] args) {

char[]alphabet= new char[26];

for (int i=0; i< alphabet.length; i++){
    alphabet [i] = (char) (65 + i);
    System.out.print(alphabet[i] + " ");

}


    }
}
