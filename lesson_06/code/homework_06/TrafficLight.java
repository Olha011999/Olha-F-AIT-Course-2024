package homework_06;
//Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light (red, yellow, green):");
        String color = scanner.next();

        switch (color) {
            case "red" -> {
                System.out.println("Stop! You need to stop.");
                break;
            }
            case "yellow" -> {
                System.out.println("Get ready! The signal will change soon.");
                break;
            }
            case "green" -> {
                System.out.println("Go ahead! Traffic is permitted.");
                break;
            }
            default -> {
                System.out.println("Invalid color. Enter red, yellow, or green.");
            }
        }


    }
}
