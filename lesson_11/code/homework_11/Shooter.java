package homework_11;

import java.util.Random;

//У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок?
// Попал ли он хоть раз в центр мишени?
public class Shooter {

    public static void main(String[] args) {

        Random random = new Random();
        int[] shoot = new int[10];
        int points = 0;// счетчик очков
        int hitting = 0;// счетчик попаданий в цель


        System.out.println("Random hit");
        for (int i = 0; i < shoot.length; i++) {
            int numbersOfShoots = random.nextInt(10) + 1;
            System.out.print(numbersOfShoots + " ");

            points += numbersOfShoots;

            if (numbersOfShoots ==10){
                hitting++;
            }

        }
        System.out.println();
        System.out.println("Hitting: " + hitting);



    }
}
