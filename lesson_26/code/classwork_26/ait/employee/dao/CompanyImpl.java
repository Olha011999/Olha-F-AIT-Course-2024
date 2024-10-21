package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;
import classwork_26.ait.employee.model.SalesManager;

public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;

    //capasity  максимальное количество людей на фирме
    public CompanyImpl(int capacity) {
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
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager){
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public double averageSalary() {
        if (size == 0){
            return  0;//если сотрудников нет, тогда возвращаем 0
        }
        return totalSalary()/size;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;

        // Сначала считаем количество сотрудников с часами больше чем 'hours'
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getHours() > hours) {
                count++;
            }
        }

        // Создаем новый массив для сотрудников, которые соответствуют критерию
        Employee[] result = new Employee[count];
        int index = 0;

        // Заполняем массив результатами
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getHours() > hours) {
                result[index] = employees[i];
                index++;
            }
        }

        return result;
    }

    @Override
    public Employee[] findEmployeSalaryRange(double minSalalry, double maxSalary) {
        Employee[] result = new Employee[size];// массив для хранения результатов
        int count = 0;

        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= minSalalry && salary <= maxSalary ){
                result[count++] = employees[i];
            }
        }
        return new Employee[]{result[count++]};
    }


}
