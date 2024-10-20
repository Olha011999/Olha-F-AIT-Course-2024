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

        //create object
        company = new CompaneImpl(5);

        //fill array to fill object company
        employees = new Employee[4];
        employees[0] = new Manager(1, "N1", "SN1", 160, 5000, 25);
        employees[1] = new SalesManager(2, "N2", "SN2", 160, 50000, 0.1);
        employees[2] = new SalesManager(3, "N3", "SN3", 160, 80000, 0.15);
        employees[3] = new Worker(4, "N4", "SN4", 160, 20);

        //TODO поместить объекты employees[] в объект company с помощью метода addEmployee

        for (int i = 0; i < 4; i++) {
            company.addEmployee(employees[i]);
        }
    }

    @Test
    void addEmployeeTest() {
        //check size
        assertEquals(4, company.quantity());

        // can't add null
        assertFalse(company.addEmployee(null));

        //can't add duplicate
        assertFalse(company.addEmployee(employees[1]));

        //can add new one employee
        Employee newEmployee = new Worker(5, "N5", "SN5", 160, 20);
        assertTrue(company.addEmployee(newEmployee));

        //check quantity=size
        assertEquals(5, company.quantity());

        //can't one more employee
        Employee oneMoreEmployee = new Worker(6, "N6", "SN6", 160, 20);
        assertFalse(company.addEmployee(oneMoreEmployee));

    }

    @Test
    void removeEmployeeTest() {
        //can remove(удалить) existed
        assertEquals( employees[1], company.removeEmployee(2));

        //check size
        assertEquals(3, company.quantity());

        //can't remove absent
        assertNull(company.removeEmployee(7));


    }

    @Test
    void findEmployeeTest() {
        //find existed
        assertEquals(employees[2], company.findEmployee(3));

        //find absent
        assertNull(company.findEmployee(7));
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();
        //методы типа void  не проверяются с помощью assert...
    }

    @Test
    void totalSalaryTest() {

    }

    @Test
    void totalSalesTest() {
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
    }

    @Test
    void findEmployeSalaryRangeTest() {
    }
}