package homework_3;

public class CircleArea {

       //Метод вычисляющий площадь круга по его радиусy
    public static void main(String[] args) {

        double PI=3.14;
        double r=56;

        double circleArea= PI*r*r;

        System.out.println(circleArea);

        double S= circleAreaMethod(r);
        System.out.println("classwork_03.Circle area S= " +S);

    }
    private static double circleAreaMethod (double r) {
        return Math.PI*r*r;
    }
}
