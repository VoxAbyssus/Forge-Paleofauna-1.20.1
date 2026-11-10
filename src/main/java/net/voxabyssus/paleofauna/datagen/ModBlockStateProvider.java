package net.voxabyssus.paleofauna.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Paleofauna.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LIMESTONE);
        stairsBlock(((StairBlock) ModBlocks.LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.LIMESTONE_SLAB.get()), blockTexture(ModBlocks.LIMESTONE.get()), blockTexture(ModBlocks.LIMESTONE.get()));

        blockWithItem(ModBlocks.COBBLED_LIMESTONE);
        stairsBlock(((StairBlock) ModBlocks.COBBLED_LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.COBBLED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));
        wallBlock(((WallBlock) ModBlocks.COBBLED_LIMESTONE_WALL.get()), blockTexture(ModBlocks.COBBLED_LIMESTONE.get()));

        blockWithItem(ModBlocks.LIMESTONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.LIMESTONE_BRICKS_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.LIMESTONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIMESTONE_BRICKS_WALL.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));

        blockWithItem(ModBlocks.POLISHED_LIMESTONE);
        stairsBlock(((StairBlock) ModBlocks.POLISHED_LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));
        slabBlock(((SlabBlock) ModBlocks.POLISHED_LIMESTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()), blockTexture(ModBlocks.POLISHED_LIMESTONE.get()));

        blockWithItem(ModBlocks.STONE_FOSSIL);
        blockWithItem(ModBlocks.SANDSTONE_FOSSIL);
        blockWithItem(ModBlocks.RED_SANDSTONE_FOSSIL);
        blockWithItem(ModBlocks.DEEPSLATE_FOSSIL);
        blockWithItem(ModBlocks.TUFF_FOSSIL);
        blockWithItem(ModBlocks.CALCITE_FOSSIL);
        blockWithItem(ModBlocks.LIMESTONE_FOSSIL);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
