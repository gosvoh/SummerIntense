package entity;

import java.util.Arrays;
import java.util.Random;

public class Tubers extends Entities {

    private Potato[] potatoes;

    protected Tubers() {
        super("Клубни картофеля");
        potatoes = new Potato[1 + new Random().nextInt(4)];
        for (int i = 0, potatoesLength = potatoes.length; i < potatoes.length; i++) potatoes[i] = new Potato();
    }

    public Potato[] removePotatoes() {
        Potato[] tempPotatoes = potatoes;
        potatoes = null;
        return tempPotatoes;
    }

    @Override
    public String toString() {
        return getName() + " содержит " + potatoes.length + " обектов вида " + potatoes[0];
    }
}
