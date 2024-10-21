package homework_27.high_school.dao;

import homework_27.high_school.model.Person;

public interface HighSchoolInterface {

    boolean addPerson(Person person);
    void removePerson(int index);
    void printPeople();
    double getAverageGrade();
    void findStudentsWithGradeInRange(double min, double max);
    int countPeople();
    int getCount();

}
