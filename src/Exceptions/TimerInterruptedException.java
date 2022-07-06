package Exceptions;

public class TimerInterruptedException extends Exception {

    public TimerInterruptedException() {
    }

    public TimerInterruptedException(String message) {
        super(message);
    }

    public TimerInterruptedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimerInterruptedException(Throwable cause) {
        super(cause);
    }

    public TimerInterruptedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
