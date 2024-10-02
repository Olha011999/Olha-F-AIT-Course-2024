package homework_13;
////Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел
//// и сколько решка. Запишите результаты в массив.
// Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class HeadsOrTails {

    public static void main(String[] args) {

        Random random = new Random();
        int [] coin = new int[2];// 0-heads, 1-tails

        for (int i = 0; i < 100; i++) {
            int newThrow = random.nextInt(2);//
            coin[newThrow]++;
        }
        System.out.println("Heads came up  " + coin[0] + " times");
        System.out.println("Tails came up " + coin[1] + " times");

        double probabilityOfHeads= (double) coin[0] /100;
        System.out.println("Probability of getting heads is: "+ probabilityOfHeads);

        double probabilityOfTails = (double) coin[1]/100;
        System.out.println("Probability of getting tails is: "+ probabilityOfTails);

    }

}

