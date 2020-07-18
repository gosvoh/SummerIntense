package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PetalBlizzard extends PhysicalMove {

    public PetalBlizzard() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected String describe() {
        return "You're goddamn right, Petal Blizzard!";
    }
}
