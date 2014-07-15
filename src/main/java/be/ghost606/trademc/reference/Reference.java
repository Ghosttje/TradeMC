package be.ghost606.trademc.reference;

/**
 * Created by Kevin on 12/07/2014.
 */
public class Reference {

    public static final String MOD_ID = "TradeMC";
    public static final String MOD_NAME = "TradeMC";
    public static final String VERSION = "1.7.2-1.0";
    public static final String CLIENT_PROXY_CLASS = "be.ghost606.trademc.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "be.ghost606.trademc.proxy.ServerProxy";
    public static final String GUI_FACTORY_CLASS = "be.ghost606.trademc.client.gui.configuration.GuiFactory";

    public static final class Configuration {
        public static final String CATEGORY_KEYBINDING_NAME = "Keybinds";
        public static final String CATEGORY_KEYBINDING_COMMENT = "Key bindings for TradeMC. See http://www.minecraftwiki.net/wiki/Key_codes for key codes.";
    }

    public static final class KeyBinding {
        public static final String CATEGORY = "key.categories.trademc";
        public static final String TRADE = "key.trade";
    }

    public static final class Commands {
        public static final String TRADE_COMMAND = "trade";
        public static final String TRADE_COMMENT = "Start a trading with another player. Usage: /trade <playername>.";
    }

    public static final class GuiId {
        public static final int TRADE = 0;
    }

}
