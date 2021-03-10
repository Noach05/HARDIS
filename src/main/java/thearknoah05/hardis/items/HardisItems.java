package thearknoah05.hardis.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import thearknoah05.hardis.HardisBase;

public class HardisItems {

    public static ItemGroup MAIN = new ItemGroup("hardisbase.hardis") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(HardisItems.TARDIS_HEART.get());
        }
    };

    public static final DeferredRegister< Item > ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HardisBase.MODID);

    public static final RegistryObject< Item > TARDIS_HEART = ITEMS.register("tardis_heart", () -> new Item(new Item.Properties().maxStackSize(1).group(HardisItems.MAIN)));
    public static final RegistryObject< Item > TARDIS_ACTIVATOR = ITEMS.register("tardis_activator", () -> new Item(new Item.Properties().maxStackSize(1).group(HardisItems.MAIN)));
    public static final RegistryObject< Item > TIME_VECTOR_GENERATOR = ITEMS.register("time_vector_generator", () -> new Item(new Item.Properties().maxStackSize(1).group(HardisItems.MAIN)));
    public static final RegistryObject< Item > RELATIVE_DIMENSION_STABILISER = ITEMS.register("relative_dimension_stabiliser", () -> new Item(new Item.Properties().maxStackSize(1).group(HardisItems.MAIN)));
    public static final RegistryObject< Item > SYMBIOTIC_NUCLEI = ITEMS.register("symbiotic_nuclei", () -> new Item(new Item.Properties().maxStackSize(1).group(HardisItems.MAIN)));

}
