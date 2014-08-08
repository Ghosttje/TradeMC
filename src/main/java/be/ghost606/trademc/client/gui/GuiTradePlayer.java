package be.ghost606.trademc.client.gui;

import be.ghost606.trademc.inventory.ContainerTradePlayer;
import be.ghost606.trademc.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import org.lwjgl.opengl.GL11;

import java.util.List;

/**
 * Created by Kevin on 8/08/2014.
 */
@SideOnly(Side.CLIENT)
public class GuiTradePlayer extends GuiContainer {

    private List<GuiButton> buttons;
    private List<EntityPlayerMP> players;

    public GuiTradePlayer(List<EntityPlayerMP> players) {
        super(new ContainerTradePlayer());

        this.xSize = 160;
        this.ySize = 227;
    }

    @Override
    public void initGui() {
        super.initGui();

        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;

        for (int i = 0; i < players.size(); i++) {

        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1, 1, 1, 1);

        Minecraft.getMinecraft().renderEngine.bindTexture(Textures.GUI_TRADE_PLAYER);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
