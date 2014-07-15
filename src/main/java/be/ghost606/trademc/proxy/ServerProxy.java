package be.ghost606.trademc.proxy;

import java.io.File;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ServerProxy extends CommonProxy {

    @Override
    public void initClientConfiguration(File configFile) {

    }

    @Override
    public void registerKeyBindings() {
        //No keybinds on server side
    }
}
