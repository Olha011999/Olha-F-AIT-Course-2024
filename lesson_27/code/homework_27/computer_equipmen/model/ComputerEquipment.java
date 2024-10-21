package homework_27.computer_equipmen.model;

import java.util.Objects;

public class ComputerEquipment {
    protected double price;
    protected String name;
    protected long barCode;
    protected boolean blackFridayDiscount;

    public ComputerEquipment(double price, String name, long barCode, boolean blackFridayDiscount) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
        this.blackFridayDiscount = blackFridayDiscount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public boolean isBlackFridayDiscount() {
        return blackFridayDiscount;
    }

    public void setBlackFridayDiscount(boolean blackFridayDiscount) {
        this.blackFridayDiscount = blackFridayDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerEquipment that)) return false;
        return Double.compare(price, that.price) == 0 && barCode == that.barCode && blackFridayDiscount == that.blackFridayDiscount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode, blackFridayDiscount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComputerEquipment{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append(", barCode=").append(barCode);
        sb.append(", blackFridayDiscount=").append(blackFridayDiscount);
        sb.append('}');
        return sb.toString();
    }
    private boolean discounted; // A field that stores whether the computer is discounted or not

    // Constructor, getters, and setters

    public boolean isDiscounted() {
        return discounted; // Return true if the computer is discounted
    }
}
