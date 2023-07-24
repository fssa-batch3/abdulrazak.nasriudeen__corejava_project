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

        public static void checkEmail(String mail) throws InvalidEmailException{
            boolean chk =  isValidEmail(mail);
            if(!chk){
                throw new InvalidEmailException("Your email is not valid ");
            } else{
                System.out.print("Email is valid ");
            }
        }

    public static void main(String[] args) {
//            String email = "invalid_email@dom-ain";
        String email = "abdulRazak123@gmail.com"; 

            try {
                checkEmail(email);
            }catch (InvalidEmailException e){

                System.out.println(e.getMessage());
            }


    }
    }

