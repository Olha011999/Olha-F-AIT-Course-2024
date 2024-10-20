package homework_27.computer_equipmen.dao;

import homework_27.computer_equipmen.model.ComputerEquipment;

public interface ShopInterface {


    ComputerEquipment[] findDiscountedComputers(ComputerEquipment[] computers);
}
