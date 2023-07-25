package day12.practice;

public class DevException extends Exception {
    public DevException(String msg) {
        super(msg);

    }

    public DevException(Throwable a) {
        super(a);

    }

    public DevException(Throwable a, String msg) {
        super(msg, a);


    }
}

