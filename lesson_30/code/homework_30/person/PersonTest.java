package homework_30.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class PersonTest {

    Person [] person;

    @BeforeEach
    void setUp() {

        person = new Person[]{
                new Person ("Simona", 25, 55.5),
                new Person ("Bob", 20, 61.0),
                new Person ("Galina", 49, 55.1),
                new Person("Danil", 38, 92.0)
        };
        

    }
    //- sort Persons in a "natural" way - by age

    @Test
    void sortPersonByAgeTest(){
        System.out.println("--------Print as is------------");
        printPersonArray(person);
        Arrays.sort(person);
        System.out.println("--------Print after native sorting------------");
        printPersonArray(person);
    }

    //two and more factors for sorting
    @Test
    void testByNameAndHAge(){
        Comparator<Person> comparatorByNameAndHAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int res = p1.getName().compareTo(p2.getName());
                return res !=0 ? res : Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        System.out.println("--------Print as is------------");
        printPersonArray(person);
        Arrays.sort(person, comparatorByNameAndHAge);
        System.out.println("--------Print after sorting  by name and age------------");
        printPersonArray(person);

    }

    @Test
    void testByWeightAndHAge(){
        Comparator<Person> comparatorByWeightAndHAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int res = Double.compare(p1.getWeight(), p2.getWeight());
                return res !=0 ? res : Integer.compare(p1.getAge(), p2.getAge());
            }
        };
        System.out.println("--------Print as is------------");
        printPersonArray(person);
        Arrays.sort(person, comparatorByWeightAndHAge);
        System.out.println("--------Print after sorting  by weight and age------------");
        printPersonArray(person);

    }

    @Test
    void binarySearchTest(){

        System.out.println("--------Print as is------------");
        printPersonArray(person);
        Arrays.sort(person, (w1, w2) ->Double.compare(w1.getWeight(), w2.getWeight()));
        System.out.println("--------Print after sorting  by weight ------------");
        printPersonArray(person);

        //create pattern

        Person pattern = new Person(null, 0, 61);
        int index = Arrays.binarySearch(person, pattern, (w1, w2) ->Double.compare(w1.getWeight(), w2.getWeight()));

        System.out.println("Index = " + index);
    }
    
    
    public void printPersonArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}