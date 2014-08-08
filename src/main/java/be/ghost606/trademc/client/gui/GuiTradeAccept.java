package be.ghost606.trademc.client.gui;

import be.ghost606.trademc.inventory.ContainerTradeAccept;
import be.ghost606.trademc.reference.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 8/08/2014.
 */
public class GuiTradeAccept extends GuiContainer {

    public GuiTradeAccept() {
        super(new ContainerTradeAccept());

        this.xSize = 255;
        this.ySize = 209;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1, 1, 1, 1);

        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.GUI_TRADE_ACCEPT);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
