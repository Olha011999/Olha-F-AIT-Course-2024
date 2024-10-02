package homework_17.solutionForCube.method;

public class Cube {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double perimeterCube(){
       return 12*a;
    }

    public double volumeCube (){
        return a*a*a;
    }

    public double areaCube(){
        return 6*a*a;
    }

    public void display(){
        System.out.println("The side of the cube is: " +a + ", perimeter cube: " + perimeterCube()+ ", volum cube: "+ volumeCube()+ ", area cube: "+ areaCube());
    }

}
