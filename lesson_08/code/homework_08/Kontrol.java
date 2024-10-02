package homework_08;

//Чему равно значение выражения x-- + --x при x = 5?
// Проверьте свое предположение с помощью кода.
public class Kontrol {

    public static void main(String[] args) {
        int x = 5;
        int res = x-- + --x;
        System.out.println("The sum of the first calculation is equal to: "+res);
        int res1=--x;
        System.out.println("The second calculation is: "+res1);
        int res2=x--;
        System.out.println("The third calculation is: "+res2);
    }

}
