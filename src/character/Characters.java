package character;

import entity.IEntity;
import utils.Emotions;
import utils.Locations;

public abstract class Characters {
    /**
     * Имя персонажа
     */
    protected String name = "НЕ ЗАДАНО";

    /**
     * Текушая эмоция персонажа
     */
    protected Emotions emotion = Emotions.NEUTRAL;

    /**
     * Текущая локация персонажа
     */
    protected Locations currentLocation = null;

    /**
     * Находящийся рядом объект
     */
    protected IEntity nearEntity = null;

    /**
     * Действие персонажа
     */
    public abstract void action();

    /**
     * Мыслительный процесс персонажа
     */
    public abstract void calculate();

    /**
     * Изменить текущую локацию
     *
     * @param location новая локация
     * @param message  сообщение при передвижении
     */
    public void moveTo(Locations location, String message) {
        System.out.println(name + " двигается из локации " + currentLocation.toString() + " в "
                           + location.toString() + ": " + message);
        currentLocation = location;
    }

    /**
     * Изменить находящийся рядом объект
     *
     * @param entity  новый объект
     * @param message сообщение при смене
     */
    public void moveTo(IEntity entity, String message) {

    }

    /**
     * Получить текущую локацию
     *
     * @return текущая локация
     */
    public Locations getCurrentLocation() {
        return currentLocation;
    }
}
