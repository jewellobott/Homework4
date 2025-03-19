import World.item;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

//import //item!!

public class Hero extends Character {
    private int level;
    private int experience;
    private float money;
    private List<item> inventory;
    private String name;


    public Hero(float health, float attackPower, boolean isAlive) {
        super(health, attackPower, isAlive);

        this.level = 1;
        this.experience = 0;
        this.money = 0.0f;
        this.inventory = new ArrayList<>(5);
        this.inventory.add(new item("Potion", 100));
    }


        public boolean fightEnemy(Enemy enemy) {
            Random rand = new Random();

            //chance to miss had to be taken from online no idea how to do this
            int chanceToMiss = rand.nextInt(100);  // 0 to 99
            if (chanceToMiss < 10) {  // 10% chance to miss
                System.out.println("The attack missed!");
                return false;  // Attack missed
            }

            boolean useSpecialAttack = rand.nextBoolean();
            double damageDealt;

            if (useSpecialAttack) {
                damageDealt = getAttackPower() * 3;
                System.out.println("SPECIAL ATTACK ACTIVATED! You've dealt " + damageDealt + " damage to " + enemy.getName());
            } else {
                damageDealt = getAttackPower();
                System.out.println("You've dealt " + damageDealt + " damage to " + enemy.getName());
            }


            public void useItem ( int index){
                if (index >= 0 && index < inventory.size) {
                    item item = inventory.get(index);
                    setHealth(getHealth() + item.getHealingPower());
                    System.out.println(getName() + "was  healed by " + item.getName() + " You were healed " + healingPower + " HP");
                    inventory.remove(index);
                }
            }


        }

        public void levelUp() {
            if (experience > 100) {
                level++;
                experience = 0;
                setHealth(getHealth() * 1.10f);
                setAttackPower(getAttackPower() * 1.10f);
                System.out.println("You have leveled up to " + level + "!");
                System.out.println("Your experience has reset.")
                System.out.println("Health and Attack power upgraded by 10%!");
                System.out.println("Your health is now at " + getHealth());
                System.out.println("Your attack power is now at " + getAttackPower());
                System.out.println("Congratulations!");

            }

        }

        public boolean addToInventory(item item) {
            for (int i = 0; i < inventory.size; i++) {
                if (inventory.get(i) == null) {
                    inventory.set(i, item);
                    return true;
                }
            }

            if (inventory.size() < 5) {
                inventory.add(item);
                return true;
            } else {
                System.out.println("Inventory full. Item not added.");
                return false;
            }
        }

        public String showInventory() {
            if (inventory.isEmpty()) {
                return "Your inventory is empty.";
            }
            else{

            }

            //HOW TO SHOW REST OF INVENTORY??!!!
        }

        public float getAttackPower(){
            return attackPower;
        }

        public void setAttackPower(float attackPower){
            this.attackPower = attackPower;
        }

        public float getHealth(){
            return health;
        }

        public void setHealth(float health){
            this.health = health;
        }


        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public List<item> getInventory() {
            return inventory;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void info() {
            System.out.println("Hero's name:" + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower() + " Level: " + getLevel() + " Experience: " + getExperience() + " Money: " + getMoney());

        }




}