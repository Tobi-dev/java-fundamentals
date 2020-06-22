package exercise6.exceptions;

public class LimitExceededException extends Exception {
    public LimitExceededException(String message){
        super(message);
    }
}
