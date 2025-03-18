import java.util.Random;

public class Enemy extends Character {
    private String name;
    private int magicPoints;

    public Enemy(String name, float health,float attackPower, boolean isAlive ) {
        super(health, attackPower, isAlive);
        this.magicPoints = 30;
    }

    Enemy(String n, int h, int ap, boolean ia) {
        super(n, h, ap, ia);

    }

    public boolean fightHero(Hero hero) {
        Random rand = new Random();

        //chance to miss had to be taken from online no idea how to do this
        int chanceToMiss = rand.nextInt(100);  // 0 to 99
        if (chanceToMiss < 10) {  // 10% chance to miss
            System.out.println("The attack missed!");
            return false;  // Attack missed
        }

        boolean useMagicalAttack = rand.nextBoolean();
        double damageDealt;

        if (useMagicalAttack && magicPoints >= 15) {
            damageDealt = getAttackPower() * 3;
            magicPoints -= 15;
            System.out.println("MAGICAL ATTACK ACTIVATED! Enemy has dealt " + damageDealt + " damage to " + hero.getName())
        } else {

            System.out.println("Enemy dealt " + damageDealt + " damage to " + hero.getName());
        }

    }
            public String getName () {
                return name;
            }

            public void setName (String name){
                this.name = name;
            }

            public int getMagicPoints () {
                return magicPoints;
            }

            public int setMagicPoints ( int magicPoints){
                this.magicPoints = magicPoints;
            }


        public float getAttackPower() {
            return attackPower;
        }

        public float getHealth(){
            return health;
        }

        public void setAttackPower(float attackPower) {
            this.attackPower = attackPower;
        }

        public void info() {
        System.out.println("Enemy's name:" + getName() + " Health: " + getHealth() + " Attack Power: " + getAttackPower());

    }
    }

