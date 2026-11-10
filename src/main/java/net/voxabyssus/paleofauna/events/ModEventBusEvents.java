package net.voxabyssus.paleofauna.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.ModEntities;
import net.voxabyssus.paleofauna.entity.custom.IchthyosaurusCommunisEntity;

@Mod.EventBusSubscriber(modid = Paleofauna.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(
                ModEntities.ICHTHYOSAURUS_COMMUNIS.get(),
                IchthyosaurusCommunisEntity.createAttributes().build()
        );
    }
}