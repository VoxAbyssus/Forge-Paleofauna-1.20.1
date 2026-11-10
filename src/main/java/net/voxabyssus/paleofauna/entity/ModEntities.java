package net.voxabyssus.paleofauna.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.custom.IchthyosaurusCommunisEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Paleofauna.MOD_ID);

    public static final RegistryObject<EntityType<IchthyosaurusCommunisEntity>> ICHTHYOSAURUS_COMMUNIS =
            ENTITY_TYPES.register("ichthyosaurus_communis", () -> EntityType.Builder.of(IchthyosaurusCommunisEntity::new, MobCategory.WATER_CREATURE)
                    .sized(2f, 1f).build("ichthyosaurus_communis"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
