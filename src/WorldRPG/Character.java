package WorldRPG;
//character information (private):health
//character information (public): range, movement - 3.10.2025
//character shape: rectangle - 3.11.2025
//question life decisions and assign easter eggs to character movement - 3.17.2025
//wipe everything and rewrite - 3.18.2025
public class Character {
    private float health;
    private int damage;
    private int attackPower;

    public Character(float health, int damage, int attackPower) {
        this.health = health;
        this.damage = damage;
        this.attackPower = attackPower;
    }

    public void consumeItem(item item) {
        switch (item.getType()) {
            case "health":
                this.health += item.getEffectValue();
                System.out.println(item.getName() + "Potion consumed! Health increased by " + item.getEffectValue());
                break;
            case "damage":
                this.damage += item.getEffectValue();
                System.out.println(item.getName() + "Potion consumed! Oh no! It's poison! Health decreaseed by " + item.getEffectValue());
                break;

        }
    }
    public void attack (Enemy enemy) {
        System.out.println("Nice hit!" + attackPower + "of damage!");
        enemy.takeDamage(attackPower);
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("Ouch!" + damage + " damage. Remaining health: " + this.health);
        if (this.health <= 0) {
            System.out.println("Game over!");
        }
    }

    public void displayStats() {
        System.out.println("Health: " + health + " | Damage: " + damage);
    }
    public float getHealth() {
        return health;
    }
}
