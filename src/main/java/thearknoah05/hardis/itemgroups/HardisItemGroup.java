package thearknoah05.hardis.itemgroups;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import thearknoah05.hardis.HardisBase;
import thearknoah05.hardis.items.HardisItems;

@Mod.EventBusSubscriber(modid = HardisBase.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HardisItemGroup {

    public static ItemGroup HARDIS = new ItemGroup(HardisBase.MODID + ".hardis") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(HardisItems.tardis_heart);
        }
    };
}
