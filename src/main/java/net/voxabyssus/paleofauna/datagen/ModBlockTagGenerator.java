package net.voxabyssus.paleofauna.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Paleofauna.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LIMESTONE.get(),
                ModBlocks.COBBLED_LIMESTONE.get(),
                ModBlocks.LIMESTONE_BRICKS.get(),
                ModBlocks.POLISHED_LIMESTONE.get(),
                ModBlocks.LIMESTONE_STAIRS.get(),
                ModBlocks.LIMESTONE_SLAB.get(),
                ModBlocks.COBBLED_LIMESTONE_STAIRS.get(),
                ModBlocks.COBBLED_LIMESTONE_SLAB.get(),
                ModBlocks.COBBLED_LIMESTONE_WALL.get(),
                ModBlocks.LIMESTONE_BRICKS_STAIRS.get(),
                ModBlocks.LIMESTONE_BRICKS_SLAB.get(),
                ModBlocks.LIMESTONE_BRICKS_WALL.get(),
                ModBlocks.POLISHED_LIMESTONE_STAIRS.get(),

                ModBlocks.STONE_FOSSIL.get(),
                ModBlocks.SANDSTONE_FOSSIL.get(),
                ModBlocks.RED_SANDSTONE_FOSSIL.get(),
                ModBlocks.DEEPSLATE_FOSSIL.get(),
                ModBlocks.TUFF_FOSSIL.get(),
                ModBlocks.CALCITE_FOSSIL.get(),
                ModBlocks.LIMESTONE_FOSSIL.get()
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STONE_FOSSIL.get(),
                ModBlocks.SANDSTONE_FOSSIL.get(),
                ModBlocks.RED_SANDSTONE_FOSSIL.get(),
                ModBlocks.DEEPSLATE_FOSSIL.get(),
                ModBlocks.TUFF_FOSSIL.get(),
                ModBlocks.CALCITE_FOSSIL.get(),
                ModBlocks.LIMESTONE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.COBBLED_LIMESTONE_WALL.get(),
                ModBlocks.LIMESTONE_BRICKS_WALL.get()
                );
    }
}
