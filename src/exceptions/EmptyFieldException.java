package exceptions;

import locations.PotatoField;

public class EmptyFieldException extends RuntimeException {
    public EmptyFieldException() {
        super(PotatoField.getInstance() + " пусто, персонажи не моогут действовать!");
    }
}
