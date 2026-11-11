package net.voxabyssus.paleofauna.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.entity.ExtractorBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class ExtractorModel extends GeoModel<ExtractorBlockEntity> {
    @Override
    public ResourceLocation getModelResource(ExtractorBlockEntity extractorBlockEntity) {
        return ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "geo/extractor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ExtractorBlockEntity extractorBlockEntity) {
        return ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "textures/block/extractor_off.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ExtractorBlockEntity extractorBlockEntity) {
        return null;
    }
}
