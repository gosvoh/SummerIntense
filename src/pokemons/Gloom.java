package pokemons;

import attacks.special.Acid;

public class Gloom extends Oddish {

    public Gloom(String name) {
        this(name, 1);
    }

    protected Gloom(String name, int lvl) {
        super(name, lvl);
        this.setStats(60, 65, 70, 85, 75, 40);
        this.addMove(new Acid());
    }
}
