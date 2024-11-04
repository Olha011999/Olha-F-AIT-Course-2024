package classwork_38.linked_list.linked_list_test;

import java.util.*;

public class LinkedListAppl {

    // заполнить список случайными целыми числами
// проверить работу методов LinkedList

    private static final int N_NUMBERS = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(); //new ArrayList<>();// определяем имплементацию

        fillList (list);//creation
        printList (list);//reading

        System.out.println(list.size());
        System.out.println(list.get(0));// 1st element
        System.out.println(list.get(list.size()-1));// last element

        //
        System.out.println(list.indexOf(25));//-1
        System.out.println(list.indexOf(10));//на каком индексе стоит 10
        list.set(0, 50);//на первый элемент установили 50
        list.set(N_NUMBERS -1,100);//на последний элемент установили 100
        printList(list);

        list.set(5, 200);
        printList(list);

        //удалить 15 , если оно есть в списке
        //так удалять не нужно
//

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num.equals(15)){
                iterator.remove();//удаление в позиции курсора итератора
            }
        }
        printList(list);

        Integer num = 100;
        list.remove(list.indexOf(100));
        printList(list);


        //удаление по условию (предикат , лямбда)
        //удалим, все кратные 3(%3=0)
        list.removeIf(e-> e%3 == 0);
        printList(list);



    }

    private static void printList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===================");
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }

    }
}
