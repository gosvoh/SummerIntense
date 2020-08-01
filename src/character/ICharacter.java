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
        System.out.println(this + " говорит: " + message);
    }
}
