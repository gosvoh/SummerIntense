package attacks.status;

import ru.ifmo.se.pokemon.*;

public class DragonDance extends StatusMove {
    public DragonDance() {
        super(Type.DRAGON, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) + 1)));
        pokemon.addEffect(new Effect().stat(Stat.SPEED, (int) (pokemon.getStat(Stat.SPEED) + 1)));
    }

    @Override
    protected String describe() {
        return "Dragon Dance!";
    }
}
