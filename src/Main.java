import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
        Attack flameBall =
        Attack
        Attacks[] charmanderAttacks =
        Attacks[] dittoAttacks =
        Attacks[] evieAttacks =
        Attacks[] squirtleAttacks =
        Attacks[] pikachuAttacks =
        Attacks[] snorlaxAttacks =
        Pokemon charmander = new Pokemon("Charmander", 60, charmanderAttacks, false);
        Pokemon ditto = new Pokemon("Ditto", 55, dittoAttacks, false);
        Pokemon evie = new Pokemon("Evie", 3, evieAttacks, false);
        Pokemon squirtle = new Pokemon("Squirtle", 28, squirtleAttacks, false);
        Pokemon pikachu = new Pokemon("Pikachu", 110, pikachuAttacks, false);
        Pokemon snorlax = new Pokemon("Snorlax", 50, snorlaxAttacks, false);
         */
        Scanner input = new Scanner(System.in);

    }

    public static void printBattle(Pokemon pokemon, Pokemon opponent) { //test
        System.out.println("******************************");
        int opponentNameAndLevel = 23 - opponent.getName().length() - Integer.toString(opponent.getLevel()).length();
        System.out.print("*" + opponent.getName() + " Lvl " + opponent.getLevel());
        for (int i = 0; i < opponentNameAndLevel; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        System.out.print("*HP: " + opponent.getLevel());
        int opponentHP = 25 - Integer.toString(opponent.getLevel()).length();
        for (int i = 0; i < opponentHP; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i <= 2; i++) {
            System.out.print("*");
            for (int j = 0; j < 30; j++) {
                if (i == 0 && j == 24) {
                    System.out.print("0    *");
                    break;
                } else if (i == 0) {
                    System.out.print(" ");
                }
                if (i == 1 && j == 23) {
                    System.out.print("-|-   *");
                    break;
                } else if (i == 1) {
                    System.out.print(" ");
                }
                if (i == 2 && j == 23) {
                    System.out.print("/ \\   *");
                    break;
                } else if (i == 2) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println("*                            *");
        System.out.println("*    0                       *");
        //finish other two body lines
        System.out.println("______________________________");
        System.out.println("******************************");
    }
    public static void pokemonMenu(Pokemon[] allPokemons){
        System.out.println("******************************\n*Pokemon                     *\n*----------------------------*");
        String largestLevel = "";
        for(int i = 0; i < allPokemons.length; i++){
            if(allPokemons[i].getLevel() > allPokemons[i + 1].getLevel()){
                largestLevel = Integer.toString(allPokemons[i].getLevel());
            }
        }
        for(int i = 0; i <= allPokemons.length; i++){
            System.out.print("*Lvl");
            for (int k = Integer.toString(allPokemons[i].getLevel()).length(); k <= largestLevel.length(); k++){
                System.out.print(" ");
            }
            System.out.print(allPokemons[i].getLevel() + " " + allPokemons[i].getName());
            for(int j = 0; j < 23 - allPokemons[i].getName().length() - Integer.toString(allPokemons[i].getLevel()).length(); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < 6; i++){
            System.out.println("*                            *");
        }
        System.out.println("******************************");
    }
    public static void bag(Item[] bag){
        System.out.println("******************************\n*Bag                         *\n*----------------------------*");
        for(int i = 0; i <= bag.length; i++){
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
    }
    public static void attacksMenu(Attack[] attacks){
        System.out.println("******************************\n*Attacks                     *\n*----------------------------*");
        for(int i = 0; i <= attacks.length; i++){
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
    }
}
