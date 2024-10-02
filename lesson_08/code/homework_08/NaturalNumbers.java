package homework_08;
//Распечатайте все натуральные числа меньшие 200 и кратные 13.
// Используйте циклы while и do while.
public class NaturalNumbers {

    public static void main(String[] args) {
        int natur = 13;
        //int count = 200;

        System.out.println("Print out all natural numbers less than 200 and multiples of 13.");

        do {
            System.out.println(natur);
            natur+=13;
        }
        while (natur<=200);
    }
}
