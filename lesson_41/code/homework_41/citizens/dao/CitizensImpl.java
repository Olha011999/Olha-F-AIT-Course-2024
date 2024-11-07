package homework_41.citizens.dao;

import homework_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;//сравниваем фамилии двух людей
    private static Comparator<Person> ageComparator;// сравниваем возраст

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    // отсортированные списки по разным критериям,  если нужно получить всех людей по возрасту, можно использовать, напр. ageList, вместо того, чтобы каждый раз сортировать один и тот же список.
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    // конструктор без параметров, который создает пустые списки
    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    //конструктор с параметрами, заполняющий  списки данными. он вызывает метод add() для каждого объекта
    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O (log(n)) -
    //  ищем место для вставки бинарным поиском, вставка в ArrayList
    @Override
    public boolean add(Person person) {
        // если объект person равен null, то возвращаем false, чтобы не добавлять пустой объект в списки.
        if (person == null) {
            return false;
        }
        // c  помощью бинарного поиска ищем место для вставки "person"
        int index = Collections.binarySearch(idList, person); // определяем с помощью бинарного поиска, есть ли в idList такой объект "person"
        if (index >= 0) { // если index >= 0, это значит, что "person" уже существует в "idList", и мы не добавляем его повторно. Возвращаем false, чтобы обозначить, что добавление не выполнено.
            return false;
        }
        index = -index - 1; //Если "index" < 0, это означает, что "person" не найден, и значение "index" теперь указывает на предполагаемую позицию для вставки.        // Мы изменяем "index" на "-index - 1", чтобы получить корректную позицию для вставки нового элемента и сохранить порядок списка "idList".
        idList.add(index, person); // добавляем объект "person" в "idList" на определенную позицию
        // добавляем "person" в список "ageList", отсортированный по возрасту
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;// Рассчитываем корректную позицию для вставки
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true;
    }

    // O (n)
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        //удаление из всех списков
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O(log(n))
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // O(n)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    //  O(n)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    //  O(n)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    //  O(n)
    @Override
    public int size() {
        return idList.size();
    }
}
