package pokemons;

import attacks.special.DazzlingGleam;
import attacks.special.EnergyBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {

    public Oddish(String name) {
        this(name, 92);
    }

    protected Oddish(String name, int lvl) {
        super(name, lvl);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.addType(Type.GRASS);
        this.addType(Type.POISON);
        this.addMove(new EnergyBall());
        this.addMove(new DazzlingGleam());
    }
}
