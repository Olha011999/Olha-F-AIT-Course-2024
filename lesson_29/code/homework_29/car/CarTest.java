package homework_29.car;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {

   Car[] cars;
    @BeforeEach
    void setUp() {

        cars = new Car[4];
        cars[0] = new Car("N1", "Polo", "VW", (double) 15000,  "Red", 2000, 12500);
        cars[1] = new Car("N2", "Yaris", "Toyota", 20000,  "Blue", 2012, 8900);
        cars[2] = new Car("N3", "S200", "Mercedes", 18000,  "Green", 2024, 99000);
        cars[3] = new Car("N1", "Polo", "VW", 16000,  "Black", 2000,12501);
    }

    @Test

    void printAllCars(){

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    @Test
    void sortCarsByCompanyTest(){
        System.out.println("-----------List Car as is");
        printAllCars();
        Arrays.sort(cars);
        System.out.println("-----------List cars sorted by company");
        printAllCars();

    }

    @Test
    void sortCarsByRegNumberTest(){
        Comparator<homework_29.car.Car> comparatorByRegNumber = new Comparator<homework_29.car.Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getRegNumber().compareTo(car2.getRegNumber());
            }
        };
        System.out.println("-----------List Car as is");
        printAllCars();
        Arrays.sort(cars, comparatorByRegNumber);
        System.out.println("-----------List cars sorted by regnumber");
        printAllCars();

    }

@Test
    void sortCarsByModelTest(){
        Comparator<Car> comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        };
    System.out.println("-----------List Car as is");
    printAllCars();
    Arrays.sort(cars, comparatorByModel);
    System.out.println("-----------List cars sorted by model");
    printAllCars();
    }

    @Test
    void sortCarsByEngineTest(){
        Comparator<Car> comparatorByEngine = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                //return (int) (car1.getEngine() - car2.getEngine());
                return Double.compare(car1.getEngine(),car2.getEngine());
            }
        };
        System.out.println("-----------List Car as is");
        printAllCars();
        Arrays.sort(cars, comparatorByEngine);
        System.out.println("-----------List cars sorted by engine");
        printAllCars();
    }
@Test
    void sortCarsByColorTest(){
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getColor().compareTo(car2.getColor());
            }
        };
    System.out.println("-----------List Car as is");
    printAllCars();
    Arrays.sort(cars, comparatorByColor);
    System.out.println("-----------List cars sorted by color");
    printAllCars();
    }


    @Test
    void sortCarsByYearOfCarProductionTest(){
        Comparator<Car> comparatorByYearOfCarProduction = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getYearOfCarProduction() -car2.getYearOfCarProduction();
            }
        };
        System.out.println("-----------List Car as is");
        printAllCars();
        Arrays.sort(cars, comparatorByYearOfCarProduction);
        System.out.println("-----------List cars sorted by production");
        printAllCars();
    }

    @Test
    void sortCarsByPriceTest(){
        Comparator<Car> comparatoByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Double.compare(car1.getPrice(),car2.getPrice());
            }
        };
        System.out.println("-----------List Car as is");
        printAllCars();
        Arrays.sort(cars, comparatoByPrice);
        System.out.println("-----------List cars sorted by price");
        printAllCars();
    }
}