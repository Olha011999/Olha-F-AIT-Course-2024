package homework_07.cycles;

import java.util.Scanner;

//Вводится положительное целое число, найдите сумму его цифр.
// Пример: 1725, сумма цифр = 15
public class Summe {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a positive integer:"); //ввод положительного целого числа
        int num= scanner.nextInt();
        int sum = 0;//переменная для хранения суммы цифр
       int count= 0;
       int digit=num;//временная переменная для подсчета цифр в числе


                //считаем количество цифр в числе
        while (digit>0){
            digit=digit/10;
            count=count+1;
        }
        System.out.println("number of digits= "+count);
        //вычисляем сумму цифр
        while (count>0){
            sum+=num%10;// добавляем последнюю цифру числа к сумме
            num/=10;//убираем последнюю цифру числа
            count--;//уменьшаем счестчик цифр

        }
        System.out.println("Sum of digits= "+sum);



    }
}
