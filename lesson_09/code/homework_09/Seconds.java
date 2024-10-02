package homework_09;
//В программе задаются часы, минуты и секунды.
// Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.
import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter hour:  ");
        int hour= scanner.nextInt();
        while (hour<0) {
            System.out.println("Pleas enter positiv numbers!");
            hour= scanner.nextInt();
            if (hour<0){
                System.out.println("Error. Hours cannot be negative. Please retry.");
            }
        }
        System.out.println("Enter minutes: " );
        int min= scanner.nextInt();

        while (min<0) {
            System.out.println("Pleas enter positiv numbers!");
            min= scanner.nextInt();
            if (min<0){
                System.out.println("Error. Minutes cannot be negative. Please retry.");
            }
        }
        System.out.println("Enter seconds: " );
        int sec= scanner.nextInt();
        while (sec<0) {
            System.out.println("Pleas enter positiv numbers!");
            sec= scanner.nextInt();
            if (sec<0){
                System.out.println("Error. Seconds cannot be negative. Please retry.");
            }
        }
        int res= resInSeconds(hour,min,sec);
        System.out.println("YOU entered " +hour+ "h" +min +"min"+sec+"sec and became: "+res+ "sec" );


    }
private static int resInSeconds(int hour, int min, int sec){
        return (hour*60)+(min*60)+sec;
}


}
