package day10.practice;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_PATTERN = "^[a-z]+[a-z0-9._-]*@[a-z]+\\.[a-z]{2,}$";
        public static boolean isValidEmail(String emailId) throws InvalidEmailException {
            boolean chk = false ;
            // TODO Write your logic valid returns true else throw the above exception
            // Also create the user defined exception mentioned in throws


             return Pattern.matches(EMAIL_PATTERN, emailId);
        }

    public static void main(String[] args) {

            try{

            }catch (){
                
            }

    }
    }

