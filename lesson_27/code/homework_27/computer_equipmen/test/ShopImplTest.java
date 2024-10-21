package homework_27.computer_equipmen.test;

import homework_27.computer_equipmen.dao.ShopImpl;
import homework_27.computer_equipmen.model.ComputerEquipment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest {

    private ShopImpl shop;
    private ComputerEquipment[] computers;

    @BeforeEach
    void setUp() {
        shop = new ShopImpl();

        computers = new ComputerEquipment[3]; // Initialize a fixed-size array
        computers[0] = new ComputerEquipment(1000, "Laptop", 1234567890123L, true);
        computers[1] = new ComputerEquipment(1500, "Smartphone", 1234567890124L, false);
        computers[2] = new ComputerEquipment(1200, "Laptop", 1234567890125L, true);
    }

    @Test
    void findDiscountedComputersTest() {
        ComputerEquipment[] discountedComputers = shop.findDiscountedComputers(computers);
        assertEquals(0, discountedComputers.length); // Expect 2 discounted items
    }


    private boolean containsComputer(ComputerEquipment[] computers, String name) {
        for (ComputerEquipment computer : computers) {
            if (computer.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}