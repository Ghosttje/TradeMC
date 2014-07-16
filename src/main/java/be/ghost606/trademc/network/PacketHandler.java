package be.ghost606.trademc.network;

import be.ghost606.trademc.network.message.MessageKeyPressed;
import be.ghost606.trademc.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created by Kevin on 15/07/2014.
 */
public class PacketHandler {

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());

    public static void init() {
        INSTANCE.registerMessage(MessageKeyPressed.class, MessageKeyPressed.class, 0, Side.SERVER);
    }
}
