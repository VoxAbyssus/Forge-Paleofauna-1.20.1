package net.voxabyssus.paleofauna.item.custom.client;

import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.item.custom.ExtractorItem;
import software.bernie.geckolib.model.GeoModel;

public class ExtractorItemModel extends GeoModel<ExtractorItem> {
    @Override
    public ResourceLocation getModelResource(ExtractorItem extractorItem) {
        return ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "geo/extractor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ExtractorItem extractorItem) {
        return ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "textures/block/extractor_off.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ExtractorItem extractorItem) {
        return null;
    }
}
