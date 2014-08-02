package be.ghost606.trademc.inventory;

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
    public ItemStack getStackInSlot(int index) {
        return index >= this.getSizeInventory() ? null : this.stackList[index];
    }

    @Override
    public ItemStack decrStackSize(int indexSource, int indexTarget) {
        if (this.stackList[indexSource] != null)
        {
            ItemStack itemstack;

            if (this.stackList[indexSource].stackSize <= indexTarget)
            {
                itemstack = this.stackList[indexSource];
                this.stackList[indexSource] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.stackList[indexSource].splitStack(indexTarget);

                if (this.stackList[indexSource].stackSize == 0)
                {
                    this.stackList[indexSource] = null;
                }
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        if (this.stackList[index] != null)
        {
            ItemStack itemstack = this.stackList[index];
            this.stackList[index] = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack itemStack) {
        this.stackList[index] = itemStack;
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
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return true;
    }
}
