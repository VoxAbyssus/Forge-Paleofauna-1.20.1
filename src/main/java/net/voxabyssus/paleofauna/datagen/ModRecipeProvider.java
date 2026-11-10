package net.voxabyssus.paleofauna.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        oreSmelting(pWriter, List.of(ModBlocks.COBBLED_LIMESTONE.get()),
                RecipeCategory.MISC, ModBlocks.LIMESTONE.get(),
                0.5f, 100, "limestone");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_STAIRS.get(), 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_SLAB.get(), 6)
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_LIMESTONE_STAIRS.get(), 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .define('L', ModBlocks.COBBLED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_LIMESTONE.get()), has(ModBlocks.COBBLED_LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_LIMESTONE_SLAB.get(), 6)
                .pattern("LLL")
                .define('L', ModBlocks.COBBLED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_LIMESTONE.get()), has(ModBlocks.COBBLED_LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBBLED_LIMESTONE_WALL.get(), 6)
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.COBBLED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.COBBLED_LIMESTONE.get()), has(ModBlocks.COBBLED_LIMESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_LIMESTONE.get(), 4)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE.get()), has(ModBlocks.LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_LIMESTONE_STAIRS.get(), 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .define('L', ModBlocks.POLISHED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_LIMESTONE.get()), has(ModBlocks.POLISHED_LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_LIMESTONE_SLAB.get(), 6)
                .pattern("LLL")
                .define('L', ModBlocks.POLISHED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_LIMESTONE.get()), has(ModBlocks.POLISHED_LIMESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_BRICKS.get(), 4)
                .pattern("LL")
                .pattern("LL")
                .define('L', ModBlocks.POLISHED_LIMESTONE.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_LIMESTONE.get()), has(ModBlocks.POLISHED_LIMESTONE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_BRICKS_STAIRS.get(), 4)
                .pattern("L  ")
                .pattern("LL ")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE_BRICKS.get()), has(ModBlocks.LIMESTONE_BRICKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_BRICKS_SLAB.get(), 6)
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE_BRICKS.get()), has(ModBlocks.LIMESTONE_BRICKS.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIMESTONE_BRICKS_WALL.get(), 6)
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModBlocks.LIMESTONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.LIMESTONE_BRICKS.get()), has(ModBlocks.LIMESTONE_BRICKS.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Paleofauna.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
