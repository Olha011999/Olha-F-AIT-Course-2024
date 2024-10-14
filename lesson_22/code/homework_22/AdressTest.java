package homework_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdressTest {

    Adress adress;
    String city = "Odessa";
    String postalCode = "67665";
    String street = "Uspenskaj";

    @BeforeEach
    void setUp() {
        adress = new Adress(city, postalCode, street);
    }

    @Test
    void testSityValidation(){
        String expected = "dessa";
        boolean actual = adress.isSityValid();
        assertEquals(expected,actual);
    }
}