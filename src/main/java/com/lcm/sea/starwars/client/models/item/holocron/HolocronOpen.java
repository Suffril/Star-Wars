package com.lcm.sea.starwars.client.models.item.holocron;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * HolocronOpen - Neon
 * Created using Tabula 4.1.1
 */
public class HolocronOpen extends ModelBase {
    public ModelRenderer detailFront;
    public ModelRenderer detailSides;
    public ModelRenderer detailUp;

    public HolocronOpen() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.detailUp = new ModelRenderer(this, 0, 48);
        this.detailUp.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailUp.addBox(-3.0F, -4.5F, -3.0F, 6, 9, 6, 0.0F);
        this.setRotateAngle(detailUp, 0.0F, 0.7853981633974483F, 0.0F);
        this.detailFront = new ModelRenderer(this, 0, 17);
        this.detailFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailFront.addBox(-3.0F, -3.0F, -4.5F, 6, 6, 9, 0.0F);
        this.setRotateAngle(detailFront, 0.0F, 0.0F, 0.7853981633974483F);
        this.detailSides = new ModelRenderer(this, 0, 35);
        this.detailSides.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailSides.addBox(-4.5F, -3.0F, -3.0F, 9, 6, 6, 0.0F);
        this.setRotateAngle(detailSides, 0.7853981633974483F, 0.0F, 0.0F);
    }

    public void render(float f5) {
        this.detailUp.render(f5);
        this.detailFront.render(f5);
        this.detailSides.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
