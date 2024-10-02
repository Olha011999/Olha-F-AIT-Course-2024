package homework_07.cycles;
// В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит
// не менее target километров. Программа получает на вход действительные
// числа s и target и должна вывести одно натуральное число.
public class Runner2 {

        public static void main(String[] args) {

            double s = 5;
            double target = 10;
            int count = 0;

            while(s < target) {
                s = s + s * 0.1;
                System.out.println("s = " + s);
                count++;
            }

            System.out.println("Runner needed " + count + " days to reach target " + target + " km.");

        }

}
