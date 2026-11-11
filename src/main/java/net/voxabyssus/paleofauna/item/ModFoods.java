package net.voxabyssus.paleofauna.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PACHYCEPHALOSAURUS_MEAT = new FoodProperties.Builder()
        .meat()
        .nutrition(3)
        .saturationMod(0.2f).build();

    public static final FoodProperties PACHYCEPHALOSAURUS_COOKED_MEAT = new FoodProperties.Builder()
            .meat()
            .nutrition(6)
            .saturationMod(0.4f).build();

    public static final FoodProperties DSUNGARIPTERUS_MEAT = new FoodProperties.Builder()
            .meat()
            .nutrition(2)
            .saturationMod(0.2f).build();

    public static final FoodProperties DSUNGARIPTERUS_COOKED_MEAT = new FoodProperties.Builder()
            .meat()
            .nutrition(4)
            .saturationMod(0.4f).build();

    public static final FoodProperties ICHTHYOSAURUS_MEAT = new FoodProperties.Builder()
            .meat()
            .nutrition(2)
            .saturationMod(0.2f).build();

    public static final FoodProperties ICHTHYOSAURUS_COOKED_MEAT = new FoodProperties.Builder()
            .meat()
            .nutrition(4)
            .saturationMod(0.4f).build();


}
