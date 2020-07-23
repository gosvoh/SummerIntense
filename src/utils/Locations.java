package utils;

import javax.xml.stream.events.Characters;

public enum Locations {
    POTATO_FIELD("Картофельное поле"),
    THICKETS_OF_VINE("Зарости лозняка"),
    THE_OUTSIDE("Улица"),
    LODGE("Сторожка");

    private final String name;
    private final Characters[] characters;
    private final int maxNumberOfCharacters;
    private int pointer = 0;

    Locations(String name) {
        this.name = name;
        this.maxNumberOfCharacters = 10;
        this.characters = new Characters[maxNumberOfCharacters];
    }

    @Override
    public String toString() {
        return name;
    }

    public void addCharacter(Characters character) {
        if (pointer == maxNumberOfCharacters) {
            System.out.println("Слишком много персонажей в локации, нельзя добавить персонажа!");
            return;
        }

        characters[pointer] = character;
        ++pointer;
    }

    public Characters[] getCharacters() {
        return characters;
    }

}
