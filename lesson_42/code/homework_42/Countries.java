package homework_42;

import java.util.HashMap;
import java.util.Map;

public class Countries {

    public static void main(String[] args) {

        // Создаем и заполняем Map с названиями стран и их континентами
        Map<String, String> countries = new HashMap<>();
        countries.put("Ukraine", "Europe");
        countries.put("France", "Europe");
        countries.put("Germany", "Europe");
        countries.put("China", "Asia");
        countries.put("Japan", "Asia");
        countries.put("India", "Asia");
        countries.put("Egypt", "Africa");
        countries.put("Nigeria", "Africa");
        countries.put("South Africa", "Africa");
        countries.put("Brazil", "South America");
        countries.put("Argentina", "South America");
        countries.put("Chile", "South America");
        countries.put("USA", "North America");
        countries.put("Canada", "North America");
        countries.put("Mexico", "North America");
        countries.put("Australia", "Oceania");
        countries.put("New Zealand", "Oceania");
        countries.put("Papua New Guinea", "Oceania");
        countries.put("Greenland", "North America");
        countries.put("Madagascar", "Africa");

        // Map для подсчета количества стран на континентах
        Map<String, Integer> continentCount = new HashMap<>();

        // Подсчет количества стран на каждом континенте
        countries.values().forEach(continent ->
                continentCount.put(continent, continentCount.getOrDefault(continent, 0) + 1)//getOrDefault возвращает значение, связанное с указанным ключом (continent)
        );

// Выводим результат
        continentCount.forEach((continent, count) ->
                System.out.println(continent + ": " + count + " countries")
        );
    }
}


