package classwork_16.employee;

import classwork_16.employee.model.Emploee;

public class FirmaAppl {

    public static void main(String[] args) {

        Emploee e1 = new Emploee(1,"Olha", "Fatina", 3000, true);
        Emploee e2 = new Emploee(2,"N2", "LN2", 4000, true);
        Emploee e3 = new Emploee(2,"N3", "LN3", 5000, false);
        Emploee e4 = new Emploee(2,"N4", "LN4", 6000, false);
        Emploee e5 = new Emploee(2,"N5", "LN5", 7000, true);

        System.out.println(e1.displayEmployee());// печатаем все данные по сотруднику
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());
        System.out.println(e4.displayEmployee());
        System.out.println(e5.displayEmployee());

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary() +e4.getSalary() + e5.getSalary();
        System.out.println("Totol salary= " + totalSalary);

        Emploee[] emploees= new Emploee[5];
        emploees[0]=e1;
        emploees[1]=e2;
        emploees[2]=e3;
        emploees[3]=e4;
        emploees[4]=e5;

        totalSalary=0;
        for (int i=0; i< emploees.length; i++){
            totalSalary +=emploees[i].getSalary();
        }
        System.out.println(totalSalary);

        e5.setSalary(7000);
    }
}
