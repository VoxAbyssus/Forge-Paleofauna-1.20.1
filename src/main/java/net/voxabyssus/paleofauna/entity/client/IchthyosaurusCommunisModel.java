package net.voxabyssus.paleofauna.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.custom.IchthyosaurusCommunisEntity;
import software.bernie.geckolib.model.GeoModel;

public class IchthyosaurusCommunisModel extends GeoModel<IchthyosaurusCommunisEntity> {

    @Override
    public ResourceLocation getModelResource(IchthyosaurusCommunisEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(
                Paleofauna.MOD_ID,
                "geo/ichthyosaurus_communis.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(IchthyosaurusCommunisEntity entity) {

        String texture;

        if (entity.isBaby()) {
            texture = "textures/entity/ichthyosaurus_communis_baby.png";
        } else if (entity.isMale()) {
            texture = "textures/entity/ichthyosaurus_communis_male.png";
        } else {
            texture = "textures/entity/ichthyosaurus_communis_female.png";
        }

        return ResourceLocation.fromNamespaceAndPath(
                Paleofauna.MOD_ID,
                texture
        );
    }

    @Override
    public ResourceLocation getAnimationResource(IchthyosaurusCommunisEntity entity) {
        return null;
    }
}