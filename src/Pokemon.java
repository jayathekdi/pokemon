import java.util.*;
public class Pokemon {
    private String name;//test
    private int level;
    private Attack[] attacks;
    private int health;
    private boolean isCurrent;
    Pokemon(String name, int level, Attack[] attacks, boolean isCurrent){
        this.name = name;
        this.level = level;
        this.attacks = attacks;
        this.health = level * 10;
        this.isCurrent = isCurrent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Attack[] getAttacks() {
        return attacks;
    }

    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Attack attack, Pokemon opponent){
        //opponent.setHealth() -= attack.getDamageLevel;
        //
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
}