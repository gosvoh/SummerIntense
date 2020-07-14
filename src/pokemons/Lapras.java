package pokemons;

import attacks.Blizzard;
import attacks.DragonDance;
import attacks.DragonPulse;
import attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {

    public Lapras(String name) {
        super(name, 62);
        this.setStats(130, 85, 80, 85, 95, 60);
        this.addType(Type.WATER);
        this.addType(Type.ICE);
        this.addMove(new DragonPulse());
        this.addMove(new DragonDance());
        this.addMove(new Thunderbolt());
        this.addMove(new Blizzard());
    }


}
