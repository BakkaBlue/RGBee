package RBGee.contents;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class RGBeeLiquids {
    public static Liquid
    honey;
    public static void load() {
        honey = new Liquid("honey", Color.valueOf("fdc848")) {{
           heatCapacity = 0.3f;
           viscosity = 0.65f;
        }};
    }
}
