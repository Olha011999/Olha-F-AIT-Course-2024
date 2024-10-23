package classwork_29.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class WineTest {

    Wine[] wines;


    @BeforeEach
    void setUp() {
        wines = new Wine[5];
        wines[0] = new Wine("type1", "AAA", 2021, 6);
        wines[1] = new Wine("type2", "CCC", 2022, 7);
        wines[2] = new Wine("type3", "XXX", 2023, 8);
        wines[3] = new Wine("type1", "OOO", 2024, 9);
        wines[4] = new Wine("type2", "SSS", 2020, 5);
    }

    @Test
    void sortWineByAgeTest(){
        System.out.println("-----------List wines as is");
        printWines();
        Arrays.sort(wines);
        System.out.println("-----------List wines sorted by age");
        printWines();

    }

    @Test
    void sortWineByPriceTest(){

        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return Double.compare(w1.getPrice(), w2.getPrice());
                //(int) (w1.getPrice() - w2.getPrice());// -  это сравнение
            }
        };
        System.out.println("-----------List wines as is");
        printWines();
        Arrays.sort(wines, comparatorByPrice);// sorting by price
        System.out.println("-----------List wines sorted by price");
        printWines();

    }

    @Test
    void sortWineByTitleTest(){
        Comparator<Wine> wineComparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitle().compareTo(w2.getTitle());
            }
        };
        System.out.println("-----------List wines as is");
        printWines();
        Arrays.sort(wines, wineComparatorByTitle);
        System.out.println("-----------List wines sorted by title");
        printWines();
    }


    @Test
    void printWines(){

        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }

}