package be.ghost606.trademc;

import be.ghost606.trademc.handler.GuiHandler;
import be.ghost606.trademc.handler.TradeCommandHandler;
import be.ghost606.trademc.reference.Reference;
import be.ghost606.trademc.proxy.IProxy;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Created by Kevin on 12/07/2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TradeMC {

    @Mod.Instance(Reference.MOD_ID)
    public static TradeMC instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.initClientConfiguration(event.getSuggestedConfigurationFile());
        proxy.registerKeyBindings();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete!");
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new TradeCommandHandler());
    }
}
