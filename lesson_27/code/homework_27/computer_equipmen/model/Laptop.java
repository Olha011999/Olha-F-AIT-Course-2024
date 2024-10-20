package homework_27.computer_equipmen.model;

public class Laptop extends ComputerEquipment {
    private String brand;

    public Laptop(double price, String name, long barCode, boolean blackFridayDiscount, String brand) {
        super(price, name, barCode, blackFridayDiscount);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }
}