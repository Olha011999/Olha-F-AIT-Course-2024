package homework_44.computers;

import java.util.*;
import java.util.stream.Collectors;

public class Computer {
    private String brand;
    private String model;
    private int year;
    private double price;
    private int ramSize; // in GB
    private int ssdSize; // in GB

    public Computer(String brand, String model, int year, double price, int ramSize, int ssdSize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return year == computer.year && Double.compare(price, computer.price) == 0 && ramSize == computer.ramSize && ssdSize == computer.ssdSize && Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, price, ramSize, ssdSize);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append(", ramSize=").append(ramSize);
        sb.append(", ssdSize=").append(ssdSize);
        sb.append('}');
        return sb.toString();
    }
}
