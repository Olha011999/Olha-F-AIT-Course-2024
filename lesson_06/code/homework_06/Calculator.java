package homework_06;

import java.util.Scanner;

//Написать приложение - калькулятор для работы с целыми числами:
// oper 1 => + oper 2 => - oper 3 => *, oper 4 => /, oper 5 => % ,
// other print "Wrong operation". Числа и требуемая операция вводятся с клавиатуры.
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("operation 1 => + ");
        System.out.println("operation 2 => -");
        System.out.println("operation 3 => *");
        System.out.println("operation 4 => /");

        int operation= scanner.nextInt();

        switch (operation){
            case '+'->{
                System.out.println("Result: "+ (number1 + number2));
                break;
            }
            case '-'->{
                System.out.println("Result: "+ (number1 - number2));
                break;
            }
            case '*'->{
                System.out.println("Result: "+ (number1 * number2));
                break;
            }
            case '/'->{
                if ( number1!=0){
                    System.out.println("Result: "+ (number1 / number2));
                }else {
                    System.out.println("Error. You can't divide by zero.");
                }
                break;
            }
            default -> {
                System.out.println("Wrong operation");
            }



        }


    }
}
