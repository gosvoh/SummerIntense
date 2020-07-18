package pokemons;

import attacks.physical.QuickAttack;

public class Hitmontop extends Tyrogue {

    public Hitmontop(String name) {
        super(name, 4);
        this.setStats(50, 95, 95, 35, 110, 70);
        this.addMove(new QuickAttack());
    }
}
