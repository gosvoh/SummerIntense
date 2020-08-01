package character;

import entity.Bucket;
import entity.Bush;
import entity.Tubers;
import exceptions.EmptyFieldException;
import exceptions.NonCorrectLocationException;
import locations.PotatoField;
import locations.TheOutside;

public class Scooperfield extends Characters {


    private static final Scooperfield instance = new Scooperfield();

    private Scooperfield() {
        setName("Скуперфильд");
        setEmotion(Emotions.NEUTRAL);
        setCurrentLocationSilently(TheOutside.getInstance());
        // Мы знаем что на улице всегда есть стол и он первый и единственный
        setNearEntitySilently(TheOutside.getInstance().getEntities()[0]);
    }

    public static Scooperfield getInstance() {
        return instance;
    }

    @Override
    public void action() throws NonCorrectLocationException {
        PotatoField field = PotatoField.getInstance();

        if (!getCurrentLocation().equals(field)) throw new NonCorrectLocationException(this, field);

        if (field.getCharacters()[0].equals(Watchman.getInstance())) sayMsg("Нееее, я не идиот при стороже воровать");

        Bucket bucket = new Bucket();
        setNearEntity(bucket);

        Bush[] bushes = field.getBushes();
        if (bushes[0] == null) throw new EmptyFieldException();

        Tubers.Potato[] potatoesToBucket = new Tubers.Potato[bucket.getVolume()];
        int offset = 0;
        for (int i = 0, bushesLength = field.getEntitiesLength(); i < bushesLength; i++) {
            Bush bush = bushes[i];
            field.removeEntity(bush);
            System.out.println(this + " выдернул " + bush.getName());

            Tubers tubers = bush.getTubers();
            Tubers.Potato[] potatoes = tubers.removePotatoes();
            System.out.println(this + " отделил от " + bush.getName() + " " + potatoes[0].getName() + " в количестве " + potatoes.length);

            if (potatoes.length + offset <= potatoesToBucket.length)
                System.arraycopy(potatoes, 0, potatoesToBucket, offset, potatoes.length);
            else {
                System.arraycopy(potatoes, 0, potatoesToBucket, offset, potatoesToBucket.length - offset);
                break;
            }
            offset += potatoes.length;
        }
        bucket.setPotatoes(potatoesToBucket);
        System.out.println(this + " заполнил " + bucket.getName() + " объектами " + bucket.getPotatoes()[0].getName() + " в количестве " +
                           bucket.getVolume());
        sayMsg("Ну как-то так, можно и валить отсюда");
    }

    @Override
    public void calculate() {
        Watchman watchman = Watchman.getInstance();
        if (!watchman.getGrabbedCharacter().equals(this)) return;

        sayMsg("Ах ты жеж, надо что-то делать!");
        System.out.println("*" + this + " с силой выравается*");
        watchman.letGoCharacter();
        setCurrentLocation(TheOutside.getInstance());
    }
}
