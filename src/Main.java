import character.Scooperfield;
import character.Watchman;
import entity.Bush;
import locations.*;
import utils.Emotions;

//todo checked exception
//todo unchecked exception
//todo local class
//todo anon class
//todo inner static class
//todo inner non-static class

public class Main {

    public static void main(String[] args) {
        System.out.println("Сказка:\n");

        Locations potatoField = PotatoField.getInstance();

        Scooperfield scooperfield = Scooperfield.getInstance();
        Watchman watchman = Watchman.getInstance();

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

        watchman.setEmotion(Emotions.SUSPICIOUS);
        watchman.sayMsg("Шо за хрень там на поле?");
        watchman.setNearEntity(null);
        watchman.setCurrentLocation(potatoField);
        watchman.action();

        System.out.println("\n");
        System.out.println("Конец!");
    }

    private static void printDesc(String... strings) {
        System.out.println("\n----------------------------------------------");
        for (String string : strings) System.out.println(string);
        System.out.println("----------------------------------------------\n");
    }
}
