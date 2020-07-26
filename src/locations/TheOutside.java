package locations;

import entity.Entities;

public class TheOutside extends Locations {

    private static final TheOutside instance = new TheOutside();

    private TheOutside() {
        super("Улица");
    }

    public static TheOutside getInstance() {
        return instance;
    }

    @Override
    public void addEntity(Entities... entities) {

    }

    @Override
    public void removeEntity(Entities entity) {

    }
}
