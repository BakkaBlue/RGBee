package RGBee.contents;

import mindustry.content.Planets;
import mindustry.maps.planet.ErekirPlanetGenerator;
import mindustry.type.Planet;

public class BeePlanet {
    public static Planet theGiantHive;

    public static void load() {
        theGiantHive = new Planet("the-giant-hive", Planets.sun, 1, 3) {{
            generator = new ErekirPlanetGenerator();
            //meshLoader =
        }};
    }

}
