package day12.practice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.regex.*;

public class HelloWorld {
    private static final String ADDRESS_PATTERN =
            "^[a-zA-Z0-9\\s.,'#\\-]+(\\s[A-Za-z0-9\\-#]+)?$";

    public static boolean isValidAddress(String address) {
        Pattern pattern = Pattern.compile(ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String address1 = "123 Main Street";
        String address2 = "Apt 456, 789 Elm Ave";
        String address3 = "P.O. Box 1234";
        String address4 = "Invalid!@#$";



        System.out.println("Address 1 is valid: " + isValidAddress(address1));
        System.out.println("Address 2 is valid: " + isValidAddress(address2));
        System.out.println("Address 3 is valid: " + isValidAddress(address3));
        System.out.println("Address 4 is valid: " + isValidAddress(address4));
    }
}