package net.voxabyssus.paleofauna.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.level.Level;

public class IchthyosaurusCommunisEntity extends Dolphin { //TODO: Switch to Water Animal for finer control later

    private static final EntityDataAccessor<Boolean> IS_MALE =
            SynchedEntityData.defineId(IchthyosaurusCommunisEntity.class, EntityDataSerializers.BOOLEAN);

    public IchthyosaurusCommunisEntity(EntityType<? extends Dolphin> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);

        if (!pLevel.isClientSide()) {
            this.setMale(this.random.nextBoolean());
        }
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(IS_MALE, true);
    }

    public boolean isMale() {
        return this.entityData.get(IS_MALE);
    }

    public void setMale(boolean male) {
        this.entityData.set(IS_MALE, male);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10D)
                .add(Attributes.FOLLOW_RANGE, 16D)
                .add(Attributes.MOVEMENT_SPEED, 0D);
    }

/*    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }*/

    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putBoolean("IsMale", this.isMale());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);

        if (pCompound.contains("IsMale")) {
            this.setMale(pCompound.getBoolean("IsMale"));
        }
    }
}
