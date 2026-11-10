package net.voxabyssus.paleofauna.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.ModEntities;
import net.voxabyssus.paleofauna.entity.client.IchthyosaurusCommunisRenderer;

@Mod.EventBusSubscriber(
        modid = Paleofauna.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT)

public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(
                ModEntities.ICHTHYOSAURUS_COMMUNIS.get(), IchthyosaurusCommunisRenderer::new
        );
    }
}
