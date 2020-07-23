package character;

import entity.Table;
import utils.Emotions;
import utils.Locations;

public class Scooperfield extends Characters {

    public Scooperfield() {
        name = "Скуперфильд";
        emotion = Emotions.NEUTRAL;
        currentLocation = Locations.THE_OUTSIDE;
        nearEntity = new Table();
    }

    @Override
    public void action() {

    }

    @Override
    public void calculate() {

    }
}
