package classwork_05;

//Проверка положительное или отрицательное число.



public class ConditionsEx {
    public static void main(String[] args) {
//  не полный условный оператор
        int x = 56;

        if (x > 0) {
            System.out.println("x= " + x + " is positive namber");
        }
        if (x < 0) {
            System.out.println("x= " + x + " is negative namber");
        }

// полный условный оператор
        x = -234; //переопределил значение переменной
        if (x >= 0) {
            System.out.println("x= " + x + " is positive namber");

        } else {
            System.out.println("x= " + x + " is negative namber");
        }
//Проверка четное или нечетное целое число.
        x=112;
        if (x%2==0) {
            System.out.println("x= "+x+ " is even");
        } else {
            System.out.println("x= "+x+ " is odd");
        }
        //Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
        //прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".
        int age = 20;
        if (age >=18){
            System.out.println("Вам разрешено действовать самостоятельно");

        }else {
            System.out.println("Вам надо прийти вместе с вашим опекуном");

        }

    }
}
