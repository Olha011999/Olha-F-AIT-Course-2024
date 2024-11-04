package homework_37;

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;
import classwork_18.computer_shop.model.Smartphone;
import classwork_37.city_bus.Bus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayOfComputers {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Smartphone("A17 Pro", 8, 256, "Apple", 1200, 10,3, 10,"black", 25345342534253l));
        computerList.add(new Laptop("M2", 8, 256, "Apple AiBook", 2200, 14, 1.5, 10, "blue"));
        computerList.add(new Computer("i7", 8, 256, "Acer", 1200));
        computerList.add(new Computer("i5", 8, 256, "HP", 1200));
        computerList.add(new Computer("AMD", 8, 256, "NoName", 2000));
        computerList.add(new Laptop("Apple", 8, 256, "MacBook", 2000, 14,1.5, 10, "white"));
        computerList.add(new Laptop("Apple", 16, 512, "MacBook Air", 2500, 14.2, 1.8, 12,"blau"));

        //print
        for (Computer computer : computerList) {
            System.out.println(computer);
        }
        //or
        // computerList.forEach(System.out::println);

        System.out.println("---------sort by brand--------------");

        computerList.sort(new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        System.out.println("---------sort by RAM and SSD--------------");
        computerList.sort(new Comparator<Computer>() {
            @Override
            public int compare(Computer c1, Computer c2) {
                int ramComparison = Integer.compare(c1.getRam(), c2.getRam());
                if (ramComparison != 0) {
                    return ramComparison;
                }
                // If RAM is the same, sort by SSD
                return Integer.compare(c1.getSsd(), c2.getSsd());
            }
        });
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        System.out.println("-----Total Total Volume and Average SSD Value-----------");

        int totalSsd = 0;
        double averageSsd = 0;

        for (Computer computer : computerList) {
            totalSsd += computer.getSsd();
            averageSsd = totalSsd/ (double) computerList.size();
        }
        System.out.println("Total SSD capacity: " + totalSsd);
        System.out.println("Average SSD capacity:: " + averageSsd);



//        computerList.sort(Comparator.comparing(Computer::getSsd));
//        System.out.print(computerList);







    }
}
