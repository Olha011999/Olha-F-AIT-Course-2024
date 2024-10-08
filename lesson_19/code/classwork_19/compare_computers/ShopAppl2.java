package classwork_19.compare_computers;

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;
import classwork_18.computer_shop.model.Smartphone;

//Найти общий вес всех мобильных устройств в ComputerShop.
public class ShopAppl2 {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("A17 Pro", 8, 256, "Apple", 1200, 10,3, 10,"black", 25345342534253l);
        System.out.println(smartphone);

        System.out.println("-----------------");
        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);


        Laptop laptop = new Laptop("M2", 8, 256, "Apple AiBook", 2200, 14, 1.5, 10, "blue");
        System.out.println(laptop);

        Computer [] computers = new Computer[6];// тип компъютер (родительский класс)
        computers [0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers [1] = new Computer("i5", 8, 256, "HP", 1200);
        computers [2] = new Computer("AMD", 8, 256, "NoName", 2000);
        computers [3] = new Laptop("Apple", 8, 256, "MacBook", 2000, 14,1.5, 10, "white");//down casting
        computers [4] = new Laptop("Apple", 16, 512, "MacBook Air", 2500, 14.2, 1.8, 12,"blau");//down casting
        computers [5] = new Smartphone2("A1", 128, 256, "Samsung", 1300, 9, 0.45, 12, "Pink",123L);//down casting

        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop){// экземпляр от
                Laptop myLaptop = (Laptop) computers[i];// upper casting
                totalWeight += myLaptop.getWeight();
            }
        }
        System.out.println( "Total weight = " +totalWeight);
        System.out.println("-------------------------------");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();

        }
        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }

        System.out.println("Total price: " + totalPrice);
        System.out.println("____________");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);

        }
        System.out.println("-----------------------");
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());

        }
    }


}
