package homework_38.temterature;

import java.time.LocalDate;
import java.util.Objects;

public class Temperature {

    private LocalDate date;
    private double temperature;

    public Temperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temperature that)) return false;
        return Double.compare(temperature, that.temperature) == 0 && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, temperature);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Temperature{");
        sb.append("date=").append(date);
        sb.append(", temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }
}
