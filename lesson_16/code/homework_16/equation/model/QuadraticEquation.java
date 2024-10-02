package homework_16.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    //conatructor


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters and setters


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
//print quadratic equation
    public void display(){
        System.out.println("Quadratic equation: " + a+ "x^2 +" +b+ "x +" + c+" = 0");
    }

//calculation of discriminant
    public double delta(){
        return b*b-4*a*c;
    }
//Determining the number of solutions
    public int quantityRoots(){
        double discriminant = delta();
        if (discriminant > 0) {
            return 2; // two roots
        } else if (discriminant == 0) {
            return 1; // one root
        } else {
            return 0; // no roots
        }

    }
}
