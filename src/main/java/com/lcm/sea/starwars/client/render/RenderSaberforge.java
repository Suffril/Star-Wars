package com.lcm.sea.starwars.client.render;

import com.lcm.sea.starwars.client.models.block.ModelSaberForge;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class RenderSaberforge extends TileEntitySpecialRenderer {

    ModelSaberForge model = new ModelSaberForge();


    @Override
    public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        TileEntitySaberforge saberForge = (TileEntitySaberforge)te;
        ItemStack stack = saberForge.getStackInSlot(4);
        IBakedModel modelItem = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(stack, te.getWorld(), null);

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GlStateManager.rotate(180, 1, 0,0);
        model.render(0.0625F);
        GlStateManager.popMatrix();

        GlStateManager.pushMatrix();
        GlStateManager.translate((float)x - 0.5F, (float)y + 0.75F, (float)z + 1);
        GlStateManager.rotate(270, 0, 0,1);
        Minecraft.getMinecraft().getRenderItem().renderItem(stack, modelItem);
        GlStateManager.popMatrix();

    }
}
