package homework_21.elemebtsOfArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementaOfArrayTest {

ElementaOfArray elementaOfArray;
int [] array = {20, 30, -5, -10, 14, 0};

    @Test
    void findMinElement(){
        // expected
        int expected = -10;

        //actual
        int actual = ElementaOfArray.minElementInArray(array);
        assertEquals(expected,actual);
    }

    @Test
    void findMaxElement(){
        // expected
        int expected = 30;

        //actual
        int actual = ElementaOfArray.maxElementInArray(array);
        assertEquals(expected,actual);
    }

    @Test
    void findMinIndex(){
        // expected
        int expected = 3;

        //actual
        int actual = ElementaOfArray.minIndexInArray(array);
        assertEquals(expected,actual);
    }

    @Test
    void findMaxIndex(){
        // expected
        int expected = 1;

        //actual
        int actual = ElementaOfArray.maxIndexInArray(array);
        assertEquals(expected,actual);
    }


}