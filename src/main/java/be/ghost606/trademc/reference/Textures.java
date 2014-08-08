package be.ghost606.trademc.reference;

import be.ghost606.trademc.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kevin on 14/07/2014.
 */
public class Textures {

    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    public static final String GUI_SHEET_LOCATION = "textures/gui/";

    //GUI
    public static final ResourceLocation GUI_TRADE_PLAYER = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "guitradeplayer.png");
    public static final ResourceLocation GUI_TRADE_PROPOSAL = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "guitradeproposal.png");
    public static final ResourceLocation GUI_TRADE_ACCEPT = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "guitradeaccept.png");
}
