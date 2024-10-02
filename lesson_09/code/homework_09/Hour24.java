package homework_09;

import java.util.Scanner;

//Программа запрашивает у пользователя количество секунд,
// прошедших с начала суток. Нужно вывести часы, минуты и секунды.
// Проверьте, что число введенных пользователем секунд не более 86 400.
public class Hour24 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of seconds (no more than 86.400)");

        int seconds= scanner.nextInt();

        if (seconds >= 0 && seconds <= 86400){
            int hour= seconds/3600;
            int minutes= (seconds % 3600)/60;
            int testSeconds= seconds % 60;
            System.out.println(hour+ " h " +minutes+ " min " + testSeconds+ " sec ");
        }else {
            System.out.println("Enter number of seconds no more than 86.400");
        }



    }
}
