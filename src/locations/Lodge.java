package locations;

import entity.Table;

public class Lodge extends Locations {

    private static final Lodge instance = new Lodge();

    private Lodge() {
        super("Сторожка");
        addEntity(new Table());
    }

    public static Lodge getInstance() {
        return instance;
    }
}
