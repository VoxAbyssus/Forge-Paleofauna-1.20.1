package net.voxabyssus.paleofauna.block.entity.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.voxabyssus.paleofauna.block.entity.ExtractorBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ExtractorRenderer extends GeoBlockRenderer<ExtractorBlockEntity> {

    public ExtractorRenderer(BlockEntityRendererProvider.Context context) {
        super(new ExtractorModel());
    }
}