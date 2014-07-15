package be.ghost606.trademc.client.gui.configuration;

import be.ghost606.trademc.client.configuration.ClientConfiguration;
import be.ghost606.trademc.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Kevin on 12/07/2014.
 */
public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen, new ConfigElement(ClientConfiguration.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ClientConfiguration.configuration.toString()));
    }
}
