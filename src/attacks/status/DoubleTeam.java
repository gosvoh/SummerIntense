package attacks.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.EVASION, (int) (pokemon.getStat(Stat.EVASION) + 1)));
    }

    @Override
    protected String describe() {
        return "Try to hit me! Double Team!";
    }
}
