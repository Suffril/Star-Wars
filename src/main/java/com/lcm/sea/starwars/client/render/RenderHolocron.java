package com.lcm.sea.starwars.client.render;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.client.models.item.holocron.Holocron;
import com.lcm.sea.starwars.client.models.item.holocron.HolocronOpen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RenderHolocron extends TileEntityItemStackRenderer {

    private Holocron closed = new Holocron();
    private HolocronOpen open = new HolocronOpen();
    public static final ResourceLocation TEX = new ResourceLocation(StarWars.MODID, "textures/models/holocrons/jedi_holocron.png");


    @Override
    public void renderByItem(ItemStack theStack, float partialTicks) {
        Minecraft.getMinecraft().renderEngine.bindTexture(TEX);
        closed.render(0.0625F);

        super.renderByItem(theStack, partialTicks);
    }
}
