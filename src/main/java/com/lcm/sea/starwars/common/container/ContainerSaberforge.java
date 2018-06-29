package com.lcm.sea.starwars.common.container;

import com.lcm.sea.starwars.common.items.ItemKyberCrystal;
import com.lcm.sea.starwars.common.items.ItemSaberPart;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import com.lcm.sea.starwars.common.utils.EnumSaberParts;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerSaberforge extends Container {

    private final TileEntitySaberforge tileEntitySaberforge;

    public ContainerSaberforge(EntityPlayer player, TileEntitySaberforge tileEntitySaberforge) {

        this.tileEntitySaberforge = tileEntitySaberforge;


        this.addSlotToContainer(new SlotSaberforge(tileEntitySaberforge, 0, 50, 20, EnumSaberParts.EMITTER));
        this.addSlotToContainer(new Slot(tileEntitySaberforge, 1, 50, 40) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                if(stack.getItem() instanceof ItemKyberCrystal) {
                    return true;
                }
                return false;
            }
        });
        this.addSlotToContainer(new SlotSaberforge(tileEntitySaberforge, 2, 50, 60, EnumSaberParts.HANDLE));
        this.addSlotToContainer(new SlotSaberforge(tileEntitySaberforge, 3, 50, 80, EnumSaberParts.POMMEL));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; k++) {
            addSlotToContainer(new Slot(player.inventory, k, 8 + k * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            int containerSlots = inventorySlots.size() - player.inventory.mainInventory.size();

            if (index < containerSlots) {
                if (!this.mergeItemStack(itemstack1, containerSlots, inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, containerSlots, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.getCount() == 0) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, itemstack1);
        }

        return itemstack;
    }

    public static class SlotSaberforge extends Slot {

        public final EnumSaberParts part;

        public SlotSaberforge(IInventory inventoryIn, int index, int xPosition, int yPosition, EnumSaberParts part) {
            super(inventoryIn, index, xPosition, yPosition);
            this.part = part;
        }

        @Override
        public boolean isItemValid(ItemStack stack) {
            if(((ItemSaberPart) stack.getItem()).getType() == part) {
                return true;
            }
            return false;
        }
    }
}
