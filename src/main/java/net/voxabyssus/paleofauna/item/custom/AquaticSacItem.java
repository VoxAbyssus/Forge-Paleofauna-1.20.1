package net.voxabyssus.paleofauna.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.function.Supplier;

public class AquaticSacItem extends Item {

    public AquaticSacItem(Properties pProperties, Supplier<? extends EntityType<? extends Animal>> entityType) {
        super(pProperties);
        this.entityType = entityType;
    }

    private final Supplier<? extends EntityType<? extends Animal>> entityType;

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        HitResult hitResult = player.pick(5.0D, 1.0F, true);

        if (hitResult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(stack);
        }

        BlockPos pos = ((BlockHitResult) hitResult).getBlockPos();

        if (!level.getFluidState(pos).is(FluidTags.WATER)) {
            return InteractionResultHolder.pass(stack);
        }

        if (!level.isClientSide()) {

            Animal animal = entityType.get().create(level);

            if (animal == null) {
                return InteractionResultHolder.fail(stack);
            }

            animal.setBaby(true);
            animal.moveTo(
                    pos.getX() + 0.5,
                    pos.getY() + 0.5,
                    pos.getZ() + 0.5,
                    player.getYRot(),
                    0
            );

            if (level.addFreshEntity(animal)) {

                if (player == null || !player.getAbilities().instabuild) {

                    stack.shrink(1);

                }
            }
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }
}