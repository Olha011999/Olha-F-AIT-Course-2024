package homework_27.pets.model;

import java.util.Objects;

public class Dog extends Pets {

    private double height;
    private double weight;


    public Dog(long id, String name, String breed, double dailyCost, double height, double weight) {
        super(id, name, breed, dailyCost);
        this.height = height;
        this.weight = weight;
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
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(height, dog.height) == 0 && Double.compare(weight, dog.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    public void voice(){
        System.out.println(getBreed()+ " says: Woof-woof");
    }
}
