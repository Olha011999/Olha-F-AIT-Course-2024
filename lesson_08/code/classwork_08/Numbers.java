package classwork_08;

//Распечатать в консоли все числа от 1 до 100,
// которые делятся на 5 без остатка.
// задача, где в цикле мы можем печатать и проверять условия
public class Numbers {

    public static void main(String[] args) {

        int i = 0;//параметр цикла
        int y = 100;

        while (i <= y){
            if (i % 5 == 0){ //задаем условие крастности, в данном случае 5

                //System.out.println(i);//в столбик лн
                //System.out.println(i);// слитно без пробела в строку
                System.out.print(i+ " ");//добавляем + " ", в строку с пробелом
            }
            i++;//постфиксная операция, увеличивает переменную на 1

        }


    }
}