package homework_23.vacation_trip.model;

import java.util.Objects;

public class Car {

    public static final int DISTANCE_LENGTH = 3000;

    private String carBrand;
    private char fuelType;// тип топливаБ бензин иди дизель
    private double fuelPrice;
    private double fuelConsumptiom; //расход топлива на 100 км
    private double rentalCoast;

    public Car(String carBrand, char fuelType, double fuelPrice, double fuelConsumptiom, double rentalCoast) {
        this.carBrand = carBrand;
        setFuelType(fuelType);// устанавливаем тип топлива через сеттер
        this.fuelPrice = fuelPrice;
        this.fuelConsumptiom = fuelConsumptiom;
        this.rentalCoast = rentalCoast;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {

        if (fuelType == 'd' || fuelType == 'b'){
        this.fuelType = fuelType;
        if (fuelType =='d'){
            this.fuelPrice = 1.6;
        } else {
            this.fuelPrice = 1.8;
        }}else {

            System.out.println("Wrong type of fuel.");
        }
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getFuelConsumptiom() {
        return fuelConsumptiom;
    }

    public void setFuelConsumptiom(double fuelConsumptiom) {
        this.fuelConsumptiom = fuelConsumptiom;
    }

    public double getRentalCoast() {
        return rentalCoast;
    }

    public void setRentalCoast(double rentalCoast) {
        this.rentalCoast = rentalCoast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return fuelType == car.fuelType && Double.compare(fuelPrice, car.fuelPrice) == 0 && Double.compare(fuelConsumptiom, car.fuelConsumptiom) == 0 && Double.compare(rentalCoast, car.rentalCoast) == 0 && Objects.equals(carBrand, car.carBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, fuelType, fuelPrice, fuelConsumptiom, rentalCoast);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carBrand='").append(carBrand).append('\'');
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fuelPrice=").append(fuelPrice);
        sb.append(", fuelConsumptiom=").append(fuelConsumptiom);
        sb.append(", rentalCoast=").append(rentalCoast);
        sb.append('}');
        return sb.toString();
    }


    //fuel cost of rent for the whole trip
    public double calculateTotalPrice(double distance){
        double totalCoast = ((distance/100) * fuelPrice * fuelConsumptiom) + rentalCoast;
        return totalCoast;
    }

    public String displayCar(){
        return String.format("Brand: %s, fuel type: %s, fuel price: %f, fuel consumptiom: %f, rental coast: %f ", carBrand, fuelType, fuelPrice, fuelConsumptiom, rentalCoast);// %.2f  значит что будет цифра с зяпятой и только 2 цифры после запятой
    }



}
