package net.voxabyssus.paleofauna.screen;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;
import net.voxabyssus.paleofauna.block.ModBlocks;
import net.voxabyssus.paleofauna.block.entity.ExtractorBlockEntity;

public class ExtractorMenu extends AbstractContainerMenu {
    public final ExtractorBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public ExtractorMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public ExtractorMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(ModMenuTypes.EXTRACTOR_MENU.get(), pContainerId);
        blockEntity = ((ExtractorBlockEntity) entity);
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(iItemHandler -> {
            this.addSlot(new SlotItemHandler(iItemHandler, 0, 8, 31));
            this.addSlot(new SlotItemHandler(iItemHandler, 1, 116, 13) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 2, 134, 13) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 3, 152, 13) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 4, 116, 31) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 5, 134, 31) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 6, 152, 31){
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 7, 116, 49) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 8, 134, 49) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
            this.addSlot(new SlotItemHandler(iItemHandler, 9, 152, 49) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return false;
                }
            });
        });

        addDataSlots(data);

    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressArrowSize = 68;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_SLOT_INDEX =VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack emptyStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot == null || !slot.hasItem()) {
            return emptyStack;
        }

        ItemStack sourceStack = slot.getItem();
        ItemStack copyStack = sourceStack.copy();

        if (index >= VANILLA_SLOT_COUNT) {
            if (!this.moveItemStackTo(sourceStack, 0, VANILLA_SLOT_COUNT, true)) {
                return emptyStack;
            }
        }

        else {
            if (!this.moveItemStackTo(sourceStack,
                    TE_INVENTORY_SLOT_INDEX,
                    TE_INVENTORY_SLOT_INDEX + 1,
                    false)) {
                return emptyStack;
            }
        }

        if (sourceStack.isEmpty()) {
            slot.set(ItemStack.EMPTY);
        } else {
            slot.setChanged();
        }

        slot.onTake(player, sourceStack);
        return copyStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, ModBlocks.EXTRACTOR.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i ) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
