package classwork_11;
//**Задача 2.**
//Задача о "вкраплениях".
//Имеется массив целых чисел, в котором несколько раз встречается число X.
//Выясните, сколько раз это число встречается в массиве? На каких местах
// массива оно стоит?
public class Task2 {
    public static void main(String[] args) {

        int[] array = {-145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int[] arrayOfIndex = new  int[array.length];

        int element = -145;
        int count = 0;// schetchuk

        int j=0; //index dlj masiva

        for (int i=0; i < array.length; i++){
            if (array[i] == element) {
                count++;//считаем сколько таких элементов
                System.out.print(i + " ");//печатаем сразу
                arrayOfIndex[j]=i;//заносим индекс во второй массив
                j++; //увеличиваем индекс второго массива
            }
        }
        System.out.println();

        System.out.println(count);

        //печатаем массив индексов
        for (int i=0; i < j; i++){
            System.out.print(arrayOfIndex[i]+" ");
        }
        }



    }

