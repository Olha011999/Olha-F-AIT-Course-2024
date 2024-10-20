package homework_27.pets.model;

import java.util.Objects;

public class Cat extends Pets {

    private boolean isIndoor;// признак того, является ли животное домашним
    private double height;
    private double weight;

    public Cat(long id, String name, String breed, double dailyCost, boolean isIndoor, double height, double weight) {
        super(id, name, breed, dailyCost);
        this.isIndoor = isIndoor;
        this.height = height;
        this.weight = weight;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return isIndoor == cat.isIndoor && Double.compare(height, cat.height) == 0 && Double.compare(weight, cat.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIndoor, height, weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("isIndoor=").append(isIndoor);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    public void voice(){
        System.out.println(getName()+ " says: Meow");
    }
}
