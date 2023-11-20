package RBGee.content;

import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;

import static mindustry.type.ItemStack.with;

public class RGBeeBlocks {
    public static Block
            //defense
            waxWall,waxWallLarge;
    public static void load() {
        //region defense

        int wallHealthMultiplier = 4;

        waxWall = new Block("wax-wall") {{
            requirements(Category.defense, with(RGBeeItems.beesWax, 6));
            health = 90 * wallHealthMultiplier;
            insulated = true;
        }};
        waxWallLarge = new Block("wax-wall-large") {{
           requirements(Category.defense, ItemStack.mult(waxWall.requirements, 4));
           health = 90 * 4 * wallHealthMultiplier;
           insulated = true;
        }};
    }
}
