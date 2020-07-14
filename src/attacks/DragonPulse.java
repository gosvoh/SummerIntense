package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonPulse extends SpecialMove {
    public DragonPulse() {
        super(Type.DRAGON, 85, 100);
    }

    @Override
    protected String describe() {
        return "Dragon Pulse!";
    }
}
