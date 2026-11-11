package net.voxabyssus.paleofauna.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voxabyssus.paleofauna.Paleofauna;
import net.voxabyssus.paleofauna.entity.ModEntities;
import net.voxabyssus.paleofauna.item.custom.AquaticSacItem;

public class    ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Paleofauna.MOD_ID);

    public static final RegistryObject<Item> DEINONYCHUS_SKULL = ITEMS.register("deinonychus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEINONYCHUS_VERTEBRAE = ITEMS.register("deinonychus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEINONYCHUS_RIBCAGE = ITEMS.register("deinonychus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEINONYCHUS_ARM_BONE = ITEMS.register("deinonychus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEINONYCHUS_LEG_BONE = ITEMS.register("deinonychus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEINONYCHUS_DNA = ITEMS.register("deinonychus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GUANLONG_SKULL = ITEMS.register("guanlong_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUANLONG_VERTEBRAE = ITEMS.register("guanlong_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUANLONG_RIBCAGE = ITEMS.register("guanlong_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUANLONG_ARM_BONE = ITEMS.register("guanlong_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUANLONG_LEG_BONE = ITEMS.register("guanlong_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUANLONG_DNA = ITEMS.register("guanlong_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HERRERASAURUS_SKULL = ITEMS.register("herrerasaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HERRERASAURUS_VERTEBRAE = ITEMS.register("herrerasaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HERRERASAURUS_RIBCAGE = ITEMS.register("herrerasaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HERRERASAURUS_ARM_BONE = ITEMS.register("herrerasaurus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HERRERASAURUS_LEG_BONE = ITEMS.register("herrerasaurus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HERRERASAURUS_DNA = ITEMS.register("herrerasaurus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUCHOMIMUS_SKULL = ITEMS.register("suchomimus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCHOMIMUS_VERTEBRAE = ITEMS.register("suchomimus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCHOMIMUS_RIBCAGE = ITEMS.register("suchomimus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCHOMIMUS_ARM_BONE = ITEMS.register("suchomimus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCHOMIMUS_LEG_BONE = ITEMS.register("suchomimus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUCHOMIMUS_DNA = ITEMS.register("suchomimus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KENTROSAURUS_SKULL = ITEMS.register("kentrosaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_VERTEBRAE = ITEMS.register("kentrosaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_PLATE = ITEMS.register("kentrosaurus_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_RIBCAGE = ITEMS.register("kentrosaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_ARM_BONE = ITEMS.register("kentrosaurus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_LEG_BONE = ITEMS.register("kentrosaurus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_THAGOMIZER = ITEMS.register("kentrosaurus_thagomizer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENTROSAURUS_DNA = ITEMS.register("kentrosaurus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_DNA = ITEMS.register("pachycephalosaurus_dna",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_MEAT = ITEMS.register("pachycephalosaurus_meat",
            () -> new Item(new Item.Properties().food(ModFoods.PACHYCEPHALOSAURUS_MEAT)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_COOKED_MEAT = ITEMS.register("pachycephalosaurus_cooked_meat",
            () -> new Item(new Item.Properties().food(ModFoods.PACHYCEPHALOSAURUS_COOKED_MEAT)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_SKULL = ITEMS.register("pachycephalosaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_VERTEBRAE = ITEMS.register("pachycephalosaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_RIBCAGE = ITEMS.register("pachycephalosaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_ARM_BONE = ITEMS.register("pachycephalosaurus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_LEG_BONE = ITEMS.register("pachycephalosaurus_leg_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STYRACOSAURUS_SKULL = ITEMS.register("styracosaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYRACOSAURUS_VERTEBRAE = ITEMS.register("styracosaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYRACOSAURUS_RIBCAGE = ITEMS.register("styracosaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYRACOSAURUS_ARM_BONE = ITEMS.register("styracosaurus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYRACOSAURUS_LEG_BONE = ITEMS.register("styracosaurus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STYRACOSAURUS_DNA = ITEMS.register("styracosaurus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THESCELOSAURUS_SKULL = ITEMS.register("thescelosaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THESCELOSAURUS_VERTEBRAE = ITEMS.register("thescelosaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THESCELOSAURUS_RIBCAGE = ITEMS.register("thescelosaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THESCELOSAURUS_ARM_BONE = ITEMS.register("thescelosaurus_arm_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THESCELOSAURUS_LEG_BONE = ITEMS.register("thescelosaurus_leg_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THESCELOSAURUS_DNA = ITEMS.register("thescelosaurus_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DSUNGARIPTERUS_DNA = ITEMS.register("dsungaripterus_dna",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DSUNGARIPTERUS_MEAT = ITEMS.register("dsungaripterus_meat",
            () -> new Item(new Item.Properties().food(ModFoods.DSUNGARIPTERUS_MEAT)));
    public static final RegistryObject<Item> DSUNGARIPTERUS_COOKED_MEAT = ITEMS.register("dsungaripterus_cooked_meat",
            () -> new Item(new Item.Properties().food(ModFoods.DSUNGARIPTERUS_COOKED_MEAT)));
    public static final RegistryObject<Item> DSUNGARIPTERUS_SKULL = ITEMS.register("dsungaripterus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DSUNGARIPTERUS_VERTEBRAE = ITEMS.register("dsungaripterus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DSUNGARIPTERUS_RIBCAGE = ITEMS.register("dsungaripterus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DSUNGARIPTERUS_WING_BONE = ITEMS.register("dsungaripterus_wing_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DSUNGARIPTERUS_LEG_BONE = ITEMS.register("dsungaripterus_leg_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ICHTHYOSAURUS_SAC = ITEMS.register("ichthyosaurus_sac",
           () -> new AquaticSacItem(new Item.Properties(),
                   () -> ModEntities.ICHTHYOSAURUS_COMMUNIS.get()));
    public static final RegistryObject<Item> ICHTHYOSAURUS_DNA = ITEMS.register("ichthyosaurus_dna",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICHTHYOSAURUS_MEAT = ITEMS.register("ichthyosaurus_meat",
            () -> new Item(new Item.Properties().food(ModFoods.ICHTHYOSAURUS_MEAT)));
    public static final RegistryObject<Item> ICHTHYOSAURUS_COOKED_MEAT = ITEMS.register("ichthyosaurus_cooked_meat",
            () -> new Item(new Item.Properties().food(ModFoods.ICHTHYOSAURUS_COOKED_MEAT)));
    public static final RegistryObject<Item> ICHTHYOSAURUS_SKULL = ITEMS.register("ichthyosaurus_skull",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICHTHYOSAURUS_VERTEBRAE = ITEMS.register("ichthyosaurus_vertebrae",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICHTHYOSAURUS_RIBCAGE = ITEMS.register("ichthyosaurus_ribcage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICHTHYOSAURUS_FIN_BONE = ITEMS.register("ichthyosaurus_fin_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LIMESTONE_ANIMAL_FOSSIL = ITEMS.register("limestone_animal_fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIMESTONE_PLANT_FOSSIL = ITEMS.register("limestone_plant_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CAMBRIAN_TISSUE = ITEMS.register("cambrian_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORDOVICIAN_TISSUE = ITEMS.register("ordovician_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILURIAN_TISSUE = ITEMS.register("silurian_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEVONIAN_TISSUE = ITEMS.register("devonian_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARBONIFEROUS_TISSUE = ITEMS.register("carboniferous_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERMIAN_TISSUE = ITEMS.register("permian_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRIASSIC_TISSUE = ITEMS.register("triassic_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JURASSIC_TISSUE = ITEMS.register("jurassic_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRETACEOUS_TISSUE = ITEMS.register("cretaceous_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALEOGENE_TISSUE = ITEMS.register("paleogene_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEOGENE_TISSUE = ITEMS.register("neogene_tissue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUATERNARY_TISSUE = ITEMS.register("quaternary_tissue",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
