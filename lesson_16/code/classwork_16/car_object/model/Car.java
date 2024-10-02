package classwork_16.car_object.model;

public class Car {

    //выделили общие и полезные характеристики и заполнили поля объекта
    //field
    private String brand;
    private int year;
    private double price;
    private String color;
    private boolean isNew;

    //constructor,  вызываем конструктор для написания кода -
   // это метод, который ничего не возвращает


    public Car(String brand, int year, double price, String color, boolean isNew) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }

    //getters and setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    public String display() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    //пишем методы, которые нам нужны

    public void move(){
        System.out.println("Car is moving...");
    }

    public void stop(){
        System.out.println("Car stopped.");
    }
}
