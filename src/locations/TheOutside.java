package locations;

import entity.Table;

public class TheOutside extends Locations {

    private static final TheOutside instance = new TheOutside();

    private TheOutside() {
        super("Улица");
        addEntity(new Table());
    }

    public static TheOutside getInstance() {
        return instance;
    }
}
