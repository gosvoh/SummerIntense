package locations;

import character.Characters;
import entity.Bush;
import entity.Entities;

public class PotatoField extends Locations {

    private Bush[] bushes = new Bush[maxNumberOfCharactersAndEntities];

    private static final PotatoField instance = new PotatoField();

    private PotatoField() {
        super("Картофельное поле");
    }

    public static PotatoField getInstance() {
        return instance;
    }


    @SuppressWarnings("DuplicatedCode")
    @Override
    public void addEntity(Entities... entities) {
        if (entityPointer == maxNumberOfCharactersAndEntities || (entities.length + entityPointer) > maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много объектов в локации, нельзя добавить новый объект!");
            return;
        }

        if (entities.length > maxNumberOfCharactersAndEntities) {
            System.out.println("Слишком много объектов для добавления!");
        }

        int iterator = 0;
        for (Entities entity : entities) {
            this.bushes[entityPointer] = (Bush) entity;
            ++iterator;
            ++entityPointer;
        }
    }

    @Override
    public void removeEntity(Entities entity) {
        int iterator = 0;
        for (Bush b : bushes) {
            if (b.equals(entity)) {
                bushes[iterator] = null;
                break;
            }
            ++iterator;
        }
        if (entityPointer != 0) --entityPointer;
        sortArray(bushes, iterator);
    }

    @SuppressWarnings("DuplicatedCode")
    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        sb.append("Персонажи:\n");
        Characters[] characters = getCharacters();
        for (int i = 0; i < characterPointer; i++) sb.append(characters[i]).append("   ");
        sb.append("\n").append("Объекты: \n");
        for (int i = 0; i < entityPointer; i++) sb.append(bushes[i]).append("   ");

        return sb.toString();
    }

    public Bush[] getBushes() {
        return bushes;
    }

    @Deprecated
    @Override
    public Entities[] getEntities() {
        return super.getEntities();
    }
}