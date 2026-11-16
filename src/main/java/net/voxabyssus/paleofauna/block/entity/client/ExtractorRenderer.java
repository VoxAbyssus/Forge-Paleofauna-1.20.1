package net.voxabyssus.paleofauna.block.entity.client;

import mod.azure.azurelib.render.block.AzBlockEntityRenderer;
import mod.azure.azurelib.render.block.AzBlockEntityRendererConfig;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.entity.ExtractorBlockEntity;

public class ExtractorRenderer extends AzBlockEntityRenderer<ExtractorBlockEntity> { //TODO: Switch out new stuff from the convetted models

    private static final ResourceLocation GEO =
            ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "geo/extractor.geo.json");

    private static final ResourceLocation TEX =
            ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "textures/block/extractor_off.png");

    public ExtractorRenderer(BlockEntityRendererProvider.Context context) {
        super(AzBlockEntityRendererConfig.<ExtractorBlockEntity>builder(GEO, TEX).build());
    }
}