package classwork_07.cycles;
//// Задача о яблоках (начальное значение 30 яблок).
//// Запустить цикл, в котором яблоки берутся из корзины до тех пор,
//// пока они там есть. Последнее сообщение: "Яблоки кончились!".
public class Apples {

    public static void main(String[] args) {
        int apples=30;//начальные данные
        int count=0;//параметр цикла
        int startApples=30;

        while (count < 30){

            System.out.println("Take one apple");
            apples=apples-1;
            count=count+1;
            System.out.println("Now we have only "+apples+ "apples in the basket.");


        }

        System.out.println("The job is done!"+count+ "apples in the pie.");


    }
}
