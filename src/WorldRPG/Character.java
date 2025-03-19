package WorldRPG;
//character information (private):health
//character information (public): range, movement - 3.10.2025
//character shape: rectangle - 3.11.2025
//question life decisions and assign easter eggs to character movement - 3.17.2025
//wipe everything and rewrite - 3.18.2025
public class Character {
    private float health;
    private int mana;

    public Character(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public void consumeItem(item item) {
        switch (item.getType()) {
            case "health":
                this.health += item.getEffectValue();
                System.out.println(item.getName() + "Potion consumed! Health increased by " + item.getEffectValue());
                break;
            case "mana":
                this.mana += item.getEffectValue();
                System.out.println(item.getName() + " consumed! Mana increased by " + item.getEffectValue());
                break;
            default:
                System.out.println("Unknown item type.");
        }
    }

    public void displayStats() {
        System.out.println("Health: " + health + " | Mana: " + mana);
    }
    public float getHealth() {
        return health;
    }
}
