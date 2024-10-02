package homework_09;

import java.util.Scanner;

//Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак Используйте цифры для кодирования вариантов действий.
public class Garbage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you choice (packaging-1; food waste-2; paper-3; other waste-4");
        int garbage = scanner.nextInt();


        switch (garbage) {
            case 1->{
                System.out.println("Dispose of packaging in the yellow bin");
                break;
            }
            case 2->{
                System.out.println("Dispose of food waste in the brown bin");
                break;
            }
            case 3->{
                System.out.println("Dispose of paper in the green bin");
                break;
            }
            case 4->{
                System.out.println("Dispose of other waste in the black bin");
                break;
            }
            default -> System.out.println("Error! You entered an incorrect number, enter from 1 to 4");
        }

    }
}
