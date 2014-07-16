package be.ghost606.trademc.client.handler;

import be.ghost606.trademc.client.settings.KeyBindings;
import be.ghost606.trademc.network.PacketHandler;
import be.ghost606.trademc.network.message.MessageKeyPressed;
import be.ghost606.trademc.reference.Key;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Kevin on 13/07/2014.
 */
@SideOnly(Side.CLIENT)
public class KeyInputEventHandler {

    private static Key getPressedKeyBinding() {
        if (KeyBindings.tradeKey.isPressed()) {
            return Key.TRADE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        if (FMLClientHandler.instance().getClient().inGameHasFocus) {
            if (FMLClientHandler.instance().getClientPlayerEntity() != null) {
                EntityPlayer entityPlayer = FMLClientHandler.instance().getClientPlayerEntity();
                if (entityPlayer.worldObj.isRemote) {
                    PacketHandler.INSTANCE.sendToServer(new MessageKeyPressed(getPressedKeyBinding()));
                }
            }
        }
    }
}
