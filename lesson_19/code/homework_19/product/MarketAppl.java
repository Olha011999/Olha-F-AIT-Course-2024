package homework_19.product;

import homework_19.product.model.Product;
import homework_19.product.model.productHeritage.Food;
import homework_19.product.model.productHeritage.MeatFood;
import homework_19.product.model.productHeritage.MilkFood;
import homework_19.product.model.productHeritage.NonFoodProducts;

public class MarketAppl {

    public static void main(String[] args) {

        Product [] products = new Product[4];

        products [0] = new Food(1.99, "Eggs", 54637746l, "20.10.2024");
        products [1] = new MeatFood(10.0, "Meat", 656565l, "12.10.2024", "Beef" );
        products [2] = new MilkFood(2.39, "Jogurt", 7588365l, "12.10.2024", "Jogurt", 3.2);
        products [3] = new NonFoodProducts(10.5, "Christmas tree decorations", 767676676l, "Decoration");

        printAllProducts(products);
        System.out.println("-------------------------------");

        System.out.println("Total price: " + priceAllProducts(products));
        System.out.println("--------------------------------");


        Product foundProduct = foundWithBarCode (products, 7588365l);
//        if (foundProduct !=null){
//            System.out.println("Found product by barcode: " + foundProduct);
//        }else {
//            System.out.println("Product not found.");
//        }
        System.out.println("Found product by barcode: " + foundProduct);

        System.out.println("------------------");
        printNonFood(products);



   }

    public static void printAllProducts(Product [] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
    }

   public static double priceAllProducts(Product[] products){

        double totalPrice = 0;
       for (int i = 0; i < products.length; i++) {
           totalPrice += products[i].getPrice();
       }
       return totalPrice;
   }

   public static Product foundWithBarCode(Product[] products, long barCode){
       for (int i = 0; i < products.length; i++) {
           if (products[i].getBarCode() == barCode){
               return products [i];
           }
       }
       return null;
   }

   public static void printNonFood(Product[] products){
       System.out.println("Non-food products: ");

       for (int i = 0; i < products.length; i++) {
           if (products[i] instanceof NonFoodProducts) {  // Проверка, является ли продукт не пищевым
               System.out.println(products[i]);
           }
       }
   }


}
