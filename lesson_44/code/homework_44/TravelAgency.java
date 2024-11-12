package homework_44;

import java.util.*;

public class TravelAgency {

    private static final Set<String> COUNTRIES = Set.of(
            "Spain", "France", "Italy", "Greece", "Turkey", "Tunis"
    );

    public static void main(String[] args) {
        List<Tourist> tourists = getTourists();

        // наиболее популярные страны
        Map<String, Integer> popularСountry = new HashMap<>();
        for (Tourist tourist : tourists) {
            for (String country : tourist.getCountries()) {
                if (COUNTRIES.contains(country)) {
                    popularСountry.put(country, popularСountry.getOrDefault(country, 0) + 1);//Метод getOrDefault(country, 0) + 1используется в нескольких работах с картой ( Map) в Java, чтобы безопасно получить значение по ключу, а если ключ отсутствует, вернуть значение по умолчанию (в данном случае 0), а затем увеличить это значение на 1.
                }
            }
        }

        // выводим популярные страны
        System.out.println("Популярные страны:");
        popularСountry.entrySet().stream()//Метод entrySet()позволяет получить ключ и значение карты за один шаг
                .sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue()) // Сортируем по популярности
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // турист, посетивший наибольшее количество стран
        Tourist mostTravelledTourist = null;
        int maxCountriesVisited = 0;
        for (Tourist tourist : tourists) {
            // Считаем уникальные страны
            long uniqueCountries = tourist.getCountries().stream()
                    .filter(COUNTRIES::contains)
                    .distinct()// метод, который фильтрует потоки, оставляя только отдельные элементы, чтобы удалить все дубли.
                    .count();

            if (uniqueCountries > maxCountriesVisited) {
                maxCountriesVisited = (int) uniqueCountries;
                mostTravelledTourist = tourist;
            }
        }

        // Выводим туриста с наибольшим количеством стран
        System.out.println("\nТурист, посетивший наибольшее количество стран Средиземноморья:");
        System.out.println(mostTravelledTourist);
    }

    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }
}

class Tourist {
    private String name;
    private List<String> countries;

    public Tourist(String name, String... countries) {
        this.name = name;
        this.countries = List.of(countries);
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Tourist{name='" + name + "', countries=" + countries + "}";
    }
}
