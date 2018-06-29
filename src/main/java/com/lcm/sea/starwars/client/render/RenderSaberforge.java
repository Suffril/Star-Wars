package com.lcm.sea.starwars.client.render;

import com.lcm.sea.starwars.client.models.block.ModelSaberForge;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class RenderSaberforge extends TileEntitySpecialRenderer {

    ModelSaberForge model = new ModelSaberForge();

    @Override
    public void render(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        super.render(te, x, y, z, partialTicks, destroyStage, alpha);
        model.render(0.0625F);
    }
}
