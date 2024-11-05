package homework_27.high_school.test;

import homework_27.high_school.dao.HighSchoolImpl;
import homework_27.high_school.model.Aspirant;
import homework_27.high_school.model.Person;
import homework_27.high_school.model.Professor;
import homework_27.high_school.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighSchoolImplTest {

    private HighSchoolImpl highSchool;

    @BeforeEach
    void setUp() {
        // Создаем институт с вместимостью для 5 человек
        highSchool = new HighSchoolImpl(5);
    }

    @Test
    void addPerson() {
        // Добавляем студента и проверяем, что добавление прошло успешно
        Person student = new Student(1 ,"John", 20, 4.5);
        assertTrue(highSchool.addPerson(student));
    }

    @Test
    void removePerson() {
        // Добавляем студента, а затем удаляем его
        Person student = new Student(2,"Alice", 22, 3.8);
        highSchool.addPerson(student);

        // Проверяем, что человек добавлен
        assertEquals(1, highSchool.countPeople());

        // Удаляем человека
        highSchool.removePerson(0);

        // Проверяем, что человек удален
        assertEquals(0, highSchool.countPeople());
    }

    @Test
    void printPeople() {
        HighSchoolImpl highSchool = new HighSchoolImpl(10);
        Person person1 = new Person(3,"Alice", 20);
        Person person2 = new Person(4,"Bob", 22);

        highSchool.addPerson(person1);
        highSchool.addPerson(person2);

        // Сохраняем стандартный вывод
        System.out.println(person1);
        System.out.println(person2);

        // Проверяем, что люди добавлены
        assertEquals(2, highSchool.getCount());
    }

    @Test
    void getAverageGrade() {
        // Добавляем нескольких студентов
        highSchool.addPerson(new Student(3,"Alice", 21, 4.0));
        highSchool.addPerson(new Student(4,"Bob", 22, 3.5));
        highSchool.addPerson(new Student(5,"John", 23, 4.5));

        // Проверяем правильность средней оценки
        assertEquals(4.0, highSchool.getAverageGrade(), 0.001);
    }

    @Test
    void findStudentsWithGradeInRange() {
        // Добавляем студентов с разными оценками
        highSchool.addPerson(new Student(3,"Alice", 21, 4.0));
        highSchool.addPerson(new Student(4,"Bob", 22, 3.5));
        highSchool.addPerson(new Student(5,"John", 23, 4.5));

        // Выводим студентов с оценками в диапазоне 3.0 - 4.0
        System.out.println("StudentRegistration with grades between 3.0 and 4.0:");
        highSchool.findStudentsWithGradeInRange(3.0, 4.0);

        // Ожидается, что будут найдены студенты Alice и Bob
    }

    @Test
    void countPeople() {
        // Добавляем профессора и аспиранта
        highSchool.addPerson(new Professor(6,"Dr. Smith", 45, "Mathematics"));
        highSchool.addPerson(new Aspirant(7,"John Doe", 28, 4.3, "AI Research"));

        // Проверяем количество людей в школе
        assertEquals(2, highSchool.countPeople());
    }
    }
