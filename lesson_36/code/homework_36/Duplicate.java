package homework_36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Duplicate {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20 ; i++) {

            numbers.add(random.nextInt(10)+1);
        }
        System.out.println("Duplicates: " + numbers);

        //delete duplicates
        HashSet<Integer> num = new HashSet<>(numbers);
        ArrayList<Integer> newNumbers = new ArrayList<>(num);

        System.out.println("No duplicate: " + newNumbers);
    }
}