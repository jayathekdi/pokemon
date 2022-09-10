public class Attack {
    private int damage;
    private String name;
    public Attack(String name, int damage) {
        this.damage = damage;
        this.name = name;
    }
    public void use(Pokemon opponent) {
        if (damage >= opponent.getHealth()) {
            opponent.setHealth(opponent.getHealth() - damage);
        }
        else {
            opponent.setHealth(0);
        }
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
