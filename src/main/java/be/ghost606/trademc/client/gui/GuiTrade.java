package be.ghost606.trademc.client.gui;

import be.ghost606.trademc.reference.Textures;
import be.ghost606.trademc.utility.LogHelper;
import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import org.lwjgl.opengl.GL11;

/**
 * Created by Kevin on 14/07/2014.
 */
public class GuiTrade extends GuiScreen {

    protected int xSize = 256;
    protected int ySize = 254;

    protected int guiLeft;
    protected int guiTop;

    private InventoryPlayer inventoryPlayer;

    private GuiSlider myTradeSlider;
    private GuiSlider otherPlayerSlider;

    public GuiTrade(InventoryPlayer inventoryPlayer) {
        super();
        this.inventoryPlayer = inventoryPlayer;

        //myTradeSlider = new GuiSlider();
        //otherPlayerSlider = new GuiSlider();

        LogHelper.info("Gui instance made!");
    }

    @Override
    public void initGui() {
        super.initGui();

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;

        LogHelper.info("Gui init!");
    }

    @Override
    public void drawScreen(int x, int y, float z) {
        super.drawScreen(x, y, z);

        GL11.glColor4f(1, 1, 1, 1);

        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.GUI_TRADE);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        LogHelper.info("Gui drawing!");
    }
}
