package homework_36;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        ArrayList<Character> ch = new ArrayList<>();

        for (char leter = 'A'; leter <= 'Z'; leter++) {
            ch.add(leter);
        }
        System.out.println(ch);
    }


}
