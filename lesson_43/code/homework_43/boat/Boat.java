package homework_43.boat;

public class Boat {

    private String manufacturer;
    private String country;
    private int year;
    private double length;
    private String hullMaterial;
    private double cost;

    public Boat(String manufacturer, String country, int year, double length, String hullMaterial, double cost) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.year = year;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.cost = cost;
    }

    // Getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Boat{manufacturer='%s', country='%s', year=%d, length=%.2f, hullMaterial='%s', cost=%.2f}",
                manufacturer, country, year, length, hullMaterial, cost);
    }
}
