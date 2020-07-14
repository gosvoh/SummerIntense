package attacks.special;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean isIce = false;
        for (Type type : pokemon.getTypes()) {
            //noinspection IfStatementMissingBreakInLoop
            if (type == Type.ICE) isIce = true;
        }

        if (!isIce)
            pokemon.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
    }

    @Override
    protected String describe() {
        return "Blizzard!";
    }
}
