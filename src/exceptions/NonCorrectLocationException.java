package exceptions;

import character.Characters;
import locations.Locations;

public class NonCorrectLocationException extends Exception {
    public NonCorrectLocationException(Characters character, Locations correctLocation) {
        super(character + " может действовать только в локации " + correctLocation + ", а находится в " + character.getCurrentLocation());
    }
}
