package entity;

public class Bucket extends Entities {
    private int volume = 8;
    private Potato[] potatoes;

    public Bucket() {
        super("Цилиндр");
        potatoes = new Potato[volume];
    }

    public int getVolume() {
        return volume;
    }

    public Potato[] getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(Potato[] potatoes) {
        this.potatoes = potatoes;
    }
}
