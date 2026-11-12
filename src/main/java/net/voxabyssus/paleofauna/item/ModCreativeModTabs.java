package net.voxabyssus.paleofauna.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Paleofauna.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PALEOFAUNA_TAB = CREATIVE_MODE_TABS.register("paleofauna_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GUANLONG_SKULL.get()))
                    .title(Component.translatable("creativetab.paleofauna_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.EXTRACTOR.get());

                        pOutput.accept(ModBlocks.STONE_FOSSIL.get());
                        pOutput.accept(ModBlocks.SANDSTONE_FOSSIL.get());
                        pOutput.accept(ModBlocks.RED_SANDSTONE_FOSSIL.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FOSSIL.get());
                        pOutput.accept(ModBlocks.TUFF_FOSSIL.get());
                        pOutput.accept(ModBlocks.CALCITE_FOSSIL.get());
                        pOutput.accept(ModBlocks.LIMESTONE_FOSSIL.get());

                        pOutput.accept(ModItems.LIMESTONE_ANIMAL_FOSSIL.get());
                        pOutput.accept(ModItems.LIMESTONE_PLANT_FOSSIL.get());

                        pOutput.accept(ModItems.CAMBRIAN_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.ORDOVICIAN_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.SILURIAN_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.DEVONIAN_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.CARBONIFEROUS_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.PERMIAN_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.TRIASSIC_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.JURASSIC_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.CRETACEOUS_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.PALEOGENE_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.NEOGENE_ANIMAL_TISSUE.get());
                        pOutput.accept(ModItems.QUATERNARY_ANIMAL_TISSUE.get());

                        pOutput.accept(ModItems.CAMBRIAN_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.ORDOVICIAN_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.SILURIAN_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.DEVONIAN_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.CARBONIFEROUS_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.PERMIAN_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.TRIASSIC_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.JURASSIC_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.CRETACEOUS_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.PALEOGENE_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.NEOGENE_PLANT_TISSUE.get());
                        pOutput.accept(ModItems.QUATERNARY_PLANT_TISSUE.get());

                        pOutput.accept(ModItems.DEINONYCHUS_SKULL.get());
                        pOutput.accept(ModItems.DEINONYCHUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.DEINONYCHUS_RIBCAGE.get());
                        pOutput.accept(ModItems.DEINONYCHUS_ARM_BONE.get());
                        pOutput.accept(ModItems.DEINONYCHUS_LEG_BONE.get());

                        pOutput.accept(ModItems.GUANLONG_SKULL.get());
                        pOutput.accept(ModItems.GUANLONG_VERTEBRAE.get());
                        pOutput.accept(ModItems.GUANLONG_RIBCAGE.get());
                        pOutput.accept(ModItems.GUANLONG_ARM_BONE.get());
                        pOutput.accept(ModItems.GUANLONG_LEG_BONE.get());

                        pOutput.accept(ModItems.HERRERASAURUS_SKULL.get());
                        pOutput.accept(ModItems.HERRERASAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.HERRERASAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.HERRERASAURUS_ARM_BONE.get());
                        pOutput.accept(ModItems.HERRERASAURUS_LEG_BONE.get());

                        pOutput.accept(ModItems.SUCHOMIMUS_SKULL.get());
                        pOutput.accept(ModItems.SUCHOMIMUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.SUCHOMIMUS_RIBCAGE.get());
                        pOutput.accept(ModItems.SUCHOMIMUS_ARM_BONE.get());
                        pOutput.accept(ModItems.SUCHOMIMUS_LEG_BONE.get());

                        pOutput.accept(ModItems.KENTROSAURUS_SKULL.get());
                        pOutput.accept(ModItems.KENTROSAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.KENTROSAURUS_PLATE.get());
                        pOutput.accept(ModItems.KENTROSAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.KENTROSAURUS_ARM_BONE.get());
                        pOutput.accept(ModItems.KENTROSAURUS_LEG_BONE.get());
                        pOutput.accept(ModItems.KENTROSAURUS_THAGOMIZER.get());

                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_MEAT.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_COOKED_MEAT.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_ARM_BONE.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_LEG_BONE.get());

                        pOutput.accept(ModItems.STYRACOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.STYRACOSAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.STYRACOSAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.STYRACOSAURUS_ARM_BONE.get());
                        pOutput.accept(ModItems.STYRACOSAURUS_LEG_BONE.get());

                        pOutput.accept(ModItems.THESCELOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.THESCELOSAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.THESCELOSAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.THESCELOSAURUS_ARM_BONE.get());
                        pOutput.accept(ModItems.THESCELOSAURUS_LEG_BONE.get());

                        pOutput.accept(ModItems.DSUNGARIPTERUS_MEAT.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_COOKED_MEAT.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_SKULL.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_RIBCAGE.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_WING_BONE.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_LEG_BONE.get());

                        pOutput.accept(ModItems.ICHTHYOSAURUS_MEAT.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_COOKED_MEAT.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_VERTEBRAE.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_RIBCAGE.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_FIN_BONE.get());

                        pOutput.accept(ModItems.DEINONYCHUS_DNA.get());
                        pOutput.accept(ModItems.GUANLONG_DNA.get());
                        pOutput.accept(ModItems.HERRERASAURUS_DNA.get());
                        pOutput.accept(ModItems.SUCHOMIMUS_DNA.get());
                        pOutput.accept(ModItems.KENTROSAURUS_DNA.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_DNA.get());
                        pOutput.accept(ModItems.STYRACOSAURUS_DNA.get());
                        pOutput.accept(ModItems.THESCELOSAURUS_DNA.get());
                        pOutput.accept(ModItems.DSUNGARIPTERUS_DNA.get());
                        pOutput.accept(ModItems.ICHTHYOSAURUS_DNA.get());

                        pOutput.accept(ModItems.ICHTHYOSAURUS_SAC.get());

                        pOutput.accept(ModBlocks.LIMESTONE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.COBBLED_LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_LIMESTONE_SLAB.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
