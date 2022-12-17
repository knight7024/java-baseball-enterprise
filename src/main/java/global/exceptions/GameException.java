package global.exceptions;

public class GameException extends RuntimeException {

    public GameException() {
    }

    public GameException(String s) {
        super(s);
    }

    public GameException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameException(Throwable cause) {
        super(cause);
    }
}