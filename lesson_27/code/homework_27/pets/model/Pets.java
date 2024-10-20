package homework_27.pets.model;

import java.util.Objects;

public abstract class Pets {

    private long id;
    private String name;
    private String breed;//порода питомца
    private  double dailyCost; // стоимость содержания за день

    public Pets(long id, String name, String breed, double dailyCost) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.dailyCost = dailyCost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(double dailyCost) {
        this.dailyCost = dailyCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pets pets)) return false;
        return id == pets.id && Double.compare(dailyCost, pets.dailyCost) == 0 && Objects.equals(name, pets.name) && Objects.equals(breed, pets.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, breed, dailyCost);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pets{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", dailyCost=").append(dailyCost);
        sb.append('}');
        return sb.toString();
    }

    public  void sleep(){
        System.out.println(name+ " is sleeping!");
    }

    public void eat(){
        System.out.println(name+ " eats.");
    }

    public void makesSound(){
        System.out.println(name + " makes sound.");
    }

    public void play() {
        System.out.println(name+ " plays.");
    }

    public void walk(){
        System.out.println(name+ " walks.");
    }
}
