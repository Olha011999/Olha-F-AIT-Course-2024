package homework_39.supermarket.dao;

import homework_39.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SupermarketImpl implements Supermarket{

    private Collection<Product> products;

    public SupermarketImpl(Collection<Product> products) {
        this.products = products;
    }

    @Override
    public boolean addProduct(Product product) {
        for (Product product1 : products) {
            if (product1.getBarCode() == product.getBarCode()){
                System.out.println("Product with barCode " + product.getBarCode() + " already exists");
                return false;
            }

        }
        products.add(product);
        return true;
    }

    @Override
    public Product removeProduct(long barCode) {
        Product productToRemove = findByBarCode(barCode);
        if (productToRemove != null){
            products.remove(productToRemove);
        }
        return productToRemove;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product2 : products) {
            if (product2.getBarCode() == barCode){
                return product2;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        List<Product> productList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)){
                productList.add(product);
            }

        }
        return productList;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        List<Product> productList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getBrand().equalsIgnoreCase(brand)){
                productList.add(product);
            }

        }
        return productList;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        List<Product> expiredProducts = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Product product : products) {
            if (product.getExpDate().isBefore(today)) {
                expiredProducts.add(product);
            }
        }
        return expiredProducts;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }
}
