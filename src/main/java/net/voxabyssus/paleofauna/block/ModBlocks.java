package net.voxabyssus.paleofauna.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.custom.ExtractorBlock;
import net.voxabyssus.paleofauna.item.ModItems;
import net.voxabyssus.paleofauna.item.custom.ExtractorItem;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Paleofauna.MOD_ID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        if (name.equals("extractor")) {
            return ModItems.ITEMS.register(name,
                    () -> new ExtractorItem(block.get(), new Item.Properties()));
        }

        return ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> COBBLED_LIMESTONE = registerBlock("cobbled_limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_STAIRS = registerBlock("cobbled_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_SLAB = registerBlock("cobbled_limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_WALL = registerBlock("cobbled_limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_STAIRS = registerBlock("limestone_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_SLAB = registerBlock("limestone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_WALL = registerBlock("limestone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> POLISHED_LIMESTONE = registerBlock("polished_limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> STONE_FOSSIL = registerBlock("stone_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> SANDSTONE_FOSSIL = registerBlock("sandstone_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> RED_SANDSTONE_FOSSIL = registerBlock("red_sandstone_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_FOSSIL = registerBlock("deepslate_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> TUFF_FOSSIL = registerBlock("tuff_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> CALCITE_FOSSIL = registerBlock("calcite_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSIL = registerBlock("limestone_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

    public static final RegistryObject<Block> EXTRACTOR = registerBlock("extractor",
            () -> new ExtractorBlock(
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                            .strength(3.0F)
                            .noOcclusion()
            ));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
