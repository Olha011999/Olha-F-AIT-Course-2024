package homework_10;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {

        double [] temperature= {20, 16, 13, 19, 17, 14, 13};
        int i=0;
        double sum = 0;

        System.out.println("Temperature on Tuesday is " + temperature[i + 1]);
        System.out.println("Temperature on Thursday is " + temperature[i + 3]);
        for (i = 0; i < temperature.length; i++) {

            sum = sum + temperature[i];
        }


        double averageTemperature = sum / temperature.length;

        System.out.println(" temperature average is " + averageTemperature);

    }
}
