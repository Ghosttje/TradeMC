package be.ghost606.trademc.handler;

import be.ghost606.trademc.TradeMC;
import be.ghost606.trademc.client.gui.GuiTrade;
import be.ghost606.trademc.reference.Names;
import be.ghost606.trademc.reference.Reference;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Kevin on 12/07/2014.
 */
public class TradeCommandHandler extends CommandBase {
    @Override
    public String getCommandName() {
        return Names.Commands.TRADE_COMMAND;
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return Names.Commands.TRADE_COMMENT;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args) {
        if(commandSender instanceof EntityPlayer) {
            LogHelper.info("Trade command fired!");

            for (int i = 0; i < args.length; i++) {
                LogHelper.info(args[i]);
            }

            FMLNetworkHandler.openGui((EntityPlayer)commandSender, TradeMC.instance, Names.GuiId.TRADE, commandSender.getEntityWorld(), 0, 0, 0);
        }
    }
}
