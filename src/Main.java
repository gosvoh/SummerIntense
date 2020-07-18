import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Да начнётся битва покемонов!\n");

        Battle battle = new Battle();

        battle.addAlly(new Lapras("Lap"));
        battle.addAlly(new Tyrogue("Tyro"));
        battle.addAlly(new Hitmontop("Hitmon"));

        battle.addFoe(new Oddish("Oddi"));
        battle.addFoe(new Gloom("Gloo"));
        battle.addFoe(new Vileplume("Vile"));

        battle.go();
    }
}
