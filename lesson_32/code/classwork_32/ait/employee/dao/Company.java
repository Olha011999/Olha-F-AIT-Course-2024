package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;

import java.util.function.Predicate;//- добавление сотрудника
//- нахождение сотрудника по id
//- обновление cотрудника
//- удаление сотрудника
//- печать списка сотрудников
//- кол-во сотрудников
//- объем ФОТ
//- объем продаж

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee (int id);

    Employee updateEmployee(Employee employee);//обновить

    int quantity();

    void printEmployee();

    double totalSalary();

    double totalSales();

    double averageSalary();

    Employee[] findEmployeeHoursGreaterThan(int hours);

    Employee[] findEmployeSalaryRange(double minSalalry, double maxSalary);

    Employee[] findEmployeByPredicate(Predicate<Employee> predicate);
}
