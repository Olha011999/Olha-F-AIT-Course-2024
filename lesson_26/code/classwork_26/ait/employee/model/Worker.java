package classwork_26.ait.employee.model;
////- Worker: grade*hours
public class Worker extends Employee {

    private  int grade;

    public Worker(int id, String firstName, String secondName, double hours, int grade) {
        super(id, firstName, secondName, hours);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }



    @Override
    public double calcSalary() {
        double salary = grade * hours;
        return ensureSalary(salary);
    }
}
