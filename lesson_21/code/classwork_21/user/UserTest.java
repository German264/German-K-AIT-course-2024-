package classwork_21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    final String email = "peter@mail.de"; //ideal email
    final String password = "123456Az"; //ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password); //create new 'fresh' object user
    }

    @Test
    void testValidEmail(){
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailNoAt() {
        String email = "petermail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    @Test
    void setEmailNoDot(){
        String email = "peter@mailde"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange

    }

    @Test
    void setEmailDotPosition() {
        String email = "peter@maild.e"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    @Test
    void setEmailNoLetter(){
        String email = "peter#@mail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    //Тест провален на недопустимых значениях:
    //pe..ter@mail.de (две точки подряд)
    //peter@.mail.de (начало домена с точки)
    //peter@mail..de (две точки подряд в домене)

    @Test
    void setEmailFalse1(){
        String email = "pe..ter@mail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    @Test
    void setEmailFalse2(){
        String email = "peter@.mail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    @Test
    void setEmailFalse3() {
        String email = "peter@mail..de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail()); //email didn'd cange
    }

    @Test
    void setPassword(){

    }
}