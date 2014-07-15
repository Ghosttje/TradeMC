package be.ghost606.trademc.handler;

import be.ghost606.trademc.client.gui.GuiTrade;
import be.ghost606.trademc.reference.Reference;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Kevin on 15/07/2014.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == Reference.GuiId.TRADE) {
            return new GuiTrade(player.inventory);
        }

        return null;
    }
}
