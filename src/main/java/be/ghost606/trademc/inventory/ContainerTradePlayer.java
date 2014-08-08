package be.ghost606.trademc.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by Kevin on 8/08/2014.
 */
public class ContainerTradePlayer extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return false;
    }
}
