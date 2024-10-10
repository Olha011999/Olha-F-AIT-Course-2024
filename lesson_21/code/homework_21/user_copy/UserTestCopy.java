package homework_21.user_copy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestCopy {

    UserCopy user;

    final String email = "peter@mail.de";// ideal email
    final String password = "123456Az!";// ideal password



    @BeforeEach
    void setUp() {

        user = new UserCopy(email, password);//create new "fresh" object user
    }

    @Test
    void testValidEmail(){

        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }



    @Test
    void setEmailNoAt() {
        String email = "petermail.de";// wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());// email didn't change
    }

    @Test
    void setEmailDoubleAtAndDot() {
        String email = ".@peter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }


    @Test
    void setEmailOnlyNumbersAndDots() {
        String email = "1234.5678.";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailWithUppercaseDe() {
        String email = "peter@mail.De";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailWithoutDotDe() {
        String email = "peter@mail"; // Имейл без ".de"
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); // Имейл не должен измениться
    }

    @Test
    void setEmailTwiceTheSame() {
        String email = "peter@mail.depeter@mail.de";
        user.setEmail(email);
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailStartsAndEndsWithDot() {
        String email = ".peter@mail.de.";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }


    @Test
    void setEmailNoDot() {}

    @Test
    void setPassword() {
    }
}