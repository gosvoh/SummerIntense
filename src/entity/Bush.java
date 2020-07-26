package entity;

import java.util.Objects;

public class Bush extends Entities {

    private final Tubers tubers = new Tubers();

    public Bush() {
        super("Куст картофеля");
    }

    protected Bush(String name) {
        super(name);
    }

    public Tubers getTubers() {
        return tubers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bush)) return false;
        if (!super.equals(o)) return false;
        Bush bush = (Bush) o;
        return tubers.equals(bush.tubers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tubers);
    }
}
