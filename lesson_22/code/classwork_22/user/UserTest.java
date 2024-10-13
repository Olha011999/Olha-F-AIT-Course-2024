package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    User user;

    final String email = "peter@mail.de";// ideal email
    final String password = "123456Az!";// ideal password



    @BeforeEach
    void setUp() {
        user = new User(email, password);//create new "fresh" object user
    }

    @Test
    void testValidPassword(){
        assertEquals("123456Az!", user.getPassword());
    }


    @Test
    void testValidEmail(){
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }


    @Test
    void setEmailWithTwoDots(){
        String email = "peter@mail..de";
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
        System.out.println(user.getEmail());
    }



    @Test
    void setEmailNoAt() {
        String email = "petermail.de";// wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());// email didn't change
    }

    @Test
    void setPassword() {


    }
    @Test
    void setValidPasswordLength(){
        user.setPassword("1234Az!");// 7 symbols
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456123456123456Az!");// 21 symbol
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordMinOneDigit(){
        user.setPassword("Asdfghj!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterUpperCase(){
        user.setPassword("1234az!");
        assertEquals("123456Az!", user.getPassword());
    }


    @Test
    void setValidPasswordOneLetterLawerCase(){
        user.setPassword("1234AZ!");
        assertEquals("123456Az!", user.getPassword());
    }
    @Test
    void setValidPasswordOneSpecialSymbol(){
        user.setPassword("1234aZ");
        assertEquals("123456Az!", user.getPassword());
    }


}