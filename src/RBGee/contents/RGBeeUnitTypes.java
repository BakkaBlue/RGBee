package RBGee.contents;

import mindustry.ai.UnitCommand;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BombBulletType;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.PowerAmmoType;
import mindustry.world.meta.BlockFlag;

/**
 * maybe I'll write this later(?)
 */
public class RGBeeUnitTypes {

    public static UnitType
            mechWorkerBee, mechDrone /* mech */;

    public static void load() {
        mechWorkerBee = new UnitType("mechWorkerBee") {{
            /* todo maybe i need to invent a new kind of minerAI(?
            controller = u -> new;
            */
            defaultCommand = UnitCommand.mineCommand;

            flying = true;
            drag = 0.06f;
            accel = 0.12f;
            speed = 1.5f;
            health = 150;
            engineSize = 1.8f;
            engineOffset = 5.7f;
            range = 50f;
            isEnemy = false;

            ammoType = new PowerAmmoType(600);

            mineTier = 1;
            mineSpeed = 3f;
        }};

        mechDrone = new UnitType("mechDrone") {{
            speed = 2.7f;
            accel = 0.08f;
            drag = 0.04f;
            flying = true;
            health = 70;
            engineOffset = 5.75f;
            targetFlags = new BlockFlag[]{BlockFlag.generator, null};
            hitSize = 9;
            itemCapacity = 10;

            weapons.add(new Weapon() {{
                y = 0f;
                x = 2f;
                reload = 10f;
                ejectEffect = Fx.ballfire;
                bullet = new BombBulletType(27f,30f) {{
                   width = 10f;
                   height = 14f;
                   hitEffect = Fx.flakExplosion;
                   shootEffect = Fx.lightning;
                   smokeEffect = Fx.fire;

                   status = StatusEffects.blasted;
                   statusDuration = 60f;
                }};
            }});
        }};
    }
}
