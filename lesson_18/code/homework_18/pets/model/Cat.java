package homework_18.pets.model;

import homework_16.model.Pets;

public class Cat extends Pets {

    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String view, int age, String nickname, String breed, double height, double weight) {
        super(id, view, age, nickname);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public void voice(){
        System.out.println(getNickname()+ " says: Meow");
    }
}
