package World;

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
    private int value;
    private boolean collectible;


    public item (String name, int value) {
        this.name = name;
        this.value = value;
        this.collectible = true;
    }

    public static void main(String[] args) {
        String name, itemchoice;
        boolean consume;

        List<item> items = new ArrayList<>();
        items.add(new item("Potion, Green", 20));
        items.add(new item("Potion, Purple", -20));

    }
}