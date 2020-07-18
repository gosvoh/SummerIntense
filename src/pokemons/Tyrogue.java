package pokemons;

import attacks.physical.LowSweep;
import attacks.status.Confide;
import attacks.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon {

    public Tyrogue(String name) {
        this(name, 100);
    }

    protected Tyrogue(String name, int lvl) {
        super(name, lvl);
        this.setStats(35, 35, 35, 35, 35, 35);
        this.addType(Type.FIGHTING);
        this.addMove(new DoubleTeam());
        this.addMove(new LowSweep());
        this.addMove(new Confide());
    }
}
