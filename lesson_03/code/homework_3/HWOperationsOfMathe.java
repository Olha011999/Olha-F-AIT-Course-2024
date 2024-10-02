package homework_3;

public class HWOperationsOfMathe {
    public static void main(String[] args) {
        //Метод вычисляющий площадь квадрата по его стороне;
        double a = 23.4d;
        double squaerarea = areaOfSquaer(a);
        System.out.println("Square area with a = 23.4 is " + squaerarea);


        //Метод вычисляющий площадь круга по его радиусy;

        double radius = 45.0d;
        double PI = 3.14159;
        double squaer = areaOfCircle(PI, radius);

        System.out.println("Circle area with radius = " + radius + " is " + squaer);

        //Метод вычисляющий периметр прямоугольника по двум сторонам

        double c = 30;
        double b = 40;

        double Perimeter = rectanglePerimeter(c, b);

        System.out.println("Perimeter of rectangle with c= " + c + " and b= " +b+ " is " + Perimeter);

    }

    public static double areaOfCircle(double radius, double Pi){
        double squaer = Pi * radius * radius;
        return squaer;
    }

    public static double areaOfSquaer(double a){
        double squaerarea = a * a;
        return squaerarea;
    }
    public static double rectanglePerimeter(double c, double b){
        double Perimeter= 2* (c+b);
        return Perimeter;
    }

}
