package exception;

public class MyInterruptedException extends RuntimeException{

    public MyInterruptedException() {
        super();
    }

    public MyInterruptedException(String message) {
        super(message);
    }

    public MyInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyInterruptedException(Throwable cause) {
        super(cause);
    }

    protected MyInterruptedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
