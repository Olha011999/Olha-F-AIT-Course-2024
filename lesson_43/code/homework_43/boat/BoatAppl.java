package homework_43.boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BoatAppl {

    public static void main(String[] args) {
        // Создаем набор яхт
        List<Boat> boats = new ArrayList<>();
        boats.add(new Boat("Yamaha", "Japan", 2020, 15.5, "Plastic", 25000));
        boats.add(new Boat("Sunseeker", "UK", 2018, 20.0, "Metal", 45000));
        boats.add(new Boat("Beneteau", "France", 2019, 18.5, "Wood", 40000));
        boats.add(new Boat("Jeanneau", "France", 2021, 17.0, "Plastic", 27000));
        boats.add(new Boat("Ferretti", "Italy", 2015, 22.0, "Metal", 55000));

        //  Отображаем все яхты
        System.out.println("Все яхты:");
        boats.forEach(System.out::println);

        // Отображаем яхты, сделанные из указанного материала корпуса
        String material = "Plastic";
        System.out.println("\nЯхты из материала корпуса " + material + ":");
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);

        // Отображаем яхты дороже указанной цены
        double priceThreshold = 30000;
        System.out.println("\nЯхты дороже " + priceThreshold + ":");
        boats.stream()
                .filter(boat -> boat.getCost() > priceThreshold)
                .forEach(System.out::println);

        // Отображаем яхты, чей год выпуска находится в заданном диапазоне
        int yearStart = 2018;
        int yearEnd = 2021;
        System.out.println("\nЯхты, выпущенные с " + yearStart + " по " + yearEnd + ":");
        boats.stream()
                .filter(boat -> boat.getYear() >= yearStart && boat.getYear() <= yearEnd)
                .forEach(System.out::println);

        // Сортируем яхты в порядке убывания стоимости
        System.out.println("\nЯхты, отсортированные по убыванию стоимости:");
        boats.stream()
                .sorted(Comparator.comparingDouble(Boat::getCost).reversed())
                .forEach(System.out::println);

        // Среднюю стоимость яхты из созданного набора
        double averageCost = boats.stream()
                .mapToDouble(Boat::getCost)
                .average()
                .orElse(0.0);
        System.out.println("\nСредняя стоимость яхты: " + averageCost);

        // Сколько и какие яхты под каким флагом стоят в порту
        System.out.println("\nЯхты по странам (флаг):");
        Map<String, List<Boat>> boatsByCountry = boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry));
        boatsByCountry.forEach((country, countryBoats) -> {
            System.out.println("Флаг: " + country);
            countryBoats.forEach(System.out::println);
        });
    }
}
