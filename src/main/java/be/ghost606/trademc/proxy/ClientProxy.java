package be.ghost606.trademc.proxy;

import be.ghost606.trademc.client.handler.KeyInputEventHandler;
import be.ghost606.trademc.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ClientProxy extends CommonProxy {

    public void registerEventHandlers() {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.tradeKey);
    }
}
