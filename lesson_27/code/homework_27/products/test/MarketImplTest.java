package homework_27.products.test;

import homework_27.products.MeatFood;
import homework_27.products.MilkFood;
import homework_27.products.NonFoodProducts;
import homework_27.products.Product;
import homework_27.products.dao.MarketImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketImplTest {
    private MarketImpl market;
    private Product[] products;

    @BeforeEach
    void setUp() {
        market = new MarketImpl();
        products = new Product[] { // Инициализация массива с помощью фигурных скобок
                new MeatFood(10.0, "Chicken", 1234567890123L, "2024-01-01", "Chicken"),
                new MilkFood(5.0, "Whole Milk", 1234567890124L, "2024-01-01", "Cow", 3.5),
                new Product(15.0, "Soap", 1234567890125L),
                new MeatFood(12.0, "Beef", 1234567890126L, "2024-01-01", "Beef")
        };
    }

    @Test
    void printAllProductsTest() {
        market.printAllProducts(products); // Simple print, no assertions needed
    }

    @Test
    void priceAllProductsTest() {
        double total = market.priceAllProducts(products);
        assertEquals(42.0, total);
    }

    @Test
    void foundWithBarCodeTest() {
        Product foundProduct = market.foundWithBarCode(products, 1234567890124L);
        assertNotNull(foundProduct);
        assertEquals("Whole Milk", foundProduct.getName());

        Product notFoundProduct = market.foundWithBarCode(products, 9999999999999L);
        assertNull(notFoundProduct);
    }

    @Test
    void printNonFoodTest() {
        market.printNonFood(products); // Simple print, no assertions needed
    }
}
