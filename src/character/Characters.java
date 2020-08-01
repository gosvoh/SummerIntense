package character;

import entity.IEntity;
import exceptions.NonCorrectLocationException;
import locations.Locations;

import java.util.Objects;

public abstract class Characters implements ICharacter {

    /**
     * Вложенный класс перечислений, отвечающий за эмоции
     */
    public enum Emotions {
        ANGER("Злость"),
        SURPRISE("Удивление"),
        FEAR("Страх"),
        NEUTRAL("Нейтральное"),
        SUSPICIOUS("Подозрительность"),
        HAPPINESS("Радость");

        /**
         * Расшифровка эмоции в виде строки
         */
        private final String emotion;

        Emotions(String emotion) {
            this.emotion = emotion;
        }

        @Override
        public String toString() {
            return emotion;
        }
    }

    /**
     * Имя персонажа
     */
    private String name = "НЕ ЗАДАНО";

    /**
     * Текушая эмоция персонажа
     */
    private Emotions emotion = Emotions.NEUTRAL;

    /**
     * Текущая локация персонажа
     */
    private Locations currentLocation = null;

    /**
     * Находящийся рядом объект
     */
    private IEntity nearEntity = null;

    /**
     * Действие персонажа
     */
    public abstract void action() throws NonCorrectLocationException;

    /**
     * Мыслительный процесс персонажа
     */
    public void calculate() {

    }

    /**
     * Изменить текущую локацию
     *
     * @param currentLocation новая локация
     */
    public void setCurrentLocation(Locations currentLocation) {
        System.out.println(name + " переместился из " + this.currentLocation + " в " + currentLocation);
        this.currentLocation.removeCharacter(this);
        this.currentLocation = currentLocation;
        this.currentLocation.addCharacter(this);
    }

    /**
     * Изменить текущую локацию без вывода на экран.
     *
     * @param currentLocation новая локация
     */
    protected void setCurrentLocationSilently(Locations currentLocation) {
        this.currentLocation = currentLocation;
        // Да, не очень верно, но мы же ещё не дошли до исключений, так что закроем глаза
        this.currentLocation.addCharacter(this);
    }

    /**
     * Получить текущую локацию
     *
     * @return текущая локация
     */
    public Locations getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Установить эмоцию персонажа
     *
     * @param emotion новая эмоция
     */
    @Override
    public void setEmotion(Emotions emotion) {
        System.out.println(name + " изменил эмоцию с " + this.emotion.toString() + " на " + emotion.toString());
        this.emotion = emotion;
    }

    /**
     * Получить эмоцию персонажа
     *
     * @return текущая эмоция
     */
    @Override
    public Emotions getEmotion() {
        return emotion;
    }

    /**
     * Установить находящийся рядом объект
     *
     * @param nearEntity новый объект
     */
    @Override
    public void setNearEntity(IEntity nearEntity) {
        System.out.println(name + " изменил объект рядом c " + this.nearEntity + " на " + nearEntity);
        this.nearEntity = nearEntity;
    }

    /**
     * Установить находящийся рядом объект без вывода на экран
     *
     * @param nearEntity новый объект
     */
    protected void setNearEntitySilently(IEntity nearEntity) {
        this.nearEntity = nearEntity;
    }

    /**
     * Получить находящийся рядом объект
     *
     * @return оъект рядом
     */
    @Override
    public IEntity getNearEntity() {
        return nearEntity;
    }

    /**
     * Установить имя персонажа
     *
     * @param name имя персонажа
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить имя персонажа
     *
     * @return имя персонажа
     */
    @Override
    public String getDescription() {
        return name + " в локации " + currentLocation + " и рядом с объектом " + nearEntity +
               ", текущая эмоция - " + emotion;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Characters)) return false;
        Characters that = (Characters) o;
        return name.equals(that.name) &&
               emotion == that.emotion &&
               currentLocation == that.currentLocation &&
               nearEntity.equals(that.nearEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, emotion, currentLocation, nearEntity);
    }
}
