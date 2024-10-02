package homework_5;
//Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.
public class Minimal {
    public static void main(String[] args) {

        int x = 65;
        int y = 756;

        int min= minimum(x,y);
        System.out.println("Minimum= " +min);

    }
    public static int minimum (int x, int y){
        int min;

        if (x< y){
            min=x;

        }else {
            min=y;

        }
       return min;
    }


}
