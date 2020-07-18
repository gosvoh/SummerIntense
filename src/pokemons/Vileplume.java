package pokemons;

import attacks.physical.PetalBlizzard;

public class Vileplume extends Gloom {

    public Vileplume(String name) {
        super(name, 1);
        this.setStats(75, 80, 85, 110, 90, 50);
        this.addMove(new PetalBlizzard());
    }
}
