package classwork_28.car_garage.ait.cars.dao;

import classwork_28.car_garage.ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage{

    private Car[] cars;
    private int size;

    public GarageImpl(int capasity) {
        this.cars = new Car[capasity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size] = car;
        size++;
        // cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                Car removedCar = cars[i];
                // Сдвигаем элементы массива
                for (int j = i; j < size - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[size - 1] = null; // Убираем последний элемент, который теперь дублируется
                size--; // Уменьшаем размер гаража
                return removedCar;
            }
        }
        return null; // Если автомобиль не найден
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));//model.equals(car.getModel()) );//нужен такой кар, у которого->
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(car -> car.getEngine() > min && car.getEngine() < max);

    }


    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));// сравнение для примитивных типов ==, а для String-equals(не примитивных)
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }
    //в этот метод передаем логические выражения, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){//объект проходит тест
                count ++;
            }
        }
        // читаем массив и перекладываем результаты в новый
        Car[] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }
}
