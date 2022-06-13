package exception;

public class AlreadyReservedBusinessException extends Exception {
    public AlreadyReservedBusinessException(String message) {
        super(message);
    }
}
