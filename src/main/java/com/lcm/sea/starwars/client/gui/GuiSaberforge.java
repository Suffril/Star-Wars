package com.lcm.sea.starwars.client.gui;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.common.container.ContainerSaberforge;
import com.lcm.sea.starwars.common.items.ItemLightsaberBase;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GuiSaberforge extends GuiContainer {

    private InventoryPlayer playerInventory;
    private TileEntitySaberforge saberforge;
    private static final ResourceLocation tex = new ResourceLocation(StarWars.MODID, "textures/gui/saberforge.png");

    public GuiSaberforge(EntityPlayer player, TileEntitySaberforge saberforge) {
        super(new ContainerSaberforge(player, saberforge));
        this.playerInventory = player.inventory;
        this.saberforge = saberforge;
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        ItemStack stack = this.saberforge.getStackInSlot(4);
        IBakedModel modelItem = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(stack, saberforge.getWorld(), null);

        Minecraft.getMinecraft().getRenderItem().renderItemIntoGUI(stack, 32, 42);
        //System.out.println(stack);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1,1,1,1);
        mc.getTextureManager().bindTexture(tex);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0,0, xSize, ySize);
    }


}
