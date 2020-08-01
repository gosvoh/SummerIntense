package character;

import entity.IEntity;

public interface ICharacter {

    Characters.Emotions getEmotion();

    void setEmotion(Characters.Emotions emotion);

    IEntity getNearEntity();

    void setNearEntity(IEntity entity);

    String getDescription();

    void setName(String name);

    default void sayMsg(String message) {
        // Бесполезный, зато анонимный класс
        new ICharacterCommunication() {
            @Override
            public void saySomething(String name, String message) {
                System.out.println(name + " говорит: " + message);
            }
        }.saySomething(this.toString(), message);
    }
}
