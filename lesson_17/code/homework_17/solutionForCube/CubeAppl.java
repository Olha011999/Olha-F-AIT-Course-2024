package homework_17.solutionForCube;

import homework_17.solutionForCube.method.Cube;

public class CubeAppl {

    public static void main(String[] args) {

        Cube cube1 = new Cube(6.0d);
        Cube cube2 = new Cube(88.0d);
        Cube cube3 = new Cube(25.0d);

        cube1.areaCube();
        cube1.perimeterCube();
        cube1.volumeCube();
        cube1.display();

        cube2.areaCube();
        cube2.perimeterCube();
        cube2.volumeCube();
        cube2.display();


        cube3.areaCube();
        cube3.perimeterCube();
        cube3.volumeCube();
        cube3.display();


    }
}
