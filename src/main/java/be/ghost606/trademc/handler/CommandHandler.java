package be.ghost606.trademc.handler;

import be.ghost606.trademc.TradeMC;
import be.ghost606.trademc.reference.GuiId;
import be.ghost606.trademc.reference.Reference;
import be.ghost606.trademc.utility.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Kevin on 12/07/2014.
 */
public class CommandHandler extends CommandBase {
    @Override
    public String getCommandName() {
        return Reference.Commands.TRADE_COMMAND;
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return Reference.Commands.TRADE_COMMENT;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args) {
        if(commandSender instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)commandSender;

            LogHelper.info("Trade command fired!");

            for (int i = 0; i < args.length; i++) {
                LogHelper.info(args[i]);
            }

            entityPlayer.openGui(TradeMC.instance, GuiId.TRADE_PLAYER.ordinal(), entityPlayer.worldObj, 0, 0, 0);
        }
    }
}
