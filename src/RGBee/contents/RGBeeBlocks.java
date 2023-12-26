package RGBee.contents;

import RGBee.world.blocks.defense.stickyWall;
import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.environment.TreeBlock;
import mindustry.world.blocks.production.AttributeCrafter;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.meta.Env;

import static mindustry.type.ItemStack.with;

public class RGBeeBlocks {
    public static Block
            //distribution
            //TODO a conveyor to be made
            //crafting
            honeyBlender,
            //tree?
            tree,
            //production

            //units
            elementaryArtificialBeehive,
            //defense
            waxWall, waxWallLarge, stickySteelWall, stickySteelWallLarge;
    public static void load() {
        //region distribution

        //TODO a conveyor to be made

        //endregion
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
            plans = Seq.with(
                    new UnitPlan(RGBeeUnitTypes.mechWorkerBee, 60f * 35, with(RGBeeItems.stickySteel, 15, Items.silicon, 30)),
                    new UnitPlan(RGBeeUnitTypes.mechDrone, 60f * 10, with(RGBeeItems.stickySteel, 15))
            );
            size = 3;
            consumePower(1.3f);
        }};

        //endregion
        //region defense

        int wallHealthMultiplier = 6;

        waxWall = new Block("wax-wall") {{
            requirements(Category.defense, with(RGBeeItems.beesWax, 6));
            health = 90 * wallHealthMultiplier;
            insulated = true;
        }};
        waxWallLarge = new Block("wax-wall-large") {{
           requirements(Category.defense, ItemStack.mult(waxWall.requirements, 4));
           health = 90 * 4 * wallHealthMultiplier;
           size = 2;
           insulated = true;
        }};
        stickySteelWall = new stickyWall("sticky-steel-wall") {{
           requirements(Category.defense, with(RGBeeItems.stickySteel, 6));
           health = 160 * wallHealthMultiplier;
           lightningChance = 0.1f;
           envDisabled |= Env.scorching;
        }};
        stickySteelWallLarge = new stickyWall("sticky-steel-wall-lage") {{
           requirements(Category.defense, ItemStack.mult(stickySteelWall.requirements, 4));
           health = 160 * 4 *wallHealthMultiplier;
           size = 2;
           lightningChance = 0.1f;
           envDisabled |= Env.scorching;
        }};

        //endregion
    }
}
