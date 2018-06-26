package com.lcm.sea.starwars.client.models.item.SaberParts;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Pommel - Undefined
 * Created using Tabula 4.1.1
 */
public class Pommel extends ModelLightsaberPart {
    public ModelRenderer shape1;

    public Pommel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    }

    public void render(float f5) {
        this.shape1.render(f5);
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
        return 0.0625F;
    }
}
