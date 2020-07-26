package entity;

import java.util.Objects;

public abstract class Entities implements IEntity {
    private String name = "НЕ ЗАДАНО";

    Entities(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entities)) return false;
        Entities entities = (Entities) o;
        return name.equals(entities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
