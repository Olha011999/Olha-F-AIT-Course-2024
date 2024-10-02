package homework_5;

//Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других
// Сообщить результат - существует или нет треугольник с заданными сторонами.
public class Triangle {
    public static void main(String[] args) {
        int a = 1;
        int b = 44;
        int c = 56;

        boolean triangle = isTriangle(a, b, c);
        if (triangle) {
            System.out.println("The triangle exists with sides " + a + " , " + b + " , " + c);
        } else {
            System.out.println("The triangle with sides " + a + " , " + b + " , " + c + "is missing");

        }
    }

        public static boolean isTriangle ( int a, int b, int c){
            return ((a + b) > c && (a + c) > b && (b + c) > a);
        }

    }


