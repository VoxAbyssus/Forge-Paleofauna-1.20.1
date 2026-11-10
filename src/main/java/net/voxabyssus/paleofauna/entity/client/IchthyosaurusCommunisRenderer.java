package net.voxabyssus.paleofauna.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.voxabyssus.paleofauna.entity.custom.IchthyosaurusCommunisEntity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class IchthyosaurusCommunisRenderer extends GeoEntityRenderer<IchthyosaurusCommunisEntity> {

    public IchthyosaurusCommunisRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new IchthyosaurusCommunisModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public void scaleModelForRender(
            float widthScale,
            float heightScale,
            PoseStack poseStack,
            IchthyosaurusCommunisEntity animatable,
            BakedGeoModel model,
            boolean isReRender,
            float partialTick,
            int packedLight,
            int packedOverlay
    ) {
        if (animatable.isBaby()) {
            widthScale *= 0.35f;
            heightScale *= 0.35f;
        }

        super.scaleModelForRender(
                widthScale, heightScale, poseStack, animatable,
                model, isReRender, partialTick, packedLight, packedOverlay
        );
    }
}
