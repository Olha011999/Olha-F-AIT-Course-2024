package classwork_41.treeset;

import java.util.*;

public class TreeSetInteger {
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, -80, -230, 0));

        TreeSet<Integer> numbers = new TreeSet<>(num);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.add(13);
        numbers.add(100500);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println(numbers.first()); // -230
        System.out.println(numbers.last()); // 100500

        System.out.println(numbers.ceiling(5)); //10, используется для поиска наименьшего элемента в наборе, который больше или равен указанному значению
        System.out.println(numbers.contains(5)); // false
        System.out.println(numbers.floor(5)); // 0, служит базой для поиска ближайшего меньшего или равного значения.

        System.out.println(numbers.tailSet(5)); // 10, 13, ..., используется для получения подмножества элементов, начиная с заданного элемента (включительно по умолчанию) и до конца набора

        System.out.println(numbers.subSet(-50, 30)); // 0, 10, 13, 20, используется для получения подмножества элементов в определённом диапазоне. Это позволяет выделить часть множества между двумя значениями, указав начальный и конечный элемент (с возможностью включения или исключения этих пределов).

        System.out.println(numbers.subSet(-80, true, 30, true)); // -80, 0, 10, 13, 20, 30

    }
}
