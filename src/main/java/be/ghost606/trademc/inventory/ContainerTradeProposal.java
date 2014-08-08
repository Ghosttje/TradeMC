package be.ghost606.trademc.inventory;

import be.ghost606.trademc.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by Kevin on 16/07/2014.
 */
public class ContainerTradeProposal extends Container {

    private InventoryTrade inventoryTrade;

    private static final int TRADE_INVENTORY_ROWS = 3;
    private static final int TRADE_INVENTORY_COLUMNS = 9;
    private static final int PLAYER_INVENTORY_ROWS = 3;
    private static final int PLAYER_INVENTORY_COLUMNS = 9;

    public ContainerTradeProposal(EntityPlayer entityPlayer, InventoryTrade inventoryTrade) {
        this.inventoryTrade = inventoryTrade;

        //Inventory Trade
        for (int i = 0; i < TRADE_INVENTORY_ROWS; i++) {
            for (int j = 0; j < TRADE_INVENTORY_COLUMNS; j++) {
                addSlotToContainer(new Slot(inventoryTrade, j + i * 9, 88 + j * 18, 18 + i * 18));
            }
        }

        //Inventory
        for (int i = 0; i < PLAYER_INVENTORY_ROWS; ++i) {
            for (int j = 0; j < PLAYER_INVENTORY_COLUMNS; ++j) {
                this.addSlotToContainer(new Slot(entityPlayer.inventory, j + i * 9 + 9, 88 + j * 18, 128 + i * 18));
            }
        }
        for (int i = 0; i < PLAYER_INVENTORY_COLUMNS; ++i) {
            this.addSlotToContainer(new Slot(entityPlayer.inventory, i, 88 + i * 18, 186));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotIndex) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotIndex < TRADE_INVENTORY_ROWS * 9)
            {
                if (!this.mergeItemStack(itemstack1, TRADE_INVENTORY_ROWS * 9, this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, TRADE_INVENTORY_ROWS * 9, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public void onContainerClosed(EntityPlayer entityPlayer) {
        super.onContainerClosed(entityPlayer);

        for (int i = 0; i < inventoryTrade.getSizeInventory(); ++i) {
            Slot slot = (Slot) this.inventorySlots.get(i);

            if (slot != null && slot.getHasStack()) {
                ItemStack itemstack = slot.getStack();

                if (!entityPlayer.inventory.addItemStackToInventory(itemstack)) {
                    entityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
}
