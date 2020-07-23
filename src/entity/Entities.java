package entity;

public abstract class Entities implements IEntity {
    String name;

    Entities(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
