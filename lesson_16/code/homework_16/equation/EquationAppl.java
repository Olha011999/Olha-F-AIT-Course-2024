package homework_16.equation;

import homework_16.equation.model.QuadraticEquation;

public class EquationAppl {

    public static void main(String[] args) {

        QuadraticEquation q1 = new QuadraticEquation(1,2,1);
        QuadraticEquation q2 = new QuadraticEquation(-5,0, 4);
        QuadraticEquation q3 = new QuadraticEquation(100, 2, 2);

        //solution of a quadratic equation
        q1.display();
        q2.display();
        q3.display();

        //calculation of discriminant
        System.out.println();
        System.out.println("Calculation of discriminant");
        System.out.println("For q1: " +q1.delta());
        System.out.println("For q2: " +q2.delta());
        System.out.println("For q3: " +q3.delta());

        //Number of roots
        System.out.println();
        System.out.println("Number of roots for q1: " + q1.quantityRoots());
        System.out.println("Number of roots for q2: " + q2.quantityRoots());
        System.out.println("Number of roots for q3: " + q3.quantityRoots());

    }
}
