package character;

import entity.Table;
import utils.Emotions;
import utils.Locations;

public class Watchman extends Characters {

    private boolean isGrabbingSomeone = false;
    private Characters grabbedCharacter;

    public Watchman() {
        name = "Сторож";
        emotion = Emotions.NEUTRAL;
        currentLocation = Locations.LODGE;
        nearEntity = new Table();
    }

    public void grubCharacter(Characters character) {
        grabbedCharacter = character;
        isGrabbingSomeone = true;
    }

    public void letGoCharacter() {
        grabbedCharacter = null;
        isGrabbingSomeone = false;
    }

    public Characters getGrabbedCharacter() {
        return grabbedCharacter;
    }

    public boolean isGrabbingSomeone() {
        return isGrabbingSomeone;
    }

    @Override
    public void action() {

    }

    @Override
    public void calculate() {

    }
}
