package be.ghost606.trademc.inventory;

import be.ghost606.trademc.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

/**
 * Created by Kevin on 2/08/2014.
 */
public class InventoryTrade implements IInventory {

    private ItemStack[] stackList;

    private static final int STACK_SIZE = 27;

    public InventoryTrade() {
        this.stackList = new ItemStack[STACK_SIZE];
    }

    @Override
    public int getSizeInventory() {
        return this.stackList.length;
    }

    @Override
    public ItemStack getStackInSlot(int slotIndex) {
        return stackList[slotIndex];
    }

    @Override
    public ItemStack decrStackSize(int slotIndex, int decrementAmount) {
        if (this.stackList[slotIndex] != null) {
            ItemStack itemstack;

            if (this.stackList[slotIndex].stackSize <= decrementAmount) {
                itemstack = this.stackList[slotIndex];
                this.stackList[slotIndex] = null;
                return itemstack;
            } else {
                itemstack = this.stackList[slotIndex].splitStack(decrementAmount);

                if (this.stackList[slotIndex].stackSize == 0) {
                    this.stackList[slotIndex] = null;
                }
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex) {
        if (this.stackList[slotIndex] != null)
        {
            ItemStack itemstack = this.stackList[slotIndex];
            this.stackList[slotIndex] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int slotIndex, ItemStack itemStack) {
        this.stackList[slotIndex] = itemStack;
    }

    @Override
    public String getInventoryName() {
        return "Trade Inventory";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int slotIndex, ItemStack itemStack) {
        return true;
    }
}
