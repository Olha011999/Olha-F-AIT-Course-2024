package homework_43;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()
public class StudentGrades {

    private static final int NUM_STUDENTS = 20; // Количество студентов
    private static final int NUM_SUBJECTS = 10; // Количество предметов
    private static final int MIN_GRADE = 1;     // Минимальная оценка
    private static final int MAX_GRADE = 5;     // Максимальная оценка

    public static void main(String[] args) {
        List<Student> students = generateStudentData();

        // Находим студента с максимальным средним баллом
        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))// нужно сравнивать студентов по их среднему баллу, полученному из метода getAverageGrade(). Метод max находит студента с самым высоким средним баллом и возвращает его.
                .orElse(null);

        // Находим студента с минимальным средним баллом
        Student bottomStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade))
                .orElse(null);

        System.out.println("Student with Highest Average Grade: " + topStudent);
        System.out.println("Student with Lowest Average Grade: " + bottomStudent);
    }

    // Метод для генерации данных о студентах
    private static List<Student> generateStudentData() {
        Random random = new Random();
        return IntStream.range(1, NUM_STUDENTS + 1)
                .mapToObj(i -> new Student("Student" + i, randomGrades(NUM_SUBJECTS, random)))//Преобразует каждый элемент в потоке (например, индекс i) в объект Student.
                .collect(Collectors.toList());//Собирает преобразованные объекты Student в список (List<Student>).
    }

    // Метод для генерации случайных оценок для студента
    private static List<Integer> randomGrades(int count, Random random) {
        return IntStream.range(0, count)
                .mapToObj(i -> MIN_GRADE + random.nextInt(MAX_GRADE - MIN_GRADE + 1))
                .collect(Collectors.toList());
    }

    // Внутренний класс Student
    static class Student {
        private String name;
        private List<Integer> grades;

        public Student(String name, List<Integer> grades) {
            this.name = name;
            this.grades = grades;
        }

        // Метод для вычисления среднего балла
        public double getAverageGrade() {
            return grades.stream()
                    .mapToInt(Integer::intValue)//mapToInt(...) преобразует поток объектов Integer в поток примитивных значений int.            Integer::intValue — это метод-ссылка, которая извлекает целочисленное значение (int) из каждого объекта Integer.
                    .average()
                    .orElse(0.0);
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', averageGrade=" + getAverageGrade() + "}";
        }
    }
}
