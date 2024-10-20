package homework_27.products.dao;

import homework_27.products.Product;

public interface MarketInterface {

    void printAllProducts(Product[] products);
    double priceAllProducts(Product[] products);
    Product foundWithBarCode(Product[] products, long barCode);
    void printNonFood(Product[] products);



}
