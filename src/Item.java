import java.util.Objects;

public class Item {
    private String name;
    private int healing;
    private int quantity;

    public Item(String name, int healing, int quantity) {
        this.name = name;
        this.healing = healing;
        this.quantity = quantity;
    }

    public boolean use(Pokemon pokemon) {
        // if the item is a pokeball
        if (name.equals("Pokeball")) {
            return true;
        }

        if (quantity == 0) { // if there are none left
            System.out.println("There are no more of this item left.");
            return false;
        }

        if (pokemon.getHealth() + healing <= pokemon.getLevel() * 10) { // if the pokemon is not at max health
            pokemon.setHealth(pokemon.getHealth() + healing);
        }
        else { // set health to max health
            pokemon.setHealth(pokemon.getLevel() * 10);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
