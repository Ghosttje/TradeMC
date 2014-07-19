package be.ghost606.trademc.proxy;

import be.ghost606.trademc.handler.ConfigurationHandler;
import cpw.mods.fml.common.FMLCommonHandler;

/**
 * Created by Kevin on 12/07/2014.
 */
public abstract class CommonProxy implements IProxy {

    public void registerEventHandlers() {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }
}
