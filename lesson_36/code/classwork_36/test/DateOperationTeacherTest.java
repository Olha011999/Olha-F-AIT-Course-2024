package classwork_36.test;

import classwork_36.utils.DateOperationTeacher;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTeacherTest {

    @Test
    void getAge() {
        assertEquals(63, DateOperationTeacher.getAge("12/04/1961"));
        assertEquals(62, DateOperationTeacher.getAge("1961-11-28"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperationTeacher.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        assertArrayEquals(expected, actual);
    }


    @Test
    void testSort(){
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        Arrays.sort(dates);
        printArray(dates);

    }

    @Test
    void testArrayStringToLocalDate(){
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        LocalDate[] res = DateOperationTeacher.convertStringsToDates(dates);
        printArray(res);
    }

    private void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------------------------------");
    }
}