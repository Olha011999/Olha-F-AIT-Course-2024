package homework_27.high_school.model;

import java.util.Objects;

public class Student extends Person {

    private double averageGrade;

    public Student(int size, String name, int age, double averageGrade) {
        super(size, name, age);
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(averageGrade, student.averageGrade) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), averageGrade);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("averageGrade=").append(averageGrade);
        sb.append('}');
        return sb.toString();
    }
}
