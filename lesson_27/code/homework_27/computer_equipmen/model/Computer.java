package homework_27.computer_equipmen.model;

public class Computer extends ComputerEquipment {

    public Computer(double price, String name, long barCode, boolean blackFridayDiscount) {
        super(price, name, barCode, blackFridayDiscount);
    }

    public boolean hasBlackFridayDiscount() {
        return blackFridayDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Computer{" +
                "blackFridayDiscount=" + blackFridayDiscount +
                '}';
    }

}
