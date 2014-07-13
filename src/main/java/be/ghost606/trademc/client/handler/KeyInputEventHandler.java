package be.ghost606.trademc.client.handler;

import be.ghost606.trademc.client.settings.KeyBindings;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by Kevin on 13/07/2014.
 */
public class KeyInputEventHandler {

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        if (FMLClientHandler.instance().getClient().inGameHasFocus) {
            if (KeyBindings.tradeKey.isPressed()) {
                LogHelper.info("Trade command fired!");
            }
        }
    }
}
