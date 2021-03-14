package thearknoah05.hardis.data;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import me.swirtzly.regeneration.handlers.RegenObjects;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.items.TItems;
import thearknoah05.hardis.config.HConfig;
import thearknoah05.hardis.config.RecipeDisableConfig;
import thearknoah05.hardis.items.HardisItems;

import java.util.function.Consumer;

/* Created by Craig on 10/03/2021 */
public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer< IFinishedRecipe > consumer) {
        ShapedRecipeBuilder.shapedRecipe(Items.BOWL, 4).key('#', ItemTags.PLANKS).patternLine("# #").patternLine(" # ").addCriterion("has_brown_mushroom", this.hasItem(Blocks.BROWN_MUSHROOM)).addCriterion("has_red_mushroom", this.hasItem(Blocks.RED_MUSHROOM)).addCriterion("has_mushroom_stew", this.hasItem(Items.MUSHROOM_STEW)).build(consumer);
        if(RecipeDisableConfig.disableFinalRecipe.equals(true)) {
            ShapedRecipeBuilder.shapedRecipe(TBlocks.broken_exterior, 1).key('#', TItems.THERMOCOUPLING).key('L', Items.LANTERN).key('T', TItems.CHAMELEON_CIRCUIT).key('C', AllBlocks.COPPER_BLOCK.get()).key('H', HardisItems.TARDIS_HEART.get()).key('K', TItems.MERCURY_BOTTLE).key('N', Items.NETHER_STAR).key('J', TItems.INT_DOOR).patternLine("#LT").patternLine("CHC").patternLine("KNJ").build(consumer);
        }
    }
}
