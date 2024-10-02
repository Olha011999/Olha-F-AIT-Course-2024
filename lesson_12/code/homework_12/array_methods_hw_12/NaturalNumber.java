package homework_12.array_methods_hw_12;

import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = scanner.nextInt();

        int factorial= naturalNumber(n);
        System.out.println("Factorial is: " + factorial);
    }

    public static int naturalNumber(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial < 0) {

                System.out.println("Memory overflow");
                return -1;
            }
        }
        return factorial;

    }
}
