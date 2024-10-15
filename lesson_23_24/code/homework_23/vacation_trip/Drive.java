package homework_23.vacation_trip;

import homework_23.vacation_trip.model.Car;

public class Drive {

    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Audi", 'd', 1.6, 6.6, 45);
        cars[1] = new Car("BMW", 'b', 1.8, 6.8, 49);
        cars[2] = new Car("Opel", 'd', 1.6, 6.9, 45);
        cars[3] = new Car("VW", 'd', 1.6, 6.5, 39);
        cars[4] = new Car("Mercedes", 'b', 1.8, 6.3, 49);

        double distance = 3000;

        //переменные для хранения минимальных затрат (устанавливаем «минимум» на максимально возможное значение)
        double  minPrice = Double.MAX_VALUE;
        Car bestCar = null;

        //рассчитываем стоимость поездки для каждого автомобиля
        for (int i = 0; i < cars.length ; i++) {
            double totalCoast = cars[i].calculateTotalPrice(distance);
            System.out.println("Brand: " + cars[i].getCarBrand()+ " the cost of the trip: " + totalCoast + " Euro");

            //сравниваем с минимальной стоимостью
            if (totalCoast < minPrice){
                minPrice = totalCoast;
                bestCar = cars[i];
            }
        }if (bestCar != null){
            System.out.println("Best choice: " + bestCar.getCarBrand() + " total cost of the trip: " + minPrice + " Euro");
        }

    }
}
