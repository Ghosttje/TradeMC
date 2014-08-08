package be.ghost606.trademc.client.gui;

import be.ghost606.trademc.inventory.ContainerTradeAccept;
import be.ghost606.trademc.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 8/08/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiTradeAccept extends GuiContainer {

    public GuiTradeAccept() {
        super(new ContainerTradeAccept());

        this.xSize = 255;
        this.ySize = 209;
    }

    @Override
    public void initGui() {
        super.initGui();

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1, 1, 1, 1);

        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.GUI_TRADE_ACCEPT);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
