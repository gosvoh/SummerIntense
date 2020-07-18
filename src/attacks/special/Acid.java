package attacks.special;

import ru.ifmo.se.pokemon.*;

public class Acid extends SpecialMove {

    public Acid() {
        super(Type.POISON, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, (int) (pokemon.getStat(Stat.SPECIAL_DEFENSE) - 1)));
    }

    @Override
    protected String describe() {
        return "Acid attack!";
    }
}
