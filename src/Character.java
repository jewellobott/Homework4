//character information (private):health
//character information (public): range, movement - 3.10.2025
//character shape: rectangle - 3.11.2025
//question life decisions and assign easter eggs to character movement - 3.17.2025
//wipe everything and rewrite - 3.18.2025
public class Character {
    static class character {
        String name;
        int strength;
        double health;
        boolean isHero;
        public character(String name, int strength, double health) {
            this.name = name;
            this.strength = strength;
            this.health = health;
            this.isHero = true;
        }
        displayInfo() {

        }
    }
}