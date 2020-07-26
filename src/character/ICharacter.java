package character;

import entity.IEntity;
import utils.Emotions;

public interface ICharacter {

    Emotions getEmotion();
    void setEmotion(Emotions emotion);

    IEntity getNearEntity();
    void setNearEntity(IEntity entity);

    String getDescription();
    void setName(String name);

    default void sayMsg(String message) {
        System.out.println(this + " говорит: " + message);
    }
}