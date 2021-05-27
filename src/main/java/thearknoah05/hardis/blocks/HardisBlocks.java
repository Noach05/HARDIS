package thearknoah05.hardis.blocks;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import thearknoah05.hardis.HardisBase;

import java.rmi.registry.Registry;

import static thearknoah05.hardis.HardisBase.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HardisBlocks {

    public static Block setUpBlock(Block block) {
        return block;
    }

    public static final DeferredRegister< Block > BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, HardisBase.MODID);
    public static final DeferredRegister< Item > BLOCK_ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HardisBase.MODID);
    public static final RegistryObject< Block > TARDIS_HEART = BLOCKS.register("tardis_heart", () -> setUpBlock(new BlockTardisHeart()));
}
