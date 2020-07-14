package attacks.special;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean isElectric = false;
        for (Type type : pokemon.getTypes()) {
            //noinspection IfStatementMissingBreakInLoop
            if (type == Type.ELECTRIC) isElectric = true;
        }

        if (!isElectric)
            pokemon.addEffect(new Effect().chance(0.1).condition(Status.PARALYZE));
    }

    @Override
    protected String describe() {
        return "Thunderbolt!";
    }
}
