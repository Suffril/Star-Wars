package com.lcm.sea.starwars.client.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelParrot;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

/**
 * BB8 - Neon
 * Created using Tabula 4.1.1
 */
public class ModelBB8 extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer shapeLeft;
    public ModelRenderer shapeFront;
    public ModelRenderer shapeUp;
    public ModelRenderer shapeDown;
    public ModelRenderer shapeRight;
    public ModelRenderer shapeBack;
    public ModelRenderer Head;
    public ModelRenderer headtop;
    public ModelRenderer eyeye;
    public ModelRenderer Antenna;
    public ModelRenderer smallantenna;
    public ModelRenderer eye;



    public ModelBB8() {
        textureWidth = 128;
        textureHeight = 128;
        shapeFront = new ModelRenderer(this, 0, 60);
        shapeFront.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeFront.addBox(-5.5F, -5.5F, -6.5F, 11, 11, 1, 0.0F);
        shapeUp = new ModelRenderer(this, 0, 39);
        shapeUp.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeUp.addBox(-5.5F, -6.5F, -5.5F, 11, 1, 11, 0.0F);
        eyeye = new ModelRenderer(this, 0, 110);
        eyeye.setRotationPoint(0.0F, 0.0F, 0.0F);
        eyeye.addBox(2.0F, -1.3F, -4.2F, 1, 1, 1, 0.0F);
        smallantenna = new ModelRenderer(this, 6, 0);
        smallantenna.setRotationPoint(0.0F, 0.0F, 0.0F);
        smallantenna.addBox(-1.2F, -7.2F, -1.1F, 1, 2, 1, 0.0F);
        Base = new ModelRenderer(this, 0, 0);
        Base.setRotationPoint(0.0F, 17.5F, 0.0F);
        Base.addBox(-6.0F, -6.0F, -6.0F, 12, 12, 12, 0.0F);
        shapeBack = new ModelRenderer(this, 0, 60);
        shapeBack.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeBack.addBox(-5.5F, -5.5F, 5.5F, 11, 11, 1, 0.0F);
        shapeDown = new ModelRenderer(this, 0, 39);
        shapeDown.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeDown.addBox(-5.5F, 6.0F, -5.5F, 11, 1, 11, 0.0F);
        shapeRight = new ModelRenderer(this, 0, 75);
        shapeRight.mirror = true;
        shapeRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeRight.addBox(-6.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F);
        shapeLeft = new ModelRenderer(this, 0, 75);
        shapeLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        shapeLeft.addBox(5.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F);
        eye = new ModelRenderer(this, 0, 100);
        eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        eye.addBox(-1.5F, -4.0F, -4.5F, 3, 3, 1, 0.0F);
        Head = new ModelRenderer(this, 60, 0);
        Head.setRotationPoint(0.0F, -6.5F, 0.0F);
        Head.addBox(-4.0F, -4.8F, -4.0F, 8, 5, 8, 0.0F);
        headtop = new ModelRenderer(this, 60, 20);
        headtop.setRotationPoint(0.0F, 0.0F, 0.0F);
        headtop.addBox(-3.5F, -5.5F, -3.5F, 7, 5, 7, 0.0F);
        Antenna = new ModelRenderer(this, 0, 0);
        Antenna.setRotationPoint(0.0F, 0.0F, 0.0F);
        Antenna.addBox(-2.7F, -8.9F, -0.5F, 1, 4, 1, 0.0F);

        Head.addChild(smallantenna);
        Base.addChild(shapeRight);
        Base.addChild(shapeDown);
        Head.addChild(eyeye);
        Base.addChild(shapeFront);
        Base.addChild(shapeUp);
        Base.addChild(shapeBack);
        Head.addChild(Antenna);
        Head.addChild(headtop);
        Head.addChild(eye);
        Base.addChild(shapeLeft);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate(0, 1.0F, 0);
        Head.render(scale);
        GlStateManager.popMatrix();

        Base.render(scale);
    }



    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch, float scaleFactor, Entity entity)
    {
        if(entity.prevPosX != entity.posX) {
            Base.rotateAngleX = entity.getEntityWorld().getWorldTime();
        } else {
            Base.rotateAngleX = 0;
        }
    }
}
