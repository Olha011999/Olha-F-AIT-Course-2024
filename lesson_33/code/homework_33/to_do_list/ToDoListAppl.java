package homework_33.to_do_list;

import java.util.Scanner;

public class ToDoListAppl {

    public static void main(String[] args) {

        ToDoList.printMenu();

        System.out.println("This is your to-do list: ");
        ToDoList[] doLists = ToDoList.values();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your choice: Press 1 for Add task, 2 for View all tasks,3 for Delete task (by number),4 for Exit menu");
        int choice = scanner.nextInt();

        switch (choice){
            case 1, 2, 3, 4 -> System.out.println("Your choice is: " + doLists[choice - 1].getAction());

            default -> System.out.println("Your chois is wrong!");

        }
    }
}
