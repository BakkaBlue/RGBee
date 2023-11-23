package RBGee;

import RBGee.content.RGBeeBlocks;
import RBGee.content.RGBeeItems;
import RBGee.content.RGBeeLiquids;
import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class RBGeeMod extends Mod{

    public RBGeeMod(){
        Log.info("Loaded RBGeeMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'RBGeeMod-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("RBGeeMod-java-mod-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        RGBeeItems.load();
        RGBeeLiquids.load();
        RGBeeBlocks.load();
        Log.info("Loading some RBGeeMod content.");
    }

}
