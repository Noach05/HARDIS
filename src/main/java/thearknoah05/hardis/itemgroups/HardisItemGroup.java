package thearknoah05.hardis.itemgroups;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thearknoah05.hardis.HardisBase;
import thearknoah05.hardis.items.HardisItems;

public class HardisItemGroup extends ItemGroup {

    public HardisItemGroup() {
        super("hardis");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(HardisItems.tardis_heart);
    }
}
