package com.lcm.sea.starwars.client.models.item.holocron;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Holocron - Neon
 * Created using Tabula 4.1.1
 */
public class Holocron extends ModelBase {
    public ModelRenderer core;
    public ModelRenderer detailFront;
    public ModelRenderer detailSides;
    public ModelRenderer detailUp;
    public ModelRenderer innerFront;
    public ModelRenderer innerSides;
    public ModelRenderer innerUp;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape16;

    public Holocron() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.shape7 = new ModelRenderer(this, 42, 20);
        this.shape7.mirror = true;
        this.shape7.setRotationPoint(-5.0F, -5.0F, 4.0F);
        this.shape7.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.shape15 = new ModelRenderer(this, 42, 20);
        this.shape15.setRotationPoint(-5.0F, 4.0F, 4.0F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.shape13 = new ModelRenderer(this, 42, 7);
        this.shape13.setRotationPoint(-5.0F, 4.0F, -5.0F);
        this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.shape5 = new ModelRenderer(this, 42, 20);
        this.shape5.setRotationPoint(-4.0F, -5.0F, -5.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.shape12 = new ModelRenderer(this, 40, 0);
        this.shape12.setRotationPoint(4.0F, -4.0F, -5.0F);
        this.shape12.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.innerFront = new ModelRenderer(this, 37, 28);
        this.innerFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.innerFront.addBox(-4.5F, -3.5F, -3.5F, 9, 7, 7, 0.0F);
        this.shape6 = new ModelRenderer(this, 42, 7);
        this.shape6.setRotationPoint(4.0F, -5.0F, -4.0F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.detailFront = new ModelRenderer(this, 0, 17);
        this.detailFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailFront.addBox(-3.0F, -3.0F, -5.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(detailFront, 0.0F, 0.0F, 0.7853981633974483F);
        this.shape16 = new ModelRenderer(this, 42, 7);
        this.shape16.mirror = true;
        this.shape16.setRotationPoint(4.0F, 4.0F, -4.0F);
        this.shape16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.innerUp = new ModelRenderer(this, 72, 38);
        this.innerUp.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.innerUp.addBox(-3.5F, -4.5F, -3.5F, 7, 9, 7, 0.0F);
        this.detailSides = new ModelRenderer(this, 0, 35);
        this.detailSides.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailSides.addBox(-5.0F, -3.0F, -3.0F, 10, 6, 6, 0.0F);
        this.setRotateAngle(detailSides, 0.7853981633974483F, 0.0F, 0.0F);
        this.shape14 = new ModelRenderer(this, 42, 20);
        this.shape14.mirror = true;
        this.shape14.setRotationPoint(-4.0F, 4.0F, -5.0F);
        this.shape14.addBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
        this.core = new ModelRenderer(this, 0, 0);
        this.core.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.core.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.shape11 = new ModelRenderer(this, 40, 0);
        this.shape11.mirror = true;
        this.shape11.setRotationPoint(-5.0F, -4.0F, -5.0F);
        this.shape11.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.innerSides = new ModelRenderer(this, 37, 48);
        this.innerSides.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.innerSides.addBox(-3.5F, -3.5F, -4.5F, 7, 7, 9, 0.0F);
        this.detailUp = new ModelRenderer(this, 0, 48);
        this.detailUp.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.detailUp.addBox(-3.0F, -5.0F, -3.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(detailUp, 0.0F, 0.7853981633974483F, 0.0F);
        this.shape8 = new ModelRenderer(this, 42, 7);
        this.shape8.mirror = true;
        this.shape8.setRotationPoint(-5.0F, -5.0F, -5.0F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
        this.shape10 = new ModelRenderer(this, 40, 0);
        this.shape10.setRotationPoint(-5.0F, -4.0F, 4.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.shape9 = new ModelRenderer(this, 40, 0);
        this.shape9.mirror = true;
        this.shape9.setRotationPoint(4.0F, -4.0F, 4.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    }

    public void render(float f5) {
        this.shape7.render(f5);
        this.shape15.render(f5);
        this.shape13.render(f5);
        this.shape5.render(f5);
        this.shape12.render(f5);
        this.innerFront.render(f5);
        this.shape6.render(f5);
        this.detailFront.render(f5);
        this.shape16.render(f5);
        this.innerUp.render(f5);
        this.detailSides.render(f5);
        this.shape14.render(f5);
        this.core.render(f5);
        this.shape11.render(f5);
        this.innerSides.render(f5);
        this.detailUp.render(f5);
        this.shape8.render(f5);
        this.shape10.render(f5);
        this.shape9.render(f5);
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
