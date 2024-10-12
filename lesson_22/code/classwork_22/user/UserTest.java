package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    User user;

    final String email = "peter@mail.de"; //ideal email
    final String password = "123456Az!"; //ideal password

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
    void testSetPassword(){
        assertEquals("123456Az!", user.getPassword());
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

    //- требования к password:
    //  1) length >= 8
    //  2) min one digit
    //  3) min one symbol in upperCase
    //  4) min one symbol in lowerCase
    //  5) min one special symbol (!%@$&)
    //  6) length < 20

    @Test
    void setValidPasswordLenght() {
        user.setPassword("1234Az!"); //7 symbol
        assertEquals("123456Az!", user.getPassword()); //email didn't change
        user.setPassword("123456123456123456Az!"); //21 symbol
        assertEquals("123456Az!", user.getPassword()); //email didn't change
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
    void setValidPasswordOneLowerCase(){
        user.setPassword("1234AZ!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneSpecialSymbol(){
        user.setPassword("1234Az");
        assertEquals("123456Az!", user.getPassword());
    }
}