package homework_33.to_do_list;
//Задача 2. Начать реализацию приложения "Список дел".
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
//Реализовать метод printMenu().
public enum ToDoList {

ADD(1, "Add task"), VIEW(2,"View all tasks"), DELETE(3, "Delete task (by number)"), EXIT(4, "Exit menu");


    private int itemNumber;
    private String action;

    ToDoList(int itemNumber, String action) {
        this.itemNumber = itemNumber;
        this.action = action;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToDoList{");
        sb.append("itemNumber=").append(itemNumber);
        sb.append(", action='").append(action).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void printMenu() {
        System.out.println("Menu:");
        ToDoList[] doLists = ToDoList.values();
        for (int i = 0; i < doLists.length; i++) {
            System.out.println(doLists[i].toString());
        }

        }

}
