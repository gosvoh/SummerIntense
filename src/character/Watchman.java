package character;

import entity.Table;
import locations.Lodge;
import locations.PotatoField;
import utils.Emotions;

public class Watchman extends Characters {

    private boolean isGrabbingSomeone = false;
    private Characters grabbedCharacter;

    private static final Watchman instance = new Watchman();

    private Watchman() {
        setName("Сторож");
        setEmotion(Emotions.NEUTRAL);
        setCurrentLocationSilently(Lodge.getInstance());
        // Мы знаем что в сторожке всегда есть стол и он первый и единственный
        setNearEntitySilently(Lodge.getInstance().getEntities()[0]);
    }

    public static Watchman getInstance() {
        return instance;
    }

    public void grubCharacter(Characters character) {
        setEmotion(Emotions.ANGER);
        grabbedCharacter = character;
        System.out.println(this + " схватил " + character + " за шиворот");
        isGrabbingSomeone = true;
        character.setEmotion(Emotions.SURPRISE);
        character.setEmotion(Emotions.FEAR);
        character.setNearEntity(null);
    }

    public void letGoCharacter() {
        System.out.println(grabbedCharacter + " удалось вырваться");
        grabbedCharacter = null;
        isGrabbingSomeone = false;
    }

    public Characters getGrabbedCharacter() {
        return grabbedCharacter;
    }

    public boolean isGrabbingSomeone() {
        return isGrabbingSomeone;
    }

    @Override
    public void action() {
        PotatoField field = PotatoField.getInstance();

        if (!getCurrentLocation().equals(field)) {
            System.out.println("Ошибка! " + this + " может действовать только на локации " + field);
            return;
        }

        Characters character = field.getCharacters()[0];

        //Мы точно знаем, что если первый элемент является самим сторожем, то на поле если и есть кто-то, то сторож не даст никому ничего сделать
        if (character.equals(this)) sayMsg("Хм... Видимо показалось.");

        System.out.println(this + " увидел " + character);

        grubCharacter(character);
        character.calculate();
    }
}
