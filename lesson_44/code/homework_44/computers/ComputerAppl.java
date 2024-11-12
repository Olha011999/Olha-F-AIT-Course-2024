package homework_44.computers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComputerAppl {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", "Inspiron", 2021, 750.00, 8, 256));
        computers.add(new Computer("Apple", "MacBook Air", 2020, 999.00, 8, 512));
        computers.add(new Computer("HP", "Pavilion", 2019, 600.00, 16, 512));
        computers.add(new Computer("Lenovo", "ThinkPad", 2022, 1200.00, 16, 1024));
        computers.add(new Computer("Asus", "ZenBook", 2021, 850.00, 8, 256));

        // отображаем все компьютеры
        computers.forEach(System.out::println);

        // отображаем компьютеры с RAM >= определенного значения
        int minRam = 8;
        computers.stream()
                .filter(comp -> comp.getRamSize() >= minRam)
                .forEach(System.out::println);

        // отображаем компьютеры дороже определенной цены
        double priceThreshold = 800;
        computers.stream()
                .filter(comp -> comp.getPrice() > priceThreshold)
                .forEach(System.out::println);

        // сортируем компьютеры по убыванию SSD размера
        computers.stream()
                .sorted(Comparator.comparingInt(Computer::getSsdSize).reversed())
                .forEach(System.out::println);

        // находим среднюю цену компьютеров
        double averagePrice = computers.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя цена компьютера: " + averagePrice);

        // группируем компьютеров по бренду
        Map<String, List<Computer>> computersByBrand = computers.stream()
                .collect(Collectors.groupingBy(Computer::getBrand));
        computersByBrand.forEach((brand, brandComputers) -> {
            System.out.println("Бренд: " + brand);
            brandComputers.forEach(System.out::println);
        });
    }
}
