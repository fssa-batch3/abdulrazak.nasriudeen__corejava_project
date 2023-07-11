package day02.practice;

public class Logger {

    public static void debug (String msg) {
        System.out.println("DEBUG: " + msg);
    }
    public static void info (String msg) {
        System.out.println("Info: " + msg);
    }

    public static void error (String msg) {
        System.out.println("Error: " + msg);
    }

    public static void debug (int num) {
        System.out.println("debug: " + num);
    }

    public static void main(String [] args){
     debug("debug error");
     info("information");
     error("errorMessage");
     debug(2);
    }
}
