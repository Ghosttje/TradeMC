package be.ghost606.trademc.proxy;

import java.io.File;

/**
 * Created by Kevin on 12/07/2014.
 */
public interface IProxy {

    public abstract void initClientConfiguration(File configFile);

    public abstract void registerEventHandlers();

    public abstract void registerKeyBindings();
}
