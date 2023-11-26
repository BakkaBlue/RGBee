package RBGee.world.blocks.defense;

import mindustry.entities.TargetPriority;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BlockGroup;
import mindustry.world.meta.Env;


public class stickyWall extends Wall {

    public stickyWall(String name) {
        super(name);
        solid = true;
        destructible = true;
        group = BlockGroup.walls;
        buildCostMultiplier = 4f;
        canOverdrive = false;
        drawDisabled = false;
        crushDamageMultiplier = 4f;
        priority = TargetPriority.wall;

        envEnabled = Env.any;
    }

//    TODO IDK how to make this kind of wall seems to be sticky...
}
