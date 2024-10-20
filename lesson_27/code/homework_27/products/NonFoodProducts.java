package homework_27.products;

import homework_19.product.model.Product;

import java.util.Objects;

public class NonFoodProducts extends Product {

    private String category;

    public NonFoodProducts(double price, String name, long barCode, String category) {
        super(price, name, barCode);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "NonFoodProducts{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonFoodProducts that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }
}
