package attacks.physical;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {

    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) - 1)));
    }

    @Override
    protected String describe() {
        return "Low Sweep mthfckr!";
    }
}
