package classwork_06;

//Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
// Определите в какую четверть попадает точка с этими координатами.
public class CoordinateXY {

    public static void main(String[] args) {

        int x = 6;
        int y = -5;

        if (x >= 0 & y >= 0) {
            System.out.println("Point is in 1st quarter");
        }
        if (x <= 0 & y >= 0) {
            System.out.println("Point is in 2st quarter");
        }

        if (x <= 0 & y <= 0) {
            System.out.println("Point is in 3st quarter");
        }
        if (x >= 0 & y <= 0) {
        System.out.println("Point is in 4st quarter");
        }

        if (x==0 & y==0){
         System.out.println("Point is in (0;0)");
        }

    }
}
