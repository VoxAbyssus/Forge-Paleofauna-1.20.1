package net.voxabyssus.paleofauna.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.LIMESTONE.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.add(ModBlocks.LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get()));

        this.dropSelf(ModBlocks.COBBLED_LIMESTONE.get());
        this.dropSelf(ModBlocks.COBBLED_LIMESTONE_STAIRS.get());
        this.add(ModBlocks.COBBLED_LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.COBBLED_LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.COBBLED_LIMESTONE_WALL.get());

        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS_STAIRS.get());
        this.add(ModBlocks.LIMESTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_BRICKS_SLAB.get()));
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS_WALL.get());

        this.dropSelf(ModBlocks.POLISHED_LIMESTONE.get());
        this.dropSelf(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_LIMESTONE_SLAB.get()));

        this.dropSelf(ModBlocks.STONE_FOSSIL.get());
        this.dropSelf(ModBlocks.SANDSTONE_FOSSIL.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_FOSSIL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_FOSSIL.get());
        this.dropSelf(ModBlocks.TUFF_FOSSIL.get());
        this.dropSelf(ModBlocks.CALCITE_FOSSIL.get());
        this.dropSelf(ModBlocks.LIMESTONE_FOSSIL.get());

        this.dropSelf(ModBlocks.EXTRACTOR.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
