package homework_38;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GermanAppl {
    public static void main(String[] args) {

        List<String> cities = new LinkedList<>();

        cities.add("Berlin");
        cities.add("Munich");
        cities.add("Dresden");
        cities.add("Stuttgart");
        cities.add("Dusseldorf");

        System.out.println("Cities: " + cities);

        cities.addFirst("Hanover");
        System.out.println("After adding Hanover the beginning: " + cities);

        int middle = cities.size()/2;
        cities.add(middle, "Hanover");
        System.out.println("After adding Hanover in the middle: " + cities);

        cities.addLast("Hanover");
        System.out.println("After adding Hanover to the end: " + cities);

        Collections.sort(cities);
        System.out.println("Cities sorted alphabetically: " + cities);

        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("Sorted cities in reverse order: " + cities);



    }
}
