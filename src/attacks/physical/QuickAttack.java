package attacks.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class QuickAttack extends PhysicalMove {

    public QuickAttack() {
        super(Type.NORMAL, 40, 100);
        this.priority = this.getPriority() + 1;
    }

    @Override
    protected String describe() {
        return "Get this! Quick Attack!";
    }
}
