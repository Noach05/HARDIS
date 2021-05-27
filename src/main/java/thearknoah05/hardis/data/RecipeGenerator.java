package thearknoah05.hardis.data;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

/* Created by Craig on 10/03/2021 */
public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer< IFinishedRecipe > consumer) {
        ShapedRecipeBuilder.shapedRecipe(Items.BOWL, 4).key('#', ItemTags.PLANKS).patternLine("# #").patternLine(" # ").addCriterion("has_brown_mushroom", this.hasItem(Blocks.BROWN_MUSHROOM)).addCriterion("has_red_mushroom", this.hasItem(Blocks.RED_MUSHROOM)).addCriterion("has_mushroom_stew", this.hasItem(Items.MUSHROOM_STEW)).build(consumer);
    }
}
