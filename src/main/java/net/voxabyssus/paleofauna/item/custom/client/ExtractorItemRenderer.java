
package net.voxabyssus.paleofauna.item.custom.client;

import net.voxabyssus.paleofauna.item.custom.ExtractorItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ExtractorItemRenderer extends GeoItemRenderer<ExtractorItem> {
    public ExtractorItemRenderer() {
        super(new ExtractorItemModel());
    }
}
