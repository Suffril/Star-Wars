package com.lcm.sea.starwars.client.models.item.SaberParts;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * NewProject - Undefined
 * Created using Tabula 4.1.1
 */
public class Emitter extends ModelLightsaberPart {
    public ModelRenderer blade;

    public Emitter() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.blade = new ModelRenderer(this, 0, 0);
        this.blade.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.blade.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    }

    public void render(float f5) {
        this.blade.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


    @Override
    public float getHeight() {
        return 0.125F;
    }

    @Override
    public float getWidth() {
        return 0.125F;
    }

}
