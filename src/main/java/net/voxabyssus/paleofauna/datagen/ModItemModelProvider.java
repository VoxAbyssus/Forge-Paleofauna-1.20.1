package net.voxabyssus.paleofauna.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.ModBlocks;
import net.voxabyssus.paleofauna.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Paleofauna.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DEINONYCHUS_SKULL);
        simpleItem(ModItems.DEINONYCHUS_VERTEBRAE);
        simpleItem(ModItems.DEINONYCHUS_RIBCAGE);
        simpleItem(ModItems.DEINONYCHUS_ARM_BONE);
        simpleItem(ModItems.DEINONYCHUS_LEG_BONE);
        simpleItem(ModItems.DEINONYCHUS_DNA);

        simpleItem(ModItems.GUANLONG_SKULL);
        simpleItem(ModItems.GUANLONG_VERTEBRAE);
        simpleItem(ModItems.GUANLONG_RIBCAGE);
        simpleItem(ModItems.GUANLONG_ARM_BONE);
        simpleItem(ModItems.GUANLONG_LEG_BONE);
        simpleItem(ModItems.GUANLONG_DNA);

        simpleItem(ModItems.HERRERASAURUS_SKULL);
        simpleItem(ModItems.HERRERASAURUS_VERTEBRAE);
        simpleItem(ModItems.HERRERASAURUS_RIBCAGE);
        simpleItem(ModItems.HERRERASAURUS_ARM_BONE);
        simpleItem(ModItems.HERRERASAURUS_LEG_BONE);
        simpleItem(ModItems.HERRERASAURUS_DNA);

        simpleItem(ModItems.SUCHOMIMUS_SKULL);
        simpleItem(ModItems.SUCHOMIMUS_VERTEBRAE);
        simpleItem(ModItems.SUCHOMIMUS_RIBCAGE);
        simpleItem(ModItems.SUCHOMIMUS_ARM_BONE);
        simpleItem(ModItems.SUCHOMIMUS_LEG_BONE);
        simpleItem(ModItems.SUCHOMIMUS_DNA);

        simpleItem(ModItems.KENTROSAURUS_SKULL);
        simpleItem(ModItems.KENTROSAURUS_VERTEBRAE);
        simpleItem(ModItems.KENTROSAURUS_PLATE);
        simpleItem(ModItems.KENTROSAURUS_RIBCAGE);
        simpleItem(ModItems.KENTROSAURUS_ARM_BONE);
        simpleItem(ModItems.KENTROSAURUS_LEG_BONE);
        simpleItem(ModItems.KENTROSAURUS_THAGOMIZER);
        simpleItem(ModItems.KENTROSAURUS_DNA);

        simpleItem(ModItems.PACHYCEPHALOSAURUS_SKULL);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_VERTEBRAE);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_RIBCAGE);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_ARM_BONE);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_LEG_BONE);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_MEAT);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_COOKED_MEAT);
        simpleItem(ModItems.PACHYCEPHALOSAURUS_DNA);

        simpleItem(ModItems.STYRACOSAURUS_SKULL);
        simpleItem(ModItems.STYRACOSAURUS_VERTEBRAE);
        simpleItem(ModItems.STYRACOSAURUS_RIBCAGE);
        simpleItem(ModItems.STYRACOSAURUS_ARM_BONE);
        simpleItem(ModItems.STYRACOSAURUS_LEG_BONE);
        simpleItem(ModItems.STYRACOSAURUS_DNA);

        simpleItem(ModItems.THESCELOSAURUS_SKULL);
        simpleItem(ModItems.THESCELOSAURUS_VERTEBRAE);
        simpleItem(ModItems.THESCELOSAURUS_RIBCAGE);
        simpleItem(ModItems.THESCELOSAURUS_ARM_BONE);
        simpleItem(ModItems.THESCELOSAURUS_LEG_BONE);
        simpleItem(ModItems.THESCELOSAURUS_DNA);

        simpleItem(ModItems.DSUNGARIPTERUS_SKULL);
        simpleItem(ModItems.DSUNGARIPTERUS_VERTEBRAE);
        simpleItem(ModItems.DSUNGARIPTERUS_RIBCAGE);
        simpleItem(ModItems.DSUNGARIPTERUS_WING_BONE);
        simpleItem(ModItems.DSUNGARIPTERUS_LEG_BONE);
        simpleItem(ModItems.DSUNGARIPTERUS_MEAT);
        simpleItem(ModItems.DSUNGARIPTERUS_COOKED_MEAT);
        simpleItem(ModItems.DSUNGARIPTERUS_DNA);

        simpleItem(ModItems.ICHTHYOSAURUS_SKULL);
        simpleItem(ModItems.ICHTHYOSAURUS_VERTEBRAE);
        simpleItem(ModItems.ICHTHYOSAURUS_RIBCAGE);
        simpleItem(ModItems.ICHTHYOSAURUS_FIN_BONE);
        simpleItem(ModItems.ICHTHYOSAURUS_MEAT);
        simpleItem(ModItems.ICHTHYOSAURUS_COOKED_MEAT);
        simpleItem(ModItems.ICHTHYOSAURUS_DNA);
        simpleItem(ModItems.ICHTHYOSAURUS_SAC);

        simpleItem(ModItems.LIMESTONE_ANIMAL_FOSSIL);
        simpleItem(ModItems.LIMESTONE_PLANT_FOSSIL);

        simpleItem(ModItems.CAMBRIAN_ANIMAL_TISSUE);
        simpleItem(ModItems.ORDOVICIAN_ANIMAL_TISSUE);
        simpleItem(ModItems.SILURIAN_ANIMAL_TISSUE);
        simpleItem(ModItems.DEVONIAN_ANIMAL_TISSUE);
        simpleItem(ModItems.CARBONIFEROUS_ANIMAL_TISSUE);
        simpleItem(ModItems.PERMIAN_ANIMAL_TISSUE);
        simpleItem(ModItems.TRIASSIC_ANIMAL_TISSUE);
        simpleItem(ModItems.JURASSIC_ANIMAL_TISSUE);
        simpleItem(ModItems.CRETACEOUS_ANIMAL_TISSUE);
        simpleItem(ModItems.PALEOGENE_ANIMAL_TISSUE);
        simpleItem(ModItems.NEOGENE_ANIMAL_TISSUE);
        simpleItem(ModItems.QUATERNARY_ANIMAL_TISSUE);

        simpleItem(ModItems.CAMBRIAN_PLANT_TISSUE);
        simpleItem(ModItems.ORDOVICIAN_PLANT_TISSUE);
        simpleItem(ModItems.SILURIAN_PLANT_TISSUE);
        simpleItem(ModItems.DEVONIAN_PLANT_TISSUE);
        simpleItem(ModItems.CARBONIFEROUS_PLANT_TISSUE);
        simpleItem(ModItems.PERMIAN_PLANT_TISSUE);
        simpleItem(ModItems.TRIASSIC_PLANT_TISSUE);
        simpleItem(ModItems.JURASSIC_PLANT_TISSUE);
        simpleItem(ModItems.CRETACEOUS_PLANT_TISSUE);
        simpleItem(ModItems.PALEOGENE_PLANT_TISSUE);
        simpleItem(ModItems.NEOGENE_PLANT_TISSUE);
        simpleItem(ModItems.QUATERNARY_PLANT_TISSUE);

        evenSimplerBlockItem(ModBlocks.LIMESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.COBBLED_LIMESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.COBBLED_LIMESTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_BRICKS_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_BRICKS_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_LIMESTONE_SLAB);

        getBuilder("extractor")
                .parent(new ModelFile.UncheckedModelFile("builtin/entity"));

        wallItem(ModBlocks.COBBLED_LIMESTONE_WALL, ModBlocks.COBBLED_LIMESTONE);
        wallItem(ModBlocks.LIMESTONE_BRICKS_WALL, ModBlocks.LIMESTONE_BRICKS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.tryParse("item/generated")).texture("layer0",
                ResourceLocation.tryBuild(Paleofauna.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Paleofauna.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(Paleofauna.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
}
