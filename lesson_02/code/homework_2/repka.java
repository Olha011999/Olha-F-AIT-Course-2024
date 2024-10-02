package homework_2;

public class repka {
    public static void main(String[] args) {
        Grandfather();
        Grandmother();
        Granddaughter();
        Dog();
        Cat();
        Mous();
    }

    public static void Grandfather() {
        System.out.println("The Grandfather began to pull the turnip out of the ground: he pulled and pulled, but could not get it out. The old man called his grandmother for help");
    }

    public static void Grandmother() {
        System.out.println("Grandmother grabbed grandpa, grandpa grabbed a turnip: they pulled and pulled, but couldn't pull it out. Grandmother called her granddaughter");

    }

    public static void Granddaughter() {
        System.out.println("The granddaughter grabbed the grandmother, the grandmother grabbed the grandfather, the grandfather grabbed the turnip: they pulled and pulled, but couldn't pull it out. The granddaughter called the dog");

    }

    public static void Dog() {

        System.out.println("The dog grabbed the granddaughter, the granddaughter grabbed the grandmother, the grandmother grabbed the grandfather, the grandfather grabbed the turnip: they pulled and pulled, but couldn't pull it out. The dog called the cat.");

    }

    public static void Cat() {

        System.out.println("The cat grabbed the dog, the dog grabbed the granddaughter, the granddaughter grabbed the grandmother, the grandmother grabbed the grandfather, the grandfather grabbed the turnip: they pulled and pulled, but couldn't get it out. The cat clicked on the mouse.");

    }

    public static void Mous() {

        System.out.println("The mouse pulled the cat, the cat pulled the dog, the dog pulled the granddaughter, the granddaughter pulled the grandmother, the grandmother pulled the grandfather, the grandfather pulled the turnip - they pulled and pulled - and pulled out the turnip!");
    }
}
