package entity;

public class Bucket extends Entities {
    private final int volume = 8;
    private Tubers.Potato[] potatoes;

    public Bucket() {
        super("Цилиндр");
        potatoes = new Tubers.Potato[volume];
    }

    public int getVolume() {
        return volume;
    }

    public Tubers.Potato[] getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(Tubers.Potato[] potatoes) {
        this.potatoes = potatoes;
    }
}
