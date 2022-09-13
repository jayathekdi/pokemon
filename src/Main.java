import java.util.*;
public class Main {
    public static void main(String[] args) {
        Attack flameBall = new Attack("FlameBall", 50);
        Attack karateChop = new Attack("KarateChop", 293);
        Attack whirlWind = new Attack("WhirlWind", 30);
        Attack headButt = new Attack("HeadButt", 6);
        Attack bodySlam = new Attack("BodySlam", 29);
        Attack bubbleBeam = new Attack("BubbleBeam", 53);
        Attack thunderShock = new Attack("ThunderShock", 18);
        Attack hypnosis = new Attack("Hypnosis", 376);
        Attack eggBomb = new Attack("eggBomb", 2);
        Attack poisonLick = new Attack("poisonLick", 42);
        Attack rainDance = new Attack("RainDance", 563);
        Attack heatWave = new Attack("HeatWave", 3);
        Attack revenge = new Attack("Revenge", 15);
        Attack dive = new Attack("Dive", 6);
        Attack blazeKick = new Attack("BlazeKick", 92);
        Attack iceBall = new Attack("IceBall", 26);
        Attack poisonFang = new Attack("poisonFang", 35);
        Attack blastBurn = new Attack("BlastBurn", 87);
        Attack tickle = new Attack("Tickle", 16);
        Attack cosmicPower = new Attack("CosmicPower", 124);
        Attack shockWave = new Attack("shockWave", 84);
        Attack gastroAcid = new Attack("gastroAcid", 16);
        Attack auraSphere = new Attack("AuraSphere", 25);
        Attack toxicSpikes = new Attack("ToxicSpikes", 73);
        Attack[] charmanderAttacks = new Attack[]{flameBall, karateChop, whirlWind, headButt};
        Attack[] dittoAttacks = new Attack[]{bodySlam, bubbleBeam, thunderShock, hypnosis};
        Attack[] eeveeAttacks = new Attack[]{eggBomb, poisonLick, rainDance, heatWave};
        Attack[] squirtleAttacks = new Attack[]{revenge, dive, blazeKick, iceBall};
        Attack[] pikachuAttacks = new Attack[]{poisonFang, blastBurn, tickle, cosmicPower};
        Attack[] snorlaxAttacks = new Attack[]{shockWave, gastroAcid, auraSphere, toxicSpikes};
        Pokemon charmander = new Pokemon("Charmander", 60, charmanderAttacks, false);
        Pokemon ditto = new Pokemon("Ditto", 55, dittoAttacks, false);
        Pokemon eevee = new Pokemon("Eevee", 3, eeveeAttacks, true);
        Pokemon squirtle = new Pokemon("Squirtle", 28, squirtleAttacks, false);
        Pokemon pikachu = new Pokemon("Pikachu", 110, pikachuAttacks, false);
        Pokemon snorlax = new Pokemon("Snorlax", 50, snorlaxAttacks, false);
        Scanner input = new Scanner(System.in);
        //attacksMenu(eeveeAttacks, eevee);
        Item potion = new Item("Potion", 50, 3);
        Item pokeball = new Item("Pokeball", 0, 1);
        Item superPotion = new Item("SuperPotion", 100, 2);
        Item[] bag = new Item[]{potion, pokeball, superPotion};
        //bag(bag, eevee);
        printBattle(eevee, eevee, "Eevee usevee used attackE");
        printBattle(eevee, eevee, "Eevee");
        Pokemon[] allPokemons = new Pokemon[]{charmander, ditto, eevee, squirtle, pikachu, snorlax};
        pokemonMenu(allPokemons, eevee);

        // start here
        enum State {Bag, Battle, Attack, Pokemon};
        State gameState;
        // starting pokemon is Eevee
        Pokemon currentPokemon = eevee;
        Pokemon opponent = new Pokemon("Mewtwo",40,squirtleAttacks,false);
        while (currentPokemon.getHealth() > 0) {
            gameState = State.Battle;
            printBattle(currentPokemon, opponent, "");
            // in progress
        }

    }

    public static void moveOpponent(Pokemon opponent, Pokemon currentPokemon) {
        Attack[] attacks = opponent.getAttacks();
        Random random = new Random();
        int num = random.nextInt(4);
        attacks[num].use(currentPokemon);
    }

    public static void printBattle(Pokemon pokemon, Pokemon opponent, String statement) { //test
        int statementLength;
        if(statement.length() < 20){
            statementLength = 30;
        }
        else{
            statementLength = statement.length() + 10;
        }
        for(int i = 0; i < statementLength; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*" + opponent.getName() + " Lvl " + opponent.getLevel());
        for (int i = 6 + opponent.getName().length() + Integer.toString(opponent.getLevel()).length(); i < statementLength - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        System.out.print("*HP: " + opponent.getLevel());
        for (int i = 5 + Integer.toString(opponent.getHealth()).length(); i < statementLength - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        System.out.println("*                        0   *\n*                       -|-  *\n*                       / \\  *\n*                            *");
        System.out.println("*   0                        *\n*  -|-                       *\n*  / \\                       *");
        String pokemonAndLevelLength = pokemon.getName() + " Lvl " + pokemon.getLevel();
        String HPLength = "HP: " + pokemon.getHealth();
        System.out.print("*");
        for(int i = 0; i < 28 - pokemonAndLevelLength.length(); i++){
            System.out.print(" ");
        }
        System.out.println(pokemonAndLevelLength + "*");
        System.out.print("*");
        for(int i = 0; i < 28 - HPLength.length(); i++){
            System.out.print(" ");
        }
        System.out.println(HPLength + "*");
        for(int i = 0; i < statementLength; i++){
            System.out.print("_");
        }
        System.out.println();
        System.out.print("*" + statement);
        for(int i = statement.length(); i < 20; i++){
            System.out.print(" ");
        }
        System.out.println("|Atk|Bag*");
        System.out.print("*");
        for(int i = 0; i < statementLength - 10; i++ ){
            System.out.print(" ");
        }
        System.out.println("|Pok|Run*");
        for(int i = 0; i < statementLength; i++){
            System.out.print("*");
        }
        System.out.println();

    }
    public static Pokemon pokemonMenu(Pokemon[] allPokemons, Pokemon currentPokemon){
        // print the menu
        System.out.println("******************************\n*Pokemon                     *\n*----------------------------*");
        String largestLevel = "";
        for(int i = 0; i < allPokemons.length - 1; i++){
            if (allPokemons[i].isCurrent())
                continue;
            if(allPokemons[i].getLevel() > allPokemons[i + 1].getLevel()){
                largestLevel = Integer.toString(allPokemons[i].getLevel());
            }
        }
        for(int i = 0; i < allPokemons.length; i++){
            if (allPokemons[i].isCurrent())
                continue;
            System.out.print("*Lvl");
            for (int k = Integer.toString(allPokemons[i].getLevel()).length(); k <= largestLevel.length(); k++){
                System.out.print(" ");
            }
            System.out.print(allPokemons[i].getLevel() + " " + allPokemons[i].getName());
            for(int j = 0; j < 23 - allPokemons[i].getName().length() - largestLevel.length(); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < 5; i++){
            System.out.println("*                            *");
        }
        System.out.println("******************************");

        // take in user input for which pokemon they would like to choose
        Scanner input = new Scanner(System.in);
        System.out.print("Which Pokemon would you like to choose? ");
        String response = input.nextLine();
        // change pokemon
        for (int i = 0; i < allPokemons.length; i++) {
            if (allPokemons[i].getName().equals(response)) {
                if (allPokemons[i].isCurrent())
                    return allPokemons[i];
                else {
                    currentPokemon.setCurrent(false);
                    allPokemons[i].setCurrent(true);
                    return allPokemons[i];
                }
            }
        }
        return currentPokemon;

    }
    public static String bag(Item[] bag, Pokemon pokemon){
        System.out.println("******************************\n*Bag                         *\n*----------------------------*");
        for(int i = 0; i < bag.length; i++){
            if (bag[i].getQuantity() == 0)
                continue;
            System.out.print("*" + bag[i].getQuantity() + "x " + bag[i].getName());
            for(int j = 0; j < 26 - bag[i].getName().length() - Integer.toString(bag[i].getQuantity()).length(); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < 6; i++){
            System.out.println("*                            *");
        }
        System.out.println("******************************");
        // take in user input for which item they would like to choose
        Scanner input = new Scanner(System.in);
        System.out.print("Which item would you like to choose? ");
        String response = input.nextLine();
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].getName().equals(response) && bag[i].getQuantity() > 0) {
                bag[i].use(pokemon);
                return pokemon.getName() + " used " + bag[i].getName();
            }
            else
                System.out.println("That item does not exist.");
        }
        return pokemon.getName() + " chose an item that doesn't exist.";
    }
    public static String attacksMenu(Attack[] attacks, Pokemon opponent){
        System.out.println("******************************\n*Attacks                     *\n*----------------------------*");
        for(int i = 0; i < attacks.length; i++){
            System.out.print("*" + attacks[i].getName());
            for(int j = 0; j < 28 - attacks[i].getName().length(); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < 6; i++){
            System.out.println("*                            *");
        }
        System.out.println("******************************");
        // take in user input for which attack they would like to choose
        Scanner input = new Scanner(System.in);
        System.out.print("Which attack would you like to choose? ");
        String response = input.nextLine();
        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i].getName().equals(response)) {
                attacks[i].use(opponent);
                return " used " + attacks[i].getName();
            }
        }
        return " chose an attack that doesn't exist.";
    }
}

