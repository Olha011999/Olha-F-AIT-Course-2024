package homework_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsMathTest {

    ArrayMethodsMath arrayMethodsMath;
    int[] array = {10, -10, 20, -15, 45, 23, 46, 0};


    @BeforeEach
    void setUp() {
        arrayMethodsMath = new ArrayMethodsMath(array);
    }

    @Test
    void countPositiveNumbers(){
        int expected = 5;
        int actual = arrayMethodsMath.countPositiveNumbers(array);
        assertEquals(expected,actual);
    }


    @Test
    void countNegativeNumbers(){
        int expected = 2;
        int actual = arrayMethodsMath.countNegativeNumbers(array);
        assertEquals(expected,actual);
    }


    @Test
    void countEvenNumbers(){
        int expected = 5;
        int actual = arrayMethodsMath.countEvenNumbers(array);
        assertEquals(expected,actual);
    }


    @Test
    void countZeros(){
        int expected = 1;
        int actual = arrayMethodsMath.countZeros(array);
        assertEquals(expected,actual);
    }

}