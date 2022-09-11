import java.util.Random;

public class Main {

    public static void useItem(Item item, Pokemon pokemon) {
        item.use(pokemon);
    }

    public static void moveOpponent(Pokemon opponent, Pokemon currentPokemon) {
        Attack[] attacks = opponent.getAttacks();
        Random random = new Random();
        int num = random.nextInt(4);
        attacks[num].use(currentPokemon);
    }

}
