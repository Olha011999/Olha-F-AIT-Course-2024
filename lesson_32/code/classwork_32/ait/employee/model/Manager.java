package classwork_32.ait.employee.model;

public class Manager extends Employee {
//- создать дочерние классы Manager, SalesManager и Worker,
// реализовать в них методы начисления зарплаты:
// Manager: base + grade*hours

    private  double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String secondName, double hours, double baseSalary, int grade) {
        super(id, firstName, secondName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    @Override
    public double calcSalary() {
        double salary = baseSalary+ hours *grade;
        return ensureSalary(salary);//check min value of salary
    }

}
