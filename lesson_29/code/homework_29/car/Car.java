package homework_29.car;

import java.util.Objects;

public class Car implements Comparable<Car> {


    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;
    private int yearOfCarProduction;
    private double price;


    public Car(String regNumber, String model, String company, double engine, String color, int yearOfCarProduction, double price) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.yearOfCarProduction = yearOfCarProduction;
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfCarProduction() {
        return yearOfCarProduction;
    }

    public void setYearOfCarProduction(int yearOfCarProduction) {
        this.yearOfCarProduction = yearOfCarProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(engine, car.engine) == 0 && yearOfCarProduction == car.yearOfCarProduction && Objects.equals(regNumber, car.regNumber) && Objects.equals(model, car.model) && Objects.equals(company, car.company) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, model, company, engine, color, yearOfCarProduction);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append(", yearOfCarProduction=").append(yearOfCarProduction);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car car) {
        return this.company.compareTo(car.company);
    }

}
