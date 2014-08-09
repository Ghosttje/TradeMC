package be.ghost606.trademc.proxy;

import be.ghost606.trademc.handler.ConfigurationHandler;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;

/**
 * Created by Kevin on 12/07/2014.
 */
public abstract class CommonProxy implements IProxy {

    @Override
    public void registerEventHandlers() {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @Override
    public ArrayList<String> getUsernameList() {
        ArrayList<String> players = new ArrayList<String>();

        /*for (int i = 0; i < MinecraftServer.getServer().getConfigurationManager().playerEntityList.size(); ++i) {
            players.add(((EntityPlayerMP)MinecraftServer.getServer().getConfigurationManager().playerEntityList.get(i)).getCommandSenderName());
        }*/
        for (int i = 0; i < 10; i++)
        players.add("Test" + i);

        return players;
    }
}
