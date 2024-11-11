package homework_43;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime) // Фильтруем только простые числа
                .collect(Collectors.toList());      // Собираем в список

        System.out.println("Простые числа: " + primeNumbers);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Если делится без остатка, значит не простое
            }
        }
        return true; // Если делителей не нашлось, то простое
    }
}
