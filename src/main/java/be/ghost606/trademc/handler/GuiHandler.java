package be.ghost606.trademc.handler;

import be.ghost606.trademc.client.gui.GuiTradeAccept;
import be.ghost606.trademc.client.gui.GuiTradePlayer;
import be.ghost606.trademc.client.gui.GuiTradeProposal;
import be.ghost606.trademc.inventory.ContainerTradeAccept;
import be.ghost606.trademc.inventory.ContainerTradePlayer;
import be.ghost606.trademc.inventory.ContainerTradeProposal;
import be.ghost606.trademc.inventory.InventoryTrade;
import be.ghost606.trademc.reference.GuiId;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Kevin on 15/07/2014.
 */
public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == GuiId.TRADE_PLAYER.ordinal()) {
            LogHelper.info("Server run");
            return new ContainerTradePlayer();
        } else if(id == GuiId.TRADE_PROPOSAL.ordinal()) {
            return new ContainerTradeProposal(player, new InventoryTrade());
        } else if(id == GuiId.TRADE_ACCEPT.ordinal()) {
            return new ContainerTradeAccept();
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == GuiId.TRADE_PLAYER.ordinal()) {
            LogHelper.info("Client run");
            return new GuiTradePlayer();
        } else if(id == GuiId.TRADE_PROPOSAL.ordinal()) {
            return new GuiTradeProposal(player, new InventoryTrade());
        } else if(id == GuiId.TRADE_ACCEPT.ordinal()) {
            return new GuiTradeAccept();
        }

        return null;
    }
}
