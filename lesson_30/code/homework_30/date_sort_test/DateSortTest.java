package homework_30.date_sort_test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    Comparator<DateSort> dateComparator;
    DateSort[] dates;

    @BeforeEach
    void setUp() {
        dates = new DateSort[]{
                new DateSort (16, 6, 1970),
                new DateSort(7, 5, 1990),
                new DateSort( 11,8,1990),
                new DateSort (15, 1, 2010),
                new DateSort(28,1,2010)

        };
        dateComparator = new Comparator<DateSort>() {
            @Override
            public int compare(DateSort o1, DateSort o2) {
                if (o1.year != o2.year){
                    return o1.year - o2.year;
                } else if (o1.month != o2.month) {
                    return o1.month - o2.month;
                }else {
                    return o1.day - o2.day;
                }
            }
        };
    }

    @Test
    void testDateSort() {
        DateSort[] expected = {
                new DateSort(16, 6, 1970),
                new DateSort(07,5,1990),
                new DateSort( 11,8,1990),
                new DateSort (15, 1, 2010),
                new DateSort (28, 1, 2010)
        };

        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);

    }

    public void printDate(DateSort[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
