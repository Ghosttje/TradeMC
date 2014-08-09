package be.ghost606.trademc.proxy;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Kevin on 12/07/2014.
 */
public interface IProxy {

    public abstract void initConfiguration(File configFile);

    public abstract void registerEventHandlers();

    public abstract void registerKeyBindings();

    public abstract ArrayList<String> getUsernameList();
}
