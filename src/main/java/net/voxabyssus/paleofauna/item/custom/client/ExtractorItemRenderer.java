package net.voxabyssus.paleofauna.item.custom.client;

import mod.azure.azurelib.render.item.AzItemRenderer;
import mod.azure.azurelib.render.item.AzItemRendererConfig;
import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;

public class ExtractorItemRenderer extends AzItemRenderer {

    private static final ResourceLocation GEO =
            ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "geo/extractor.geo.json");

    private static final ResourceLocation TEX =
            ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "textures/block/extractor_off.png");

    public ExtractorItemRenderer() {
        super(AzItemRendererConfig.builder(GEO, TEX).build());
    }
}
