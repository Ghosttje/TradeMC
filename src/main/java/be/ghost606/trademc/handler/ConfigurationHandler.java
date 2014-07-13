package be.ghost606.trademc.handler;

import be.ghost606.trademc.client.settings.KeyBindings;
import be.ghost606.trademc.reference.Names;
import be.ghost606.trademc.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.config.Configuration;
import org.lwjgl.input.Keyboard;

import java.io.File;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ConfigurationHandler {

    private static final String CATEGORY_KEYBIND = "Key bindings";
    public static Configuration configuration;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {

        configuration.addCustomCategoryComment(CATEGORY_KEYBIND, "Key bindings for TradeMC. See http://www.minecraftwiki.net/wiki/Key_codes for key codes.");

        KeyBindings.tradeKey = new KeyBinding("key.trade", configuration.get(CATEGORY_KEYBIND, Names.KeyBindings.TRADE, Keyboard.KEY_Y).getInt(Keyboard.KEY_Y), Names.KeyBindings.CATEGORY);
        //acceptKey = new KeyBinding("key.accept", Keyboard.KEY_RSHIFT + Keyboard.KEY_)

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
