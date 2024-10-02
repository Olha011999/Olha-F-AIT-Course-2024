package homework_07.cycles;

import java.util.Scanner;

// В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит
// не менее target километров. Программа получает на вход действительные
// числа s и target и должна вывести одно натуральное число.
public class Running {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ввод начального пробега
        System.out.println("On the first day the athlete ran " + " km");
        double s = scanner.nextDouble();
        System.out.println("Enter how many do you want to run:" + "km");
        double target = scanner.nextDouble();

        int day=1;

        while (s<target){
            s=s + s*0.1;
            day=day+1;
        }
        System.out.println("Number of days: "+day);


    }
}
