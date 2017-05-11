package thisisjava.exceptionTest;

public class NotExistIDException extends Exception {

    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }

}
