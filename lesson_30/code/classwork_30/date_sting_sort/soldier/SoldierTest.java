package classwork_30.date_sting_sort.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
//- John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann", 162, 55, 88

class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[]{

        new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("John", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)
        };
    }

    //- отсортировать солдат "естественным" образом - по росту
    @Test
    void nativeSortingTest(){
        System.out.println("--------Print as is------------");
        printArraySoldier(soldiers);
        Arrays.sort(soldiers);//native by default,по умолчанию родной
        System.out.println("--------Print after native sorting------------");
        printArraySoldier(soldiers);

    }

    //- отсортировать по имени
    @Test
    void sortingByNameTest(){
        Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier soldier1, Soldier soldier2) {
                //return soldier1.getName().compareTo(soldier2.getName());
                return -soldier1.getName().compareTo(soldier2.getName());//если поменять местами или в этом выражении перед первым солдатом поставить минус, список будет отображаться в обратном порядке
                //return soldier2.getName().compareTo(soldier1.getName());
            }
        };
        System.out.println("--------Print as is------------");
        printArraySoldier(soldiers);
        Arrays.sort(soldiers, comparatorByName);//native by default,по умолчанию родной
        System.out.println("--------Print after sorting by name------------");
        printArraySoldier(soldiers);

    }


    //- по весу
    @Test
    void sortingByWeightTest(){
        System.out.println("--------Print as is------------");
        printArraySoldier(soldiers);
        Arrays.sort(soldiers, (s1, s2) ->Double.compare(s1.getWeight(), s2.getWeight()));
        System.out.println("--------Print after sorting by weight------------");
        printArraySoldier(soldiers);

    }


    //two and more factors for sorting
    @Test
    void testByNameAndHeight(){
        Comparator<Soldier> comparatorByNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res !=0 ? res : Integer.compare(o1.getHeight(), o2.getHeight()) ;//or    (o1.getHeight() - o2.getHeight());
            }
        };
        System.out.println("--------Print as is------------");
        printArraySoldier(soldiers);
        Arrays.sort(soldiers,comparatorByNameAndHeight);
        System.out.println("--------Print after sorting by  name and height------------");
        printArraySoldier(soldiers);

    }


    //- по значению profile
    @Test
    void testSortSoldiersByProfile(){
        printArraySoldier(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile
            return res !=0 ? res : - s1.getHeight() + s2.getHeight();// or  Integer.compare(s1.getHeight(), s2.getHeight())
        });
        printArraySoldier(soldiers);
    }


    //- проверить работу метода binarySearch на массиве объектов
    @Test
    void binarySearchTest(){
        System.out.println("--------Print as is------------");
        printArraySoldier(soldiers);
        Arrays.sort(soldiers, (s1, s2)->(s1.getProfile() - s2.getProfile()));
        System.out.println("--------Print after sorting by  Profile------------");
        printArraySoldier(soldiers);

        //create object - pattern for searching
        Soldier pattern = new Soldier(null, 0, 0, 91);

        int index = Arrays.binarySearch(soldiers, pattern, (s1, s2)-> (s1.getProfile() - s2.getProfile()));

        System.out.println("Index = "+ index);
    }



    public void printArraySoldier(Object[] array){// прописали условия, чтобы метод был универсальным и можно было использовать с любого места
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}