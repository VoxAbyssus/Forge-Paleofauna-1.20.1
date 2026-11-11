package net.voxabyssus.paleofauna.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Paleofauna.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ExtractorRecipe>> EXTRACTOR_SERIALIZER =
            SERIALIZERS.register("extractor", () -> ExtractorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
