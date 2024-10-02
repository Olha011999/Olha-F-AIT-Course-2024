package classwork_07.cycles;
//Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {
    public static void main(String[] args) {
        //задаем начальные условия
        int countDown=10;

        System.out.println("We have "+countDown+ " sec befor start. ");

        while (countDown>0){
            countDown--;   //countDown=countDown-1
            System.out.println("We have "+countDown+ "till start.");
        }
        System.out.println("Here we go!");
    }
}
