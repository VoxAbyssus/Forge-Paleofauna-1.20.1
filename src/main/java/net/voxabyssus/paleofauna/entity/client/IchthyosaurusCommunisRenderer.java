package net.voxabyssus.paleofauna.entity.client;

import mod.azure.azurelib.render.entity.AzEntityRenderer;
import mod.azure.azurelib.render.entity.AzEntityRendererConfig;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.custom.IchthyosaurusCommunisEntity;

public class IchthyosaurusCommunisRenderer extends AzEntityRenderer<IchthyosaurusCommunisEntity> {

    private static final ResourceLocation GEO =
            ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "geo/ichthyosaurus_communis.geo.json");

    public IchthyosaurusCommunisRenderer(EntityRendererProvider.Context context) {
        super(
                AzEntityRendererConfig.<IchthyosaurusCommunisEntity>builder(
                                entity -> GEO,
                                IchthyosaurusCommunisRenderer::getTexture
                        )
                        .setShadowRadius(0.5f)
                        .setScale(entity -> entity.isBaby() ? 0.35f : 1.0f)
                        .build(),
                context
        );
    }

    private static ResourceLocation getTexture(IchthyosaurusCommunisEntity entity) {
        String texture;

        if (entity.isBaby()) {
            texture = "textures/entity/ichthyosaurus_communis_baby.png";
        } else if (entity.isMale()) {
            texture = "textures/entity/ichthyosaurus_communis_male.png";
        } else {
            texture = "textures/entity/ichthyosaurus_communis_female.png";
        }

        return ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, texture);
    }
}
