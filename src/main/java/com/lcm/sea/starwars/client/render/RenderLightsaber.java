package com.lcm.sea.starwars.client.render;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.client.models.item.SaberParts.ModelLightsaberPart;
import com.lcm.sea.starwars.common.items.ItemKyberCrystal;
import com.lcm.sea.starwars.common.items.ItemSaberPart;
import com.lcm.sea.starwars.common.utils.EnumSaberParts;
import com.lcm.sea.starwars.common.utils.NBTKeys;
import lucraft.mods.lucraftcore.util.helper.LCRenderHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import scala.util.Random;

public class RenderLightsaber extends TileEntityItemStackRenderer {

    private ModelLightsaberPart pommel, handle, emitter;
    private float saberHeight;
    public static final ResourceLocation TEX = new ResourceLocation(StarWars.MODID, "textures/items/saber.png");
    private static Vec3d start = new Vec3d(0,0,0);
    private static Vec3d color;
    private static int colour;


    public RenderLightsaber(ItemSaberPart pommel, ItemSaberPart handle, ItemSaberPart emitter, ItemKyberCrystal crystal) {
        this.pommel = pommel.getModel();
        this.handle = handle.getModel();
        this.emitter = emitter.getModel();
        this.saberHeight = this.pommel.getHeight() + this.handle.getHeight() + this.emitter.getHeight();
        this.colour = crystal.getColour();

        this.color = new Vec3d(LCRenderHelper.red(colour),LCRenderHelper.green(colour), LCRenderHelper.blue(colour));


    }

    @Override
    public void renderByItem(ItemStack theStack, float partialTicks) {


        Minecraft.getMinecraft().renderEngine.bindTexture(TEX);
        GlStateManager.pushMatrix();

        this.pommel.render(0.0625F);
        GlStateManager.translate(0, this.pommel.getHeight(), 0);
        this.handle.render(0.0625F);
        GlStateManager.translate(0, this.handle.getHeight(), 0);
        this.emitter.render(0.0625F);
        GlStateManager.translate(this.emitter.getWidth()/2, this.emitter.getHeight() * 10, this.emitter.getWidth()/2);
        LCRenderHelper.setupRenderLightning();
        if(theStack.hasTagCompound() && theStack.getTagCompound().getFloat(NBTKeys.EXTENSION) > 0) {
            renderBlade(theStack.getTagCompound().getFloat(NBTKeys.EXTENSION));

        }
        LCRenderHelper.finishRenderLightning();
        //GL11.glColor4f(1,1,1,1);
        GlStateManager.popMatrix();

    }

    public void renderBlade(float extension) {
        LCRenderHelper.drawGlowingLine(start, start.add(0, extension, 0), this.emitter.getWidth() * 4, color, 0.5F);

    }

}
