package homework_27.computer_equipmen.dao;

import homework_27.computer_equipmen.model.ComputerEquipment;

public class ShopImpl implements ShopInterface {
    @Override
    public ComputerEquipment[] findDiscountedComputers(ComputerEquipment[] computers) {
        ComputerEquipment[] discountedComputersList = new ComputerEquipment();
        for (ComputerEquipment computer : computers) {
            if (computers.i()) { // предположим, что у класса Computer есть метод isDiscounted()
                discountedComputersList.add(computers);
            }
        }
        return discountedComputersList.toArray(new Computer[0]); // преобразование списка в массив
    }
}
