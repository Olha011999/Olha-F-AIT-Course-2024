package methods;

public class Circus {

    public static void main(String[] args) {

        lightOn();
        entertainer();
        lightOff();

    }//end of main
    public static void lightOn(){
        System.out.println("Light Onn!!!");
    }
    public static void lightOff(){
        System.out.println("Lights OFF...");

    }
    public static void entertainer() {

        jogger();
        cloun();
        singer();
    }
    public static void jogger(){
        System.out.println("I'm jogging...");
    }

    public static void cloun(){
        System.out.println("I'm jocking...");
    }

    public static void singer(){

        System.out.println("I'm singing...");
    }
}//end of class
