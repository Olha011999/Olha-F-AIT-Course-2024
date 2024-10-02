package homework_16;

import homework_16.model.Pets;

public class PetsAppl {

    public static void main(String[] args) {

        Pets p1 = new Pets(1,"cat",5,"Puschanija");
        Pets p2 = new Pets(2,"dog",2,"Sharik");
        Pets p3 = new Pets(3,"parrot",1,"Kesha");

        //display information about a pet

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //display of the day lived by a pet
        System.out.println();
        System.out.println("What are the animals doing now?");

        p1.play();
        p2.walk();
        p3.eat();
        p3.makesSound();
        p1.sleep();
    }
}
