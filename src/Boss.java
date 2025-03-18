import java.util.Random;

public class Boss extends Enemy {

    private int ultrasLeft;

    Boss(int h, int ap, boolean ia) {
        super("FINAL BOSS", h, ap, ia);
        ultrasLeft = 3;
    }

    public boolean fight(Hero hero) {
        Random rand = new Random();

        //chance to miss had to be taken from online no idea how to do this
        int chanceToMiss = rand.nextInt(100);  // 0 to 99
        if (chanceToMiss < 10) {  // 10% chance to miss
            System.out.println("The attack missed!");
            return false;  // Attack missed
        }

        boolean useUltraAttack = rand.nextBoolean();
        double damageDealt;

        if (useUltraAttack && ultrasLeft > 0) {
            damageDealt = getAttackPower() * 5;
            ultrasLeft -= 1;
            System.out.println("ULTRA ATTACK ACTIVATED! Boss  has dealt " + damageDealt + " damage to " + hero.getName());
        } else {
            damageDealt = getAttackPower();
            System.out.println("Boss dealt " + damageDealt + " damage to " + hero.getName());
        }
        return true;
    }


    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

   public float getAttackPower(){
        return attackPower;
   }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void info(){
        System.out.println("Boss's name:" + getName() + "Health: " + health +  );
    }
    //Info():*
}
