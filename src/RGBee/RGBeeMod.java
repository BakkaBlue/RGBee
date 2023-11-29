package RGBee;

import RGBee.contents.RGBeeBlocks;
import RGBee.contents.RGBeeItems;
import RGBee.contents.RGBeeLiquids;
import RGBee.contents.RGBeeUnitTypes;
import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class RGBeeMod extends Mod{

    public static String ModName = "RGBee";
    public static String name(String add){
        return ModName + "-" + add;
    }

    public RGBeeMod(){
        Log.info("Loaded RGBeeMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'RGBeeMod-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("RGBeeMod-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        RGBeeItems.load();
        RGBeeLiquids.load();
        RGBeeUnitTypes.load();
        RGBeeBlocks.load();
        Log.info("Loading some RGBeeMod content.");
    }

}
