package com.lcm.sea.starwars.client.models.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Speeder - Undefined
 * Created using Tabula 5.1.0
 */
public class ModelSpeeder extends ModelBase {
    private ModelRenderer Front1;
    private ModelRenderer front4;
    private ModelRenderer Body2;
    private ModelRenderer front11;
    private ModelRenderer front12;
    private ModelRenderer handelleftside2;
    private ModelRenderer Front8;
    private ModelRenderer front9;
    private ModelRenderer front17;
    private ModelRenderer front13;
    private ModelRenderer front18;
    private ModelRenderer front14;
    private ModelRenderer Front16;
    private ModelRenderer front15;
    private ModelRenderer Front6;
    private ModelRenderer Front10;
    private ModelRenderer Front5;
    private ModelRenderer handelrightside2;
    private ModelRenderer handelrightside;
    private ModelRenderer handelleftside;
    private ModelRenderer shape1;
    private ModelRenderer seat;
    private ModelRenderer Body4;
    private ModelRenderer Body;
    private ModelRenderer front2;
    private ModelRenderer Body3;
    private ModelRenderer front7;
    private ModelRenderer pipe2;
    private ModelRenderer pipe1;
    private ModelRenderer pipe3;
    private ModelRenderer pipe4;
    private ModelRenderer Pipe5;
    private ModelRenderer shape1_1;
    private ModelRenderer Seatback;
    private ModelRenderer front3;

    public ModelSpeeder() {
        textureWidth = 200;
        textureHeight = 200;
        Front6 = new ModelRenderer(this, 101, 0);
        Front6.setRotationPoint(-1.5F, 12.5F, -6.0F);
        Front6.addBox(2.0F, -1.5F, -5.0F, 1, 2, 3, 0.0F);
        handelrightside = new ModelRenderer(this, 165, 0);
        handelrightside.setRotationPoint(5.0F, 11.0F, -4.0F);
        handelrightside.addBox(-1.1F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        setRotateAngle(handelrightside, -0.3490658503988659F, 0.05235987755982988F, 0.0F);
        front3 = new ModelRenderer(this, 170, 19);
        front3.setRotationPoint(0.5F, 0.0F, -6.0F);
        front3.addBox(0.0F, 0.0F, -3.0F, 7, 4, 3, 0.0F);
        front14 = new ModelRenderer(this, 157, 0);
        front14.setRotationPoint(-2.0F, 12.0F, -7.0F);
        front14.addBox(-1.4F, 0.5F, -19.0F, 1, 3, 6, 0.0F);
        setRotateAngle(front14, 0.0F, -0.05235987755982988F, 0.08726646259971647F);
        handelleftside = new ModelRenderer(this, 169, 0);
        handelleftside.setRotationPoint(-2.0F, 11.0F, -4.0F);
        handelleftside.addBox(-0.9F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        setRotateAngle(handelleftside, -0.3490658503988659F, 0.05235987755982988F, 0.0F);
        Body3 = new ModelRenderer(this, 36, 10);
        Body3.setRotationPoint(-4.0F, 9.0F, 14.0F);
        Body3.addBox(0.0F, 0.0F, -3.0F, 10, 6, 6, 0.0F);
        front13 = new ModelRenderer(this, 131, 0);
        front13.setRotationPoint(-2.0F, 12.0F, -7.0F);
        front13.addBox(-1.5F, -1.5F, -18.0F, 1, 2, 5, 0.0F);
        setRotateAngle(front13, 0.0F, -0.05235987755982988F, 0.08726646259971647F);
        pipe4 = new ModelRenderer(this, 70, 12);
        pipe4.setRotationPoint(6.0F, 14.0F, 8.0F);
        pipe4.addBox(-7.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F);
        pipe1 = new ModelRenderer(this, 127, 7);
        pipe1.setRotationPoint(4.0F, 15.0F, 8.0F);
        pipe1.addBox(0.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F);
        Seatback = new ModelRenderer(this, 0, 0);
        Seatback.setRotationPoint(-1.0F, 8.5F, 9.0F);
        Seatback.addBox(0.0F, 0.0F, -1.0F, 4, 3, 5, 0.0F);
        setRotateAngle(Seatback, 0.6806784082777886F, 0.0F, 0.0F);
        front2 = new ModelRenderer(this, 0, 10);
        front2.setRotationPoint(-3.0F, 13.0F, -5.0F);
        front2.addBox(0.0F, 0.0F, -3.0F, 8, 3, 10, 0.0F);
        front4 = new ModelRenderer(this, 46, 0);
        front4.setRotationPoint(-2.0F, 9.0F, 0.0F);
        front4.addBox(0.0F, -0.3F, -9.0F, 6, 1, 9, 0.0F);
        setRotateAngle(front4, 0.2617993877991494F, 0.0F, 0.0F);
        front18 = new ModelRenderer(this, 143, 0);
        front18.setRotationPoint(4.0F, 12.0F, -7.0F);
        front18.addBox(0.4F, 0.5F, -19.0F, 1, 3, 6, 0.0F);
        setRotateAngle(front18, 0.0F, 0.05235987755982988F, -0.08726646259971647F);
        shape1 = new ModelRenderer(this, 173, 0);
        shape1.setRotationPoint(-3.5F, 11.0F, 4.0F);
        shape1.addBox(1.0F, -3.0F, 12.0F, 7, 1, 2, 0.0F);
        front17 = new ModelRenderer(this, 119, 0);
        front17.setRotationPoint(4.0F, 12.0F, -7.0F);
        front17.addBox(0.5F, -1.5F, -18.0F, 1, 2, 5, 0.0F);
        setRotateAngle(front17, 0.0F, 0.05235987755982988F, -0.08726646259971647F);
        Front1 = new ModelRenderer(this, 18, 0);
        Front1.setRotationPoint(-3.0F, 9.0F, 0.0F);
        Front1.addBox(0.0F, 0.0F, -6.0F, 8, 4, 6, 0.0F);
        setRotateAngle(Front1, 0.2617993877991494F, 0.0F, 0.0F);
        Front5 = new ModelRenderer(this, 151, 0);
        Front5.setRotationPoint(-2.0F, 12.0F, -6.0F);
        Front5.addBox(2.0F, -0.5F, -6.0F, 2, 1, 4, 0.0F);
        front9 = new ModelRenderer(this, 112, 0);
        front9.setRotationPoint(-2.0F, 12.0F, -6.0F);
        front9.addBox(0.5F, 0.0F, -19.0F, 5, 1, 1, 0.0F);
        Body = new ModelRenderer(this, 132, 9);
        Body.setRotationPoint(-3.0F, 9.0F, 0.0F);
        Body.addBox(0.0F, 0.0F, 0.0F, 8, 4, 11, 0.0F);
        front7 = new ModelRenderer(this, 48, 10);
        front7.setRotationPoint(4.0F, 12.0F, -6.0F);
        front7.addBox(0.0F, 0.0F, -19.0F, 1, 1, 20, 0.0F);
        setRotateAngle(front7, 0.0F, 0.05235987755982988F, 0.0F);
        Pipe5 = new ModelRenderer(this, 86, 12);
        Pipe5.setRotationPoint(4.0F, 15.0F, 8.0F);
        Pipe5.addBox(-7.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F);
        handelrightside2 = new ModelRenderer(this, 138, 0);
        handelrightside2.setRotationPoint(5.0F, 11.0F, -4.0F);
        handelrightside2.addBox(-3.1F, -6.0F, 0.0F, 3, 1, 1, 0.0F);
        setRotateAngle(handelrightside2, -0.3490658503988659F, 0.05235987755982988F, 0.0F);
        Body2 = new ModelRenderer(this, 76, 0);
        Body2.setRotationPoint(-3.0F, 13.0F, 11.0F);
        Body2.addBox(0.0F, 0.0F, -2.0F, 8, 3, 9, 0.0F);
        Front8 = new ModelRenderer(this, 90, 0);
        Front8.setRotationPoint(-2.0F, 12.0F, -6.0F);
        Front8.addBox(-1.0F, 0.0F, -19.0F, 1, 1, 20, 0.0F);
        setRotateAngle(Front8, 0.0F, -0.05235987755982988F, 0.0F);
        front11 = new ModelRenderer(this, 40, 0);
        front11.setRotationPoint(-2.0F, 12.0F, -9.0F);
        front11.addBox(0.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F);
        setRotateAngle(front11, 0.19198621771937624F, 0.0F, 0.0F);
        front12 = new ModelRenderer(this, 67, 0);
        front12.setRotationPoint(-2.0F, 12.0F, -9.0F);
        front12.addBox(0.5F, 0.5F, 0.0F, 5, 3, 1, 0.0F);
        Front16 = new ModelRenderer(this, 0, 0);
        Front16.setRotationPoint(4.0F, 12.0F, -7.0F);
        Front16.addBox(0.5F, -1.0F, -13.0F, 1, 3, 1, 0.0F);
        setRotateAngle(Front16, 0.0F, 0.05235987755982988F, -0.08726646259971647F);
        Front10 = new ModelRenderer(this, 126, 0);
        Front10.setRotationPoint(-2.0F, 12.0F, -6.0F);
        Front10.addBox(2.0F, -0.5F, -20.0F, 2, 2, 3, 0.0F);
        Body4 = new ModelRenderer(this, 112, 7);
        Body4.setRotationPoint(-4.0F, 9.0F, 20.0F);
        Body4.addBox(0.0F, 0.0F, -3.0F, 10, 4, 1, 0.0F);
        pipe2 = new ModelRenderer(this, 181, 3);
        pipe2.setRotationPoint(10.0F, 13.5F, 8.0F);
        pipe2.addBox(-7.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F);
        front15 = new ModelRenderer(this, 79, 0);
        front15.setRotationPoint(-2.0F, 12.0F, -7.0F);
        front15.addBox(-1.5F, -1.0F, -13.0F, 1, 3, 1, 0.0F);
        setRotateAngle(front15, 0.0F, -0.05235987755982988F, 0.08726646259971647F);
        seat = new ModelRenderer(this, 165, 3);
        seat.setRotationPoint(-3.0F, 9.0F, 0.0F);
        seat.addBox(2.0F, -0.5F, 1.0F, 4, 1, 8, 0.0F);
        pipe3 = new ModelRenderer(this, 182, 11);
        pipe3.setRotationPoint(6.0F, 14.5F, 8.0F);
        pipe3.addBox(-5.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F);
        handelleftside2 = new ModelRenderer(this, 13, 0);
        handelleftside2.setRotationPoint(-2.0F, 11.0F, -4.0F);
        handelleftside2.addBox(-0.9F, -6.0F, 0.0F, 3, 1, 1, 0.0F);
        setRotateAngle(handelleftside2, -0.3490658503988659F, 0.05235987755982988F, 0.0F);
        shape1_1 = new ModelRenderer(this, 159, 12);
        shape1_1.setRotationPoint(-3.0F, 9.0F, 0.0F);
        shape1_1.addBox(1.0F, -3.0F, 12.0F, 6, 3, 4, 0.0F);
        Front1.addChild(front3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        GlStateManager.pushMatrix();
        if(entity.isBeingRidden()) {
            GlStateManager.translate(-0.08, 0, -0.5);
        }
        Front6.render(f5);
        handelrightside.render(f5);
        front14.render(f5);
        handelleftside.render(f5);
        Body3.render(f5);
        front13.render(f5);
        pipe4.render(f5);
        pipe1.render(f5);
        Seatback.render(f5);
        front2.render(f5);
        front4.render(f5);
        front18.render(f5);
        shape1.render(f5);
        front17.render(f5);
        Front1.render(f5);
        Front5.render(f5);
        front9.render(f5);
        Body.render(f5);
        front7.render(f5);
        Pipe5.render(f5);
        handelrightside2.render(f5);
        Body2.render(f5);
        Front8.render(f5);
        front11.render(f5);
        front12.render(f5);
        Front16.render(f5);
        Front10.render(f5);
        Body4.render(f5);
        pipe2.render(f5);
        front15.render(f5);
        seat.render(f5);
        pipe3.render(f5);
        handelleftside2.render(f5);
        shape1_1.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
