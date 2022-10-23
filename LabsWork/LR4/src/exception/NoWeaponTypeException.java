package exception;

public class NoWeaponTypeException extends RuntimeException{
    public NoWeaponTypeException(String message) {
        super(message);
    }
}
