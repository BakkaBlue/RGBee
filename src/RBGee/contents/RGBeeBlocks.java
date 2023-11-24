package RBGee.contents;

import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.environment.TreeBlock;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.units.UnitFactory;

import static mindustry.type.ItemStack.with;

public class RGBeeBlocks {
    public static Block
            //crafting
            honeyBlender,
            //tree?
            tree,
            //production

            //units
            elementaryArtificialBeehive,
            //defense
            waxWall, waxWallLarge;
    public static void load() {
        //region crafting

        honeyBlender = new AttributeCrafter("honey-blender") {{
            requirements(Category.crafting, with(Items.titanium, 80, Items.copper, 100));
            //craftEffect = Fx.
            outputItem = new ItemStack(RGBeeItems.stickySteel, 2);
            craftTime = 35f;
            size = 2;
            hasPower = true;
            hasLiquids = true;
            //drawer = new
            ambientSound = Sounds.laserbeam;
            ambientSoundVolume = 0.07f;

            consumeItems(with(Items.titanium, 2));
            consumeLiquid(RGBeeLiquids.honey, 30f);
            consumePower(0.8f);
        }};

        //endregion
        //region tree?

        tree = new TreeBlock("tree?") ;

        //endregion
        //region production

        //

        //end region
        //region units

        elementaryArtificialBeehive = new UnitFactory("elementary-artificial-beehive") {{
            requirements(Category.units, with(Items.copper, 70, Items.lead, 70, RGBeeItems.stickySteel, 30));
            /* TODO
            plans = Seq.with(
                    new UnitPlan(UnitType.)
            );
            */
            size = 3;
            consumePower(1.3f);
        }};

        //endregion
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

        //endregion
    }
}
