package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

public class CompaneImpl implements Company {

    private Employee[] employees;
    private int size;

    //capasity  максимальное количество людей на фирме
    public CompaneImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        //bad cases
        if (employee == null){
            return false;
        }
        if (size == employees.length){
            return false;
        }
        if (findEmployee(employee.getId()) != null ){
            return false;
        }

        //good cases
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size-1];//на место жертвы ставим(копируем) последний элемент массива
                employees[size-1] = null;// последний элемент делаем  null( затираем с помощью нул)
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }

    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeSalaryRange(double minSalalry, double maxSalary) {
        return new Employee[0];
    }


}
