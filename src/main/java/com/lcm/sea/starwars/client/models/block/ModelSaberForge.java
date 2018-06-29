package com.lcm.sea.starwars.client.models.block;

import com.lcm.sea.starwars.StarWars;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * ModelSaberForge - Neon
 * Created using Tabula 4.1.1
 */
public class ModelSaberForge extends ModelBase {

    public ResourceLocation tex = new ResourceLocation(StarWars.MODID, "textures/blocks/saberforge.png");
    public ModelRenderer forgeBase;
    public ModelRenderer forgeLeft;
    public ModelRenderer forgeRight;
    public ModelRenderer forgeBack;
    public ModelRenderer lighting;
    public ModelRenderer thingLeft;
    public ModelRenderer thingRight;
    public ModelRenderer crystalHolder;
    public ModelRenderer forgeFoot;
    public ModelRenderer footLeft;
    public ModelRenderer footRight;
    public ModelRenderer footBack;
    public ModelRenderer shape7;
    public ModelRenderer shape9;
    public ModelRenderer holderDetail;
    public ModelRenderer base;
    public ModelRenderer angle;
    public ModelRenderer light;
    public ModelRenderer angle2;
    public ModelRenderer Base;
    public ModelRenderer angle_1;
    public ModelRenderer light_1;
    public ModelRenderer angle2_1;

    public ModelSaberForge() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.forgeBase = new ModelRenderer(this, 0, 33);
        this.forgeBase.setRotationPoint(0.0F, 8.0F, -2.0F);
        this.forgeBase.addBox(-8.0F, 0.1F, -8.0F, 16, 7, 12, 0.0F);
        this.Base = new ModelRenderer(this, 155, 0);
        this.Base.mirror = true;
        this.Base.setRotationPoint(-13.0F, 8.0F, 8.5F);
        this.Base.addBox(-10.0F, 0.0F, -8.0F, 10, 16, 8, 0.0F);
        this.thingRight = new ModelRenderer(this, 110, 0);
        this.thingRight.mirror = true;
        this.thingRight.setRotationPoint(-12.0F, -2.5F, 6.0F);
        this.thingRight.addBox(-2.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(thingRight, 0.0F, 0.0F, 0.18203784098300857F);
        this.forgeBack = new ModelRenderer(this, 0, 0);
        this.forgeBack.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.forgeBack.addBox(-15.0F, -0.1F, 0.0F, 30, 7, 9, 0.0F);
        this.forgeRight = new ModelRenderer(this, 0, 75);
        this.forgeRight.mirror = true;
        this.forgeRight.setRotationPoint(-8.0F, 0.0F, -8.0F);
        this.forgeRight.addBox(0.0F, 0.0F, 0.0F, 10, 7, 12, 0.0F);
        this.setRotateAngle(forgeRight, 0.0F, -0.6248278722139698F, 0.0F);
        this.light = new ModelRenderer(this, 200, 0);
        this.light.setRotationPoint(5.0F, -5.5F, 0.5F);
        this.light.addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
        this.holderDetail = new ModelRenderer(this, 84, 0);
        this.holderDetail.mirror = true;
        this.holderDetail.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.holderDetail.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(holderDetail, 0.0F, 0.7853981633974483F, 0.0F);
        this.angle2 = new ModelRenderer(this, 229, 27);
        this.angle2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.angle2.addBox(-3.0F, 0.0F, 0.0F, 3, 17, 8, 0.0F);
        this.setRotateAngle(angle2, 0.0F, 0.0F, -0.29914943379182807F);
        this.crystalHolder = new ModelRenderer(this, 84, 0);
        this.crystalHolder.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.crystalHolder.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.footBack = new ModelRenderer(this, 80, 28);
        this.footBack.setRotationPoint(-13.0F, 6.9F, 0.5F);
        this.footBack.addBox(0.0F, 0.0F, 0.0F, 26, 9, 8, 0.0F);
        this.forgeLeft = new ModelRenderer(this, 0, 75);
        this.forgeLeft.setRotationPoint(8.0F, 0.0F, -8.0F);
        this.forgeLeft.addBox(-10.0F, 0.0F, 0.0F, 10, 7, 12, 0.0F);
        this.setRotateAngle(forgeLeft, 0.0F, 0.6248278722139698F, 0.0F);
        this.angle = new ModelRenderer(this, 229, 0);
        this.angle.setRotationPoint(2.0F, -16.0F, 0.0F);
        this.angle.addBox(0.0F, 0.0F, 0.0F, 3, 16, 8, 0.0F);
        this.footLeft = new ModelRenderer(this, 64, 64);
        this.footLeft.setRotationPoint(-2.1F, 7.0F, 0.3F);
        this.footLeft.addBox(-7.0F, 0.0F, 0.0F, 7, 9, 11, 0.0F);
        this.setRotateAngle(footLeft, 0.0F, 0.015707963267948967F, 0.0F);
        this.thingLeft = new ModelRenderer(this, 110, 0);
        this.thingLeft.setRotationPoint(12.0F, -2.5F, 6.0F);
        this.thingLeft.addBox(-1.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(thingLeft, 0.0F, 0.0F, -0.18203784098300857F);
        this.shape7 = new ModelRenderer(this, 110, 9);
        this.shape7.setRotationPoint(1.5F, -0.5F, 0.5F);
        this.shape7.addBox(-4.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(shape7, 0.0F, 0.0F, 0.18203784098300857F);
        this.lighting = new ModelRenderer(this, 0, 106);
        this.lighting.setRotationPoint(-6.5F, -0.2F, -7.0F);
        this.lighting.addBox(0.0F, 0.0F, 0.0F, 13, 1, 17, 0.0F);
        this.footRight = new ModelRenderer(this, 64, 64);
        this.footRight.mirror = true;
        this.footRight.setRotationPoint(2.1F, 7.0F, 0.3F);
        this.footRight.addBox(0.0F, 0.0F, 0.0F, 7, 9, 11, 0.0F);
        this.setRotateAngle(footRight, 0.0F, -0.015707963267948967F, 0.0F);
        this.base = new ModelRenderer(this, 155, 0);
        this.base.setRotationPoint(13.0F, 8.0F, 0.5F);
        this.base.addBox(0.0F, 0.0F, 0.0F, 10, 16, 8, 0.0F);
        this.shape9 = new ModelRenderer(this, 110, 9);
        this.shape9.mirror = true;
        this.shape9.setRotationPoint(-1.5F, -0.5F, 0.5F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(shape9, 0.0F, 0.0F, -0.18203784098300857F);
        this.angle_1 = new ModelRenderer(this, 229, 0);
        this.angle_1.mirror = true;
        this.angle_1.setRotationPoint(-2.0F, -16.0F, 0.0F);
        this.angle_1.addBox(-3.0F, 0.0F, -8.0F, 3, 16, 8, 0.0F);
        this.angle2_1 = new ModelRenderer(this, 229, 27);
        this.angle2_1.mirror = true;
        this.angle2_1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.angle2_1.addBox(0.0F, 0.0F, -8.0F, 3, 17, 8, 0.0F);
        this.setRotateAngle(angle2_1, 0.0F, 0.0F, 0.29914943379182807F);
        this.light_1 = new ModelRenderer(this, 200, 0);
        this.light_1.mirror = true;
        this.light_1.setRotationPoint(-7.0F, -5.5F, 0.5F);
        this.light_1.addBox(0.0F, 0.0F, -8.0F, 2, 6, 7, 0.0F);
        this.forgeFoot = new ModelRenderer(this, 80, 100);
        this.forgeFoot.setRotationPoint(-6.5F, 7.0F, -6.5F);
        this.forgeFoot.addBox(0.0F, 0.0F, 0.0F, 13, 9, 16, 0.0F);
        this.forgeBase.addChild(this.thingRight);
        this.forgeBase.addChild(this.forgeBack);
        this.forgeBase.addChild(this.forgeRight);
        this.base.addChild(this.light);
        this.crystalHolder.addChild(this.holderDetail);
        this.angle.addChild(this.angle2);
        this.forgeBase.addChild(this.crystalHolder);
        this.forgeBack.addChild(this.footBack);
        this.forgeBase.addChild(this.forgeLeft);
        this.base.addChild(this.angle);
        this.forgeLeft.addChild(this.footLeft);
        this.forgeBase.addChild(this.thingLeft);
        this.thingLeft.addChild(this.shape7);
        this.forgeBase.addChild(this.lighting);
        this.forgeRight.addChild(this.footRight);
        this.thingRight.addChild(this.shape9);
        this.Base.addChild(this.angle_1);
        this.angle_1.addChild(this.angle2_1);
        this.Base.addChild(this.light_1);
        this.forgeBase.addChild(this.forgeFoot);
    }


    public void render(float f5) {
        Minecraft.getMinecraft().renderEngine.bindTexture(tex);
        this.forgeBase.render(f5);
        this.Base.render(f5);
        this.base.render(f5);
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
