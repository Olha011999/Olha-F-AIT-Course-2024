package homework_18.pets;

import homework_18.pets.model.Cat;
import homework_18.pets.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {

        Cat cat1 = new Cat(1,"Siamese", 3, "Lola", "Siamese", 0.6, 3.5);
        Cat cat2 = new Cat(2,"Savannah", 1, "Micky", "Savannah", 0.5, 1.5);
        Cat cat3 = new Cat(3,"British", 2, "Lucky", "British", 1, 5.5);


        Dog dog1 = new Dog(1, "Akita Inu", 2, "Bob", "Akita Inu",1, 5.5);
        Dog dog2 = new Dog(2, "cocker", 1, "Tom", "cocker",1, 2.5);

        cat1.voice();
        cat1.eat();
        cat1.play();

        cat2.voice();
        cat2.makesSound();
        cat2.sleep();

        cat3.eat();
        cat3.voice();

        dog1.voice();
        dog1.sleep();
        dog1.walk();

        dog2.voice();
        dog2.play();


    }
}
