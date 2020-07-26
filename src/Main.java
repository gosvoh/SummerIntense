import character.Scooperfield;
import character.Watchman;
import entity.Bush;
import locations.Locations;
import locations.PotatoField;
import locations.ThicketsOfVine;
import utils.Emotions;

public class Main {

    public static void main(String[] args) {
        System.out.println("Сказка:\n");

        Locations potatoField = PotatoField.getInstance();
        Scooperfield scooperfield = new Scooperfield();
        Watchman watchman = new Watchman();

        for (int i = 0, maxIterations = potatoField.getMaxNumberOfCharactersAndEntities(); i < maxIterations; i++)
            potatoField.addEntity(new Bush());

        System.out.print("С этими словами ");
        scooperfield.setNearEntity(null);
        System.out.print("За одну минуту ");
        scooperfield.setCurrentLocation(ThicketsOfVine.getInstance());
        System.out.print("И затем ");
        scooperfield.setCurrentLocation(potatoField);
        scooperfield.action();
        scooperfield.setEmotion(Emotions.HAPPINESS);
        scooperfield.sayMsg("Тяжесть - это хорошо, тяжесть - это надёжно");

        watchman.sayMsg("Шо за хрень там на поле?");
        watchman.setEmotion(Emotions.SUSPICIOUS);
        watchman.setNearEntity(null);
        watchman.setCurrentLocation(potatoField);
    }
}
