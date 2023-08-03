package day10;

import day10.practice.InvalidEmailException;
import day10.practice.EmailValidator;
import org.junit.jupiter.api.Test;



public class EmailValidatorTest {
    @Test
    void testCase(){
        String email = "abdulRazak123@gmail.com";

        try {
            EmailValidator.checkEmail(email);
        }catch (InvalidEmailException e){

            System.out.println(e.getMessage());
        }

    }

}
