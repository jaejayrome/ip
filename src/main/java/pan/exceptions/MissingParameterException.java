package pan.exceptions;
import java.lang.Exception;

public class MissingParameterException extends Exception {
    public MissingParameterException(String message) {
        super("Missing Parameter Exception: " + message);
    }
}