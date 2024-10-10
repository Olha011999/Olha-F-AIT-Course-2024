package classwork_21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; // object for testing


    @BeforeEach
    void setUp() {

        stringWithNumbers = new StringWithNumbers("123 321 10");//454 summa

    }

    @Test
    void sumOfNumbersInStringTest(){

        String str = "123 321 10";
        int expected = 454;
        //StringWithNumbers.sumOfNumbersInString();
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);
    }

}