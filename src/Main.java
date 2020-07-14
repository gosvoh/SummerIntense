import pokemons.Lapras;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Да начнётся битва покемонов!");

        Battle battle = new Battle();

        Lapras lapras1 = new Lapras("Lap1");
        Lapras lapras2 = new Lapras("Lap2");

        battle.addAlly(lapras1);
        battle.addFoe(lapras2);
        battle.go();
    }
}
