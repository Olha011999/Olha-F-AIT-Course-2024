package homework_27.products.dao;

import homework_27.products.NonFoodProducts;
import homework_27.products.Product;

public class MarketImpl implements MarketInterface{
    @Override
    public void printAllProducts(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    @Override
    public double priceAllProducts(Product[] products) {
        double totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public Product foundWithBarCode(Product[] products, long barCode) {
        for (Product product : products) {
            if (product != null && product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void printNonFood(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
        }
}
