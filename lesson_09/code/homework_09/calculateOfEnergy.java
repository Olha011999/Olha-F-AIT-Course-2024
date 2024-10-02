package homework_09;

import java.util.Scanner;

// Анна использует различные электроприборы в своем доме.
// У неё есть холодильник, который потребляет 150 Вт,
// и кондиционер с потреблением 2000 Вт.
// Анна хочет узнать, сколько она тратит на электроэнергию в месяц,
// если стоимость 1 кВт·ч составляет 0.15 евро.
// Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час?
// (calculateHourlyConsumption)
// Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)
public class calculateOfEnergy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cooler = 0.15;//kВт
        int conditioner = 2;//kВт
        double cost = 0.15; //стоимость электроенергии kВт в час, евро


        double priceForHour = calculateHourlyConsumption(cooler, conditioner, cost);
        System.out.println("Hour price:"+priceForHour);
        System.out.println("Enter the month number from 1 to 12");
        int month = scanner.nextInt();

        double monthPrice = calculateMonthlyCost(cooler, conditioner, cost, month);

        switch (month) {
            case 1 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In January, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 2 -> {
                if (month == 28 ){
                    monthPrice = monthPrice * 28;
                System.out.println("In February, electricity costs will be (28 days): " + monthPrice);
                }else if (month == 29){
                    monthPrice = monthPrice * 29;
                    System.out.println("In February, electricity costs will be (29 days): " + monthPrice);
                }
                break;
            }

            case 3 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In March, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 4 -> {
                monthPrice = monthPrice * 30;
                System.out.println("In April, electricity costs will be (30 days): " + monthPrice);
                break;
            }
            case 5 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In Mai, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 6 -> {
                monthPrice = monthPrice * 30;
                System.out.println("In June, electricity costs will be (30 days): " + monthPrice);
                break;
            }
            case 7 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In July, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 8 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In August, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 9 -> {
                monthPrice = monthPrice * 30;
                System.out.println("In September, electricity costs will be (30 days): " + monthPrice);
                break;
            }
            case 10 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In October, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            case 11 -> {
                monthPrice = monthPrice * 30;
                System.out.println("In November, electricity costs will be (30 days): " + monthPrice);
                break;
            }
            case 12 -> {
                monthPrice = monthPrice * 31;
                System.out.println("In December, electricity costs will be (31 days): " + monthPrice);
                break;
            }
            default -> System.out.println("Error!!! Please enter number from 1 to 12");

        }

    }

    public static double calculateHourlyConsumption(double cooler, int conditioner, double cost) {
        return (cooler + conditioner) * cost;
    }

    public static double calculateMonthlyCost(double cooler, int conditioner, double cost, int month) {
        return (cooler + conditioner) * cost * month;


    }

}
