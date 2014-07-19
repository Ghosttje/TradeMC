package be.ghost606.trademc.proxy;

import be.ghost606.trademc.handler.ConfigurationHandler;
import be.ghost606.trademc.client.handler.KeyInputEventHandler;
import be.ghost606.trademc.client.settings.KeyBindings;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

import java.io.File;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ClientProxy extends CommonProxy {

    public void registerEventHandlers() {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        LogHelper.info("Registered events!");
    }

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.tradeKey);
    }

    @Override
    public void initConfiguration(File configFile)
    {
        ConfigurationHandler.init(configFile, true);
    }
}
