package character;

import entity.Table;
import locations.Lodge;
import utils.Emotions;
import locations.Locations;

public class Watchman extends Characters {

    private boolean isGrabbingSomeone = false;
    private Characters grabbedCharacter;

    public Watchman() {
        setName("Сторож");
        setEmotion(Emotions.NEUTRAL);
        setCurrentLocationSilently(Lodge.getInstance());
        setNearEntitySilently(new Table());
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
