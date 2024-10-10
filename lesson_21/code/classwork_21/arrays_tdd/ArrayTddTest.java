package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {
    ArrayTdd arrayTdd;
    int[] array = {10, -10, 20, -15, 45, 23, 46};


    @BeforeEach
    void setUp() {

        arrayTdd = new ArrayTdd(array);
    }

    @Test
    void countPositiv(){
        // expected
        int expected = 5;

        //actual
        int actual = arrayTdd.countPositive(array);

        assertEquals(expected, actual, "Bad info: ");
    }
}