package net.voxabyssus.paleofauna.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.RandomSource;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.voxabyssus.paleofauna.Paleofauna;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ExtractorRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final List<WeightedOutput> outputs;
    private final ResourceLocation id;

    public ExtractorRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.outputs = new ArrayList<>();
        this.id = id;
    }

    public ExtractorRecipe(NonNullList<Ingredient> inputItems, List<WeightedOutput> outputs, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = ItemStack.EMPTY;
        this.outputs = outputs;
        this.id = id;
    }

    public static class WeightedOutput {
        private final ItemStack stack;
        private final int weight;

        public WeightedOutput(ItemStack stack, int weight) {
            this.stack = stack;
            this.weight = weight;
        }

        public ItemStack getStack() {
            return stack;
        }

        public int getWeight() {
            return weight;
        }
    }

    public ItemStack getRandomOutput(RandomSource random) {
        if (!output.isEmpty()) {
            return output.copy();
        }

        int totalWeight = outputs.stream()
                .mapToInt(WeightedOutput::getWeight)
                .sum();

        if (totalWeight <= 0) {
            return ItemStack.EMPTY;
        }

        int selectedWeight = random.nextInt(totalWeight);
        for (WeightedOutput weightedOutput : outputs) {
            selectedWeight -= weightedOutput.getWeight();

            if (selectedWeight < 0) {
                return weightedOutput.getStack().copy();
            }
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        return inputItems.get(0).test(pContainer.getItem(0));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<ExtractorRecipe> {
        public static final Type INSTANCE = new Type();
        public static final  String ID = "extractor";
    }

    public static class Serializer implements  RecipeSerializer<ExtractorRecipe>{
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "extractor");

        @Override
        public ExtractorRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            if (pSerializedRecipe.has("outputs")) {
                JsonArray outputsJson = GsonHelper.getAsJsonArray(pSerializedRecipe,"outputs");
                List<WeightedOutput> outputs = new ArrayList<>();

                for (int i = 0; i < outputsJson.size(); i++) {

                }
            }

            return new ExtractorRecipe(inputs, output, pRecipeId);
        }

        @Override
        public @Nullable ExtractorRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(pBuffer));
            }

            ItemStack output = pBuffer.readItem();
            return new ExtractorRecipe(inputs, output, pRecipeId);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, ExtractorRecipe pRecipe) {
            pBuffer.writeInt(pRecipe.inputItems.size());

            for (Ingredient ingredient : pRecipe.getIngredients()) {
                ingredient.toNetwork(pBuffer);
            }

            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);
        }
    }
}
