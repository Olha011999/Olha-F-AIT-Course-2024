package homework_39.ait.supermarket_arraylist.dao;

import homework_39.ait.supermarket_arraylist.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class SupermarketImpl implements Supermarket{

    // constructor
    // array[capacity]
    // int size
    // теперь этого всего не надо делать!

    private Collection<Product> products = new ArrayList<>();

//    public SupermarketImpl(Collection<Product> products) {
//        this.products = products;
//    }

    @Override
    public boolean addProduct(Product product) {

        if (product == null || products.contains(product)){
            return false;
        }
        return products.add(product);

        //        for (Product product1 : products) {
//            if (product1.getBarCode() == product.getBarCode()){
//                System.out.println("Product with barCode " + product.getBarCode() + " already exists");
//                return false;
//            }
//
//        }
//        products.add(product);
//        return true;
    }

    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);
        return product;

//        Product productToRemove = findByBarCode(barCode);
//        if (productToRemove != null){
//            products.remove(productToRemove);
//        }
//        return productToRemove;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product2 : products) {
            if (product2.getBarCode() == barCode){//== так как стравниваем числа long
                return product2;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(product -> product.getCategory().equalsIgnoreCase(category));

//        List<Product> productList = new ArrayList<>();
//        for (Product product : productList) {
//            if (product.getCategory().equalsIgnoreCase(category)){
//                productList.add(product);
//            }
//
//        }
//        return productList;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {

        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
//        List<Product> productList = new ArrayList<>();
//        for (Product product : productList) {
//            if (product.getBrand().equalsIgnoreCase(brand)){
//                productList.add(product);
//            }
//
//        }
//        return productList;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {

        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
//        List<Product> expiredProducts = new ArrayList<>();
//        LocalDate today = LocalDate.now();
//        for (Product product : products) {
//            if (product.getExpDate().isBefore(today)) {
//                expiredProducts.add(product);
//            }
//        }
//        return expiredProducts;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    public Iterable<Product> findByPredicate(Predicate<Product> predicate) {
        List<Product> res = new ArrayList<>();
        for (Product p : products) {
            if (predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}