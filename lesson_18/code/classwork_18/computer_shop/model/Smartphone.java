package classwork_18.computer_shop.model;

public class Smartphone extends Laptop{

    private  long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int battaryLife, String color, long imei) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, battaryLife, color);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                "} " + super.toString();
    }
}
