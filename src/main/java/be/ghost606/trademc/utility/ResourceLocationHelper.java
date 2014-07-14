package be.ghost606.trademc.utility;

import be.ghost606.trademc.reference.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Kevin on 14/07/2014.
 */
public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }
}
