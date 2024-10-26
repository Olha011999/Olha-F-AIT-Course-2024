package classwork_32.ait.employee.model;

import java.util.Objects;

public abstract class Employee {

    protected static double minWage = 12.48; // or (MIN_WAGE)
    protected final int id;
    protected String firstName;
    protected String secondName;
    protected double hours;

    public static double getMinWage(){
        return minWage;
    }

    public static void setMinWage(double minWage){
        if (minWage > Employee.minWage){
            Employee.minWage = minWage;
        }
    }

    public Employee(int id, String firstName, String secondName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());// добавили зп в распечатку
        sb.append('}');
        return sb.toString();
    }

    //methods for salary
    public abstract double calcSalary();

    protected double ensureSalary(double salary){
        if (salary < hours * minWage){
            System.out.println("Set min salary");
            salary = hours * minWage;
        }
        return salary;
    }
}
