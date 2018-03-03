package com.lcm.sea.starwars.client.render;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.client.models.mobs.ModelBB8;
import com.lcm.sea.starwars.common.mobs.EntityBB8;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

    /**
    * BB8 rendering class, although most stuff to do with BB8 is done in his model class
    */
public class RenderBB8 extends RenderLiving<EntityBB8>{

    public RenderBB8() {
        super(Minecraft.getMinecraft().getRenderManager(), new ModelBB8(), 1.0F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     *
     * @param entity
     */
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBB8 entity) {
        return new ResourceLocation(StarWars.MODID,"textures/entity/bb8.png");
    }
}
