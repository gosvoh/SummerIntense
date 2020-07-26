package character;

import entity.*;
import locations.PotatoField;
import locations.TheOutside;
import utils.Emotions;
import locations.Locations;

public class Scooperfield extends Characters {

    public Scooperfield() {
        setName("Скуперфильд");
        setEmotion(Emotions.NEUTRAL);
        setCurrentLocationSilently(TheOutside.getInstance());
        setNearEntitySilently(new Table());
    }

    @Override
    public void action() {
        PotatoField field = PotatoField.getInstance();

        if (!getCurrentLocation().equals(field)) {
            System.out.println("Ошибка! " + getName() + " может действовать только на локации " + field);
            return;
        }
        Bucket bucket = new Bucket();
        setNearEntity(bucket);

        Bush[] bushes = field.getBushes();
        if (bushes == null) {
            System.out.println("Поле пустое!");
            return;
        }

        Potato[] potatoesToBucket = new Potato[bucket.getVolume()];
        int offset = 0;
        for (int i = 0, bushesLength = field.getEntitiesLength(); i < bushesLength; i++) {
            Bush bush = bushes[i];
            System.out.println(getName() + " выдернул " + bush.getName());

            Tubers tubers = bush.getTubers();
            Potato[] potatoes = tubers.removePotatoes();
            System.out.println(getName() + " отделил от " + bush.getName() + " " + potatoes[0].getName() + " в количестве " + potatoes.length);

            if (potatoes.length + offset <= potatoesToBucket.length)
                System.arraycopy(potatoes, 0, potatoesToBucket, offset, potatoes.length);
            else {
                System.arraycopy(potatoes, 0, potatoesToBucket, offset, potatoesToBucket.length - offset);
                break;
            }
            offset += potatoes.length;
        }
        bucket.setPotatoes(potatoesToBucket);
        System.out.println(getName() + " заполнил " + bucket.getName() + " объектами " + bucket.getPotatoes()[0].getName() + " в количестве " +
                           bucket.getVolume());
        sayMsg("Ну как-то так, можно и валить отсюда");
    }

    @Override
    public void calculate() {

    }

    public void panicMode() {

    }
}
