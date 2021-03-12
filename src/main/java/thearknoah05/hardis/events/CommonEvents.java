package thearknoah05.hardis.events;

import net.minecraft.entity.EntityType;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import thearknoah05.hardis.HardisBase;
import thearknoah05.hardis.helper.TardisSpawner;

@Mod.EventBusSubscriber(modid = HardisBase.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        //Advancements
        if(event.getEntity().getType() == EntityType.PLAYER) {
            TardisSpawner.checkAchievementsForSpawn(event);
        }
    }
}
