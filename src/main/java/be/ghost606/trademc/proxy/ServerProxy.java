package be.ghost606.trademc.proxy;

import be.ghost606.trademc.handler.ConfigurationHandler;

import java.io.File;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ServerProxy extends CommonProxy {

    @Override
    public void initConfiguration(File configFile) {
        ConfigurationHandler.init(configFile, false);
    }

    @Override
    public void registerKeyBindings() {
        //No keybinds on server side
    }
}
