package locations;

public class Lodge extends Locations {

    private static final Lodge instance = new Lodge();

    private Lodge() {
        super("Сторожка");
    }

    public static Lodge getInstance() {
        return instance;
    }
}
