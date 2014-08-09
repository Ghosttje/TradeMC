package be.ghost606.trademc.network.message;

import be.ghost606.trademc.TradeMC;
import be.ghost606.trademc.reference.GuiId;
import be.ghost606.trademc.reference.Key;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Kevin on 15/07/2014.
 */
public class MessageKeyPressed implements IMessage, IMessageHandler<MessageKeyPressed, IMessage> {

    private byte keyPressed;

    public MessageKeyPressed() {

    }

    public MessageKeyPressed(Key key) {
        if (key == Key.TRADE) {
            this.keyPressed = (byte) key.TRADE.ordinal();

        } else {
            this.keyPressed = (byte) key.UNKNOWN.ordinal();
        }
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.keyPressed = buf.readByte();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeByte(keyPressed);
    }

    @Override
    public IMessage onMessage(MessageKeyPressed message, MessageContext ctx) {
        LogHelper.info("Keypressed!");
        EntityPlayer entityPlayer = ctx.getServerHandler().playerEntity;

        if (entityPlayer != null)
        {
            if (message.keyPressed == Key.TRADE.ordinal())
            {
                LogHelper.info("Starting GUI!");
                entityPlayer.openGui(TradeMC.instance, GuiId.TRADE_PLAYER.ordinal(), entityPlayer.worldObj, 0, 0, 0);
            }
        }

        return null;
    }
}
