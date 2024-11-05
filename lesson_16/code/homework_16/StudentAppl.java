package homework_16;

import homework_16.model.Student;

public class StudentAppl {

    public static void main(String[] args) {

        Student student1 = new Student(1,"S1", "ST1", 1998,"Mathematics");
        Student student2 = new Student(2,"S2", "ST2", 2000,"Physics");
        Student student3 = new Student(3,"S3", "ST3", 2001,"Biology");

        // display information about each student
        System.out.println(student1.displayStudents());
        System.out.println(student2.displayStudents());
        System.out.println(student3.displayStudents());

        //display of the learning process
        System.out.println();
        System.out.println("Student studies");
        student1.study();
        student2.study();
        student3.study();

        System.out.println();
        System.out.println("StudentRegistration who are on vacation");
        student1.tookVacation();

        System.out.println();
        System.out.println("StudentRegistration who passed the exam");
        student2.passedExam();
        student3.passedExam();



    }
}
