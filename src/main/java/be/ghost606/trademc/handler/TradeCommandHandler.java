package be.ghost606.trademc.handler;

import be.ghost606.trademc.reference.CommandReference;
import be.ghost606.trademc.utility.LogHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Kevin on 12/07/2014.
 */
public class TradeCommandHandler extends CommandBase {
    @Override
    public String getCommandName() {
        return CommandReference.TRADE_COMMAND;
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "Start a trading with another player. Usage: /trade <playername>.";
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args) {
        if(commandSender instanceof EntityPlayer) {
            LogHelper.info("Trade command fired!");

            for (int i = 0; i < args.length; i++) {
                LogHelper.info(args[i]);
            }
        }
    }
}
