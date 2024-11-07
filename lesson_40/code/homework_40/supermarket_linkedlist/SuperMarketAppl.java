package homework_40.supermarket_linkedlist;

import homework_40.supermarket_linkedlist.dao.SupermarketImpl;
import homework_40.supermarket_linkedlist.model.Product;

import java.time.LocalDate;

public class SuperMarketAppl {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        SupermarketImpl myMarket = new SupermarketImpl();

        Product[] products = new Product[5];

        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));

        for (Product p : products) {
            myMarket.addProduct(p);
        }

        //menu  с опциями: 1- склад, 2- просрочка, 3-  продукты по категориям, 4- продукты по брендам, .....

        System.out.println("Products by Category: ");
       Iterable<Product> res = myMarket.findByCategory("Bread");
        System.out.println(res);



    }
}