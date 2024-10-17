package classwork_26.ait.employee.test;

import classwork_26.ait.employee.dao.CompaneImpl;
import classwork_26.ait.employee.dao.Company;
import classwork_26.ait.employee.model.Employee;
import classwork_26.ait.employee.model.Manager;
import classwork_26.ait.employee.model.SalesManager;
import classwork_26.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompaneImplTest {

    Company company;
    Employee[] employees;


    @BeforeEach
    void setUp() {

        company = new CompaneImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1, "N1", "SN1", 160, 5000, 25);
        employees[1] = new SalesManager(2, "N2", "SN2", 160, 50000, 0.1);
        employees[2] = new SalesManager(3, "N3", "SN3", 160, 80000, 0.15);
        employees[3] = new Worker(4, "N4", "SN4", 160, 20);
    }

    @Test
    void addEmployee() {

    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void findEmployeeHoursGreaterThan() {
    }

    @Test
    void findEmployeSalaryRange() {
    }
}