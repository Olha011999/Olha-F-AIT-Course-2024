package homework_37.Planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {
    public static void main(String[] args) {

        List<Planets> planets = new ArrayList<>();
        planets.add(new Planets("Mercury", 57.9, 0.33, 0));
        planets.add(new Planets("Venus", 108.2, 4.87, 0));
        planets.add(new Planets("Earth", 149.6, 5.97, 1));
        planets.add(new Planets("Mars", 227.9, 0.642, 2));
        planets.add(new Planets("Jupiter", 778.5, 1898.0, 79));
        planets.add(new Planets("Saturn", 1434.0, 568.0, 83));
        planets.add(new Planets("Uranus", 2871.0, 86.8, 27));
        planets.add(new Planets("Neptune", 4497.1, 102.0, 14));

        for (Planets planet : planets) {
            System.out.println(planet);

        }


        System.out.println("-----Sorted by order of location in the solar system-----");
        planets.sort( new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getDistanceToSun(), o2.getDistanceToSun());
            }
        });
        for (Planets planet : planets) {
            System.out.println(planet);

        }

        System.out.println("-----Sorted alphabetically-----");
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Planets planet : planets) {
            System.out.println(planet);

        }

        System.out.println("-----Sorted by weight-----");
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
        for (Planets planet : planets) {
            System.out.println(planet);

        }


        System.out.println("-----Sort by number of satellites-----");
        planets.sort(new Comparator<Planets>() {
            @Override
            public int compare(Planets o1, Planets o2) {
                return Integer.compare(o1.getNumberOfSatellites(), o2.getNumberOfSatellites());
            }
        });
        for (Planets planet : planets) {
            System.out.println(planet);

        }
    }
}
