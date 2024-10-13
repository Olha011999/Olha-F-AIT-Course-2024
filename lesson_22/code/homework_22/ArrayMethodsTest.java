package homework_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethods;
    int[] array = {10, -10, 20, -15, 45, 23};

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods(array);
    }


    @Test
    void sumOfElementsWithOddIndex() {
        // expected
        int expected = -2;
        //actual
        int actual =arrayMethods.sumOfElementsWithOddIndex(array);
        assertEquals(expected, actual, "wrong");

    }


    @Test
    void  getFifthElement(){
        // expected
        int expected = 45;
        //actual
        int actual =arrayMethods.getFifthElement(array);
        assertEquals(expected, actual);
    }

    @Test
    void cantGetFifthElementShortArray(){

    int[] array1 = {10, -10, 20, -15};
        // expected
        int expected = 0;
        //actual
        int actual =arrayMethods.getFifthElement(array1);
        assertEquals(expected, actual);

    }
}