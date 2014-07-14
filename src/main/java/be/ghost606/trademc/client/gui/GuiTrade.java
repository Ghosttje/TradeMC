package be.ghost606.trademc.client.gui;

import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by Kevin on 14/07/2014.
 */
public class GuiTrade extends GuiScreen {

    protected int xSize = 256;
    protected int ySize = 254;

    protected int guiLeft;
    protected int guiTop;

    private GuiSlider myTradeSlider;
    private GuiSlider otherPlayerSlider;

    public GuiTrade(InventoryPlayer inventoryPlayer) {
        super();
        //myTradeSlider = new GuiSlider();
        //otherPlayerSlider = new GuiSlider();
    }

    @Override
    public void initGui() {
        super.initGui();

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
    }

    @Override
    public void drawScreen(int x, int y, float z) {
        super.drawScreen(x, y, z);


    }
}
