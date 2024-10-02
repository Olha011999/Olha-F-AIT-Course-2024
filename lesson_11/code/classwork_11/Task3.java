package classwork_11;

import java.util.Random;

//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте,
// сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?
public class Task3 {

    public static void main(String[] args) {

        Random random = new Random();//инициировали объект, сделали, датчик случайных чисел


        int[] broski = new int[20];  // toss

        //fill in

        for (int i = 0; i < broski.length; i++){

            //вызов датчика случайных чисел
            int n = random.nextInt(6) + 1;// диапазон от 0 до 5 (5 включено) + 1, чтобы сдвинуть от 1 до 6
            System.out.println(n + " ");
        }


    }
}
