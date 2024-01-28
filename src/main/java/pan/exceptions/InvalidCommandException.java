package pan.exceptions;
import java.lang.Exception;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String message) {
        super("Invalid Command Exception: " + message);
    }
}