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
public class ContainerTrade extends Container {

    private final int PLAYER_INVENTORY_ROWS = 3;
    private final int PLAYER_INVENTORY_COLUMNS = 9;

    public ContainerTrade(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < PLAYER_INVENTORY_ROWS; i++) {
            for (int j = 0; j < PLAYER_INVENTORY_COLUMNS; j++) {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                        48 + j * 18, 106 + i * 18));
            }
        }

        for (int i = 0; i < PLAYER_INVENTORY_COLUMNS; i++) {
            addSlotToContainer(new Slot(inventoryPlayer, i, 48 + i * 18, 164));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return true;
    }
}