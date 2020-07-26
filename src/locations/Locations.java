package locations;

import character.Characters;
import entity.Entities;

@SuppressWarnings("DuplicatedCode")
public abstract class Locations {
    /**
     * Расшифровка локации в виде строки
     */
    protected String name;
    /**
     * Массив персонажей в локации
     */
    private final Characters[] characters;
    /**
     * Массив объектов в локации
     */
    private final Entities[] entities;
    /**
     * Максимальное количество персонажей и объектов в локации
     */
    protected final int maxNumberOfCharactersAndEntities = 10;
    /**
     * Указатель для массива персонажей
     */
    protected int characterPointer = 0;
    /**
     * Указатель для массива объектов
     */
    protected int entityPointer = 0;

    /**
     * Конструктор локации
     *
     * @param name название локации
     */
    protected Locations(String name) {
        this.name = name;
        this.characters = new Characters[maxNumberOfCharactersAndEntities];
        this.entities = new Entities[maxNumberOfCharactersAndEntities];
    }

    /**
     * Получить подробное описание локации
     *
     * @return описание локации
     */
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        sb.append("Персонажи:\n");
        for (int i = 0; i < characterPointer; i++) sb.append(characters[i]).append("   ");
        sb.append("\n").append("Объекты: \n");
        for (int i = 0; i < entityPointer; i++) sb.append(entities[i]).append("   ");

        return sb.append("\n").toString();
    }

    /**
     * Добавить новых персонажей в локацию
     *
     * @param characters новые персонажи
     */
    public void addCharacter(Characters... characters) {
        if (characterPointer == maxNumberOfCharactersAndEntities || (characters.length + characterPointer) >= maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много персонажей в локации, нельзя добавить персонажа!");
            return;
        }

        if (characters.length > maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много персонажей для добавления!");
        }

        int iterator = 0;
        for (Characters character : characters) {
            this.characters[characterPointer] = character;
            ++iterator;
            ++characterPointer;
        }
    }

    /**
     * Удалить персонажа из локации. Ничего не происходит, если персонаж не найден в локации
     *
     * @param character персонаж для удаления
     */
    public void removeCharacter(Characters character) {
        int iterator = 0;
        for (Characters ch : characters) {
            if (ch.equals(character)) {
                characters[iterator] = null;
                break;
            }
            ++iterator;
        }
        if (characterPointer != 0) --characterPointer;
        sortArray(characters, iterator);
    }

    /**
     * Добавить новые объекты в локацию
     *
     * @param entities новые объекты
     */
    @SuppressWarnings("DuplicatedCode")
    public void addEntity(Entities... entities) {   // Да лютое повторение кода, да можно ыбло вынести в отдельный метод, но мне лень
        if (entityPointer == maxNumberOfCharactersAndEntities || (entities.length + entityPointer) > maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много объектов в локации, нельзя добавить новый объект!");
            return;
        }

        if (entities.length > maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много объектов для добавления!");
        }

        int iterator = 0;
        for (Entities entity : entities) {
            this.entities[entityPointer] = entity;
            ++iterator;
            ++entityPointer;
        }
    }

    /**
     * Удалить объект из локации. Ничего не происходит, если объект не найден в локации
     *
     * @param entity объект для удаления
     */
    public void removeEntity(Entities entity) {
        int iterator = 0;
        for (Entities ch : entities) {
            if (ch.equals(entity)) {
                entities[iterator] = null;
                break;
            }
            ++iterator;
        }
        if (entityPointer != 0) --entityPointer;
        sortArray(entities, iterator);
    }

    /**
     * Получить массив персонажей в локации
     *
     * @return персонажи
     */
    public Characters[] getCharacters() {
        return characters;
    }

    public int getCharactersLength() {
        return characterPointer;
    }

    /**
     * Получить массив объектов в локации
     *
     * @return объекты
     */
    public Entities[] getEntities() {
        return entities;
    }

    public int getEntitiesLength() {
        return entityPointer;
    }

    public int getMaxNumberOfCharactersAndEntities() {
        return maxNumberOfCharactersAndEntities;
    }

    /**
     * Сортировать массив, рекурсивный метод
     *
     * @param array   массив для сорировки
     * @param pointer начальынй указатель, с короторого начинается сортировка
     */
    protected void sortArray(Object[] array, int pointer) {
        for (int i = pointer; i < array.length; i++) {
            if (array[i] == null) if (i == array.length - 1 || array[i + 1] == null) break;
            else {
                array[i] = array[i + 1];
                array[i + 1] = null;
                sortArray(array, i);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
