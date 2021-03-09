package thearknoah05.hardis.registries;


import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;
import thearknoah05.hardis.itemgroups.HardisItemGroup;
import thearknoah05.hardis.items.HardisItems;


import static thearknoah05.hardis.HardisBase.MODID;
import static thearknoah05.hardis.HardisBase.hardis;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class HardisRegistry {
    public static final ItemGroup HARDIS = hardis;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                HardisItems.relative_dimension_stabiliser = new Item(new Item.Properties().maxStackSize(1).group(hardis)).setRegistryName(location("relative_dimension_stabiliser")),
                HardisItems.symbiotic_nuclei = new Item(new Item.Properties().maxStackSize(1).group(hardis)).setRegistryName(location("symbiotic_nuclei")),
                HardisItems.tardis_activator = new Item(new Item.Properties().maxStackSize(1).group(hardis)).setRegistryName(location("tardis_activator")),
                HardisItems.tardis_heart = new Item(new Item.Properties().maxStackSize(1).group(hardis)).setRegistryName(location("tardis_heart")),
                HardisItems.time_vector_generator = new Item(new Item.Properties().maxStackSize(1).group(hardis)).setRegistryName(location("time_vector_generator"))

        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MODID, name);
    }

}
