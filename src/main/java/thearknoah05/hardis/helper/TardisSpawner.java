package thearknoah05.hardis.helper;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.TardisHelper;
import thearknoah05.hardis.HardisBase;

public class TardisSpawner {

    public static void checkAchievementsForSpawn(EntityJoinWorldEvent event) {
        exteriorAdvancementCheck(event, new ResourceLocation(HardisBase.MODID, "place_broken_exterior"));
    }

    private static void exteriorAdvancementCheck(EntityJoinWorldEvent event, ResourceLocation advancement) {
        if(event.getEntity() instanceof ServerPlayerEntity) {
            ServerPlayerEntity player = (ServerPlayerEntity)event.getEntity();

            Helper.doIfAdvancementPresentOther(advancement, player, () ->{
                TardisHelper.setupPlayersTARDIS(player);
            });
        }
    }
}
