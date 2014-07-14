package be.ghost606.trademc.client.gui;

import cpw.mods.fml.client.config.GuiSlider;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

/**
 * Created by Kevin on 14/07/2014.
 */
public class GuiTradeMCContainer extends GuiContainer {

    public GuiTradeMCContainer(Container container) {
        super(container);
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {

    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    public int getXSize()
    {
        return xSize;
    }

    public int getYSize()
    {
        return xSize;
    }

    public int getOffsetLeft()
    {
        return guiLeft;
    }

    public int getOffsetTop()
    {
        return guiTop;
    }
}
