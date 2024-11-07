package homework_41;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        // Создание карты Map с целочисленными ключами и строковыми значениями
        Map<Integer, String> map = new HashMap<>();

        // Добавление пар "ключ-значение" в карту
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");

        // Получение значений по ключу
        String string1 = map.get(1);
        String string2 = map.get(2);
        String string3 = map.get(3);

        // Вывод значений
        System.out.println("String with key 1: " + string1);
        System.out.println("String with key 2: " + string2);
        System.out.println("String with key 3: " + string3);

        // Перебор с использованием entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Преобразование ключей в список
        List<Integer> keyList = new ArrayList<>(map.keySet());
        // Преобразование значений в список
        List<String> valueList = new ArrayList<>(map.values());
        // Преобразование пар ключ-значение в список
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        // Вывод списков
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
        System.out.println("Entry List: " + entryList);

        // Сортировка ключей
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getKey));
        System.out.println("Sorted by keys: " + list);

        // Сортировка по значениям
        List<Map.Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        System.out.println("Sorted by values: " + list1);
    }
}

