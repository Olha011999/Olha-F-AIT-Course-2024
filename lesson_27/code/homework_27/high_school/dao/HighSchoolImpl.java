package homework_27.high_school.dao;

import homework_27.high_school.model.HighSchool;
import homework_27.high_school.model.Person;
import homework_27.high_school.model.Student;

public class HighSchoolImpl implements HighSchoolInterface {

        private Person[] people;
        private int count;

        public HighSchoolImpl(int size) {
            this.people = new Person[size];
            this.count = 0;
        }

        @Override
        public boolean addPerson(Person person) {
            if (count < people.length) {
                people[count] = person;
                count++;
                return true;
            } else {
                System.out.println("The list is full. Cannot add more people.");
                return false;
            }
        }

        @Override
        public void removePerson(int index) {
            if (index >= 0 && index < count) {
                for (int i = index; i < count - 1; i++) {
                    people[i] = people[i + 1];
                }
                people[count - 1] = null;
                count--;
            } else {
                System.out.println("Invalid index.");
            }
        }

        @Override
        public void printPeople() {
            for (int i = 0; i < count; i++) {
                System.out.println(people[i]);
            }
        }

        @Override
        public double getAverageGrade() {
            double totalGrade = 0;
            int studentSize = 0;
            for (int i = 0; i < count; i++) {
                if (people[i] instanceof Student) {
                    Student student = (Student) people[i];
                    totalGrade += student.getAverageGrade();
                    studentSize++;
                }
            }
            return studentSize == 0 ? 0 : totalGrade / studentSize;
        }

        @Override
        public void findStudentsWithGradeInRange(double min, double max) {
            for (int i = 0; i < count; i++) {
                if (people[i] instanceof Student) {
                    Student student = (Student) people[i];
                    if (student.getAverageGrade() >= min && student.getAverageGrade() <= max) {
                        System.out.println(student);
                    }
                }
            }
        }

        @Override
        public int countPeople() {
            return count;
        }

    @Override
    public int getCount() {
          return count; // или return count; в зависимости от вашей логики

    }
}

