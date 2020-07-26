package locations;

import entity.Entities;

public class ThicketsOfVine extends Locations {

    private static final ThicketsOfVine instance = new ThicketsOfVine();

    private ThicketsOfVine() {
        super("Зарости лозняка");
    }

    public static ThicketsOfVine getInstance() {
        return instance;
    }
}
