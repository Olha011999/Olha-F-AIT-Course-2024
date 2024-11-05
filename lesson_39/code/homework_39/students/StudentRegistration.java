package homework_39.students;

import java.util.HashSet;
import java.util.Set;
//Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса. Список студентов, которые записаны только на один из курсов. Условия: Используйте два HashSet для хранения студентов каждого курса. Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.
public class StudentRegistration {
    public static void main(String[] args) {


        Set<String> mathematicsCourse = new HashSet<>();
        Set<String> computerScienceCourse = new HashSet<>();

        //adding students to the first Course
        mathematicsCourse.add("S1");
        mathematicsCourse.add("S2");
        mathematicsCourse.add("S3");
        mathematicsCourse.add("S4");
        mathematicsCourse.add("S5");

        System.out.println("The mathematics course is attended: ");
        for (String mathStudent : mathematicsCourse) {
            System.out.print(mathStudent + " , ");
        }
        System.out.println();

        //adding students to the second Course
        computerScienceCourse.add("S6");
        computerScienceCourse.add("S1");
        computerScienceCourse.add("S2");
        computerScienceCourse.add("S7");
        computerScienceCourse.add("S8");

        System.out.println("Computer science course is attended: ");
        for (String compStudent : computerScienceCourse) {
            System.out.print(compStudent + " , ");
        }

        System.out.println();
        // Найдем студентов, записанных на оба курса (пересечение множеств)
        // Find students enrolled in both courses (intersection of sets)

        Set<String> bothCourses = new HashSet<>(mathematicsCourse);
        bothCourses.retainAll(computerScienceCourse);
        System.out.println("Students attending both courses: " + bothCourses);

        // Find students enrolled in only one of the courses

        System.out.println();
        Set<String> onlyOneCourse = new HashSet<>(mathematicsCourse);
        onlyOneCourse.addAll(computerScienceCourse);
        onlyOneCourse.removeAll(bothCourses);
        System.out.println("Students attending only one of the courses: " + onlyOneCourse);
    }
}
