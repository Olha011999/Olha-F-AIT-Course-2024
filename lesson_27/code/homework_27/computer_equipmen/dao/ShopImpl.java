package homework_27.computer_equipmen.dao;

import homework_27.computer_equipmen.model.ComputerEquipment;

public class ShopImpl implements ShopInterface {
    @Override
    public ComputerEquipment[] findDiscountedComputers(ComputerEquipment[] computers) {
        // First, count how many computers are discounted
        int count = 0;
        for (ComputerEquipment computer : computers) {
            if (computer.isDiscounted()) { // Assuming ComputerEquipment has a method isDiscounted()
                count++;
            }
        }

        // Create an array to hold the discounted computers
        ComputerEquipment[] discountedComputers = new ComputerEquipment[count];

        // Add the discounted computers to the new array
        int index = 0;
        for (ComputerEquipment computer : computers) {
            if (computer.isDiscounted()) {
                discountedComputers[index++] = computer;
            }
        }

        return discountedComputers; // Return the array of discounted computers
    }
}
