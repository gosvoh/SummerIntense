import character.*;
import entity.Bush;
import exceptions.NonCorrectLocationException;
import locations.Locations;
import locations.PotatoField;
import locations.ThicketsOfVine;

//todo local class
//todo inner non-static class

public class Main {

    public static void main(String[] args) {
        System.out.println("Сказка:\n");

        Locations potatoField = PotatoField.getInstance();

        Scooperfield scooperfield = Scooperfield.getInstance();
        Watchman watchman = Watchman.getInstance();

        for (int i = 0, maxIterations = potatoField.getMaxNumberOfCharactersAndEntities(); i < maxIterations; i++)
            potatoField.addEntity(new Bush());

        try {
            System.out.print("С этими словами... ");
            scooperfield.setNearEntity(null);
            System.out.print("За одну минуту... ");
            scooperfield.setCurrentLocation(ThicketsOfVine.getInstance());
            System.out.print("И затем... ");
            //scooperfield.setCurrentLocation(potatoField);
            scooperfield.action();
            scooperfield.setEmotion(Characters.Emotions.HAPPINESS);
            scooperfield.sayMsg("Тяжесть - это хорошо, тяжесть - это надёжно");
        } catch (NonCorrectLocationException ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        }

        watchman.setEmotion(Characters.Emotions.SUSPICIOUS);
        watchman.sayMsg("Шо за хрень там на поле?");
        watchman.setNearEntity(null);
        watchman.setCurrentLocation(potatoField);
        try {
            watchman.action();
        } catch (NonCorrectLocationException ex) {
            ex.printStackTrace();
        }

        System.out.println("\n");
        System.out.println("Конец!");
    }

    private static void printDesc(String... strings) {
        System.out.println("\n----------------------------------------------");
        for (String string : strings) System.out.println(string);
        System.out.println("----------------------------------------------\n");
    }
}
