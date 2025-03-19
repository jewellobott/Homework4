package WorldRPG;

import java.util.ArrayList;
import java.util.List;

//item information (private): location, collectable (cap at 4 per item)
//item information (public):
// blue (hp)
// red (weapon)
// purple (info on boss) - 3.10.2025
// item shape: square - 3.11.2025
// what am I doing??? coding for the weapon and boss info  - 3.17.2025
//wipe and rewrite everything - 3.18.2025
public class item {
    private String name;
    private String type;
    private boolean healingValue;
    private int effectValue;


    public item (String name, int value) {
        this.name = name;
        this.type = type;
        this.healingValue = true;
        this.effectValue = effectValue;
    }

    public static void main(String[] args) {
        String name, type;
        int effectValue;

        List<item> items = new ArrayList<>();
        items.add(new item("Potion, Healing", 20));
        items.add(new item("Potion, Poison", -20));

        //set up so that the value of the potions reduce character health

    }
    public String getName(){
        return name;
    }
    public String getType() {
        return type;
    }
    public boolean getHealingValue() {
        return healingValue;
    }
    public int getEffectValue() {
        return effectValue;
    }
}