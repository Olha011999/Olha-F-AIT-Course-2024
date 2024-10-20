package homework_27.computer_equipmen.model;

public class SmartPhone extends ComputerEquipment {

    private String operatingSystem;

    public SmartPhone(double price, String name, long barCode, boolean blackFridayDiscount, String operatingSystem) {
        super(price, name, barCode, blackFridayDiscount);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "operatingSystem='" + operatingSystem + '\'' +
                "} " + super.toString();
    }
}
