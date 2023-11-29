package RGBee.contents;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class RGBeeItems {
    public static Item
            beesWax, stickySteel;
    public static final Seq<Item> serpuluoItems = new Seq<>(), erekirItems = new Seq<>(), erekirOnlyItems = new Seq<>();
    public static void load() {
        beesWax = new Item("beesWax", Color.valueOf("fdc848")) {{
           hardness = 1;
           cost = 0.4f;
           alwaysUnlocked = true;
        }};
        stickySteel = new Item("sticky-steel", Color.valueOf("2cbff0")) {{
            hardness = 4;
            cost = 1.1f;
        }};
    }
}
