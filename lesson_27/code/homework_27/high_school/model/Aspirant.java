package homework_27.high_school.model;

import java.util.Objects;

public class Aspirant extends Student {

    private String dissertation;

    public Aspirant(int size, String name, int age, double averageGrade, String dissertation) {
        super(size, name, age, averageGrade);
        this.dissertation = dissertation;
    }

    public String getDissertation() {
        return dissertation;
    }

    public void setDissertation(String dissertation) {
        this.dissertation = dissertation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aspirant aspirant)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(dissertation, aspirant.dissertation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dissertation);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aspirant{");
        sb.append("dissertation='").append(dissertation).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
