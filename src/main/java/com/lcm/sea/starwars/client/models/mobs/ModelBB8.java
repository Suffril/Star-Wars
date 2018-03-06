package com.lcm.sea.starwars.client.models.mobs;

import com.lcm.sea.starwars.StarWars;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * BB8 - Neon
 * Created using Tabula 4.1.1
 */
public class ModelBB8 extends ModelBase {

	public static final ResourceLocation texture = new ResourceLocation(StarWars.MODID, "textures/entity/bb8.png");

	private ModelRenderer base;
	private ModelRenderer head;

	public ModelBB8() {
		textureWidth = 128;
		textureHeight = 128;
		ModelRenderer shapeFront = new ModelRenderer(this, 0, 60);
		shapeFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeFront.addBox(-5.5F, -5.5F, -6.5F, 11, 11, 1, 0.0F);
		ModelRenderer shapeUp = new ModelRenderer(this, 0, 39);
		shapeUp.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeUp.addBox(-5.5F, -6.5F, -5.5F, 11, 1, 11, 0.0F);
		ModelRenderer eyeEye = new ModelRenderer(this, 0, 110);
		eyeEye.setRotationPoint(0.0F, 0.0F, 0.0F);
		eyeEye.addBox(2.0F, -1.3F, -4.2F, 1, 1, 1, 0.0F);
		ModelRenderer smallAntenna = new ModelRenderer(this, 6, 0);
		smallAntenna.setRotationPoint(0.0F, 0.0F, 0.0F);
		smallAntenna.addBox(-1.2F, -7.2F, -1.1F, 1, 2, 1, 0.0F);
		base = new ModelRenderer(this, 0, 0);
		base.setRotationPoint(0.0F, 17.5F, 0.0F);
		base.addBox(-6.0F, -6.0F, -6.0F, 12, 12, 12, 0.0F);
		ModelRenderer shapeBack = new ModelRenderer(this, 0, 60);
		shapeBack.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeBack.addBox(-5.5F, -5.5F, 5.5F, 11, 11, 1, 0.0F);
		ModelRenderer shapeDown = new ModelRenderer(this, 0, 39);
		shapeDown.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeDown.addBox(-5.5F, 6.0F, -5.5F, 11, 1, 11, 0.0F);
		ModelRenderer shapeRight = new ModelRenderer(this, 0, 75);
		shapeRight.mirror = true;
		shapeRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeRight.addBox(-6.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F);
		ModelRenderer shapeLeft = new ModelRenderer(this, 0, 75);
		shapeLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		shapeLeft.addBox(5.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F);
		ModelRenderer eye = new ModelRenderer(this, 0, 100);
		eye.setRotationPoint(0.0F, 0.0F, 0.0F);
		eye.addBox(-1.5F, -4.0F, -4.5F, 3, 3, 1, 0.0F);
		head = new ModelRenderer(this, 60, 0);
		head.setRotationPoint(0.0F, -6.5F, 0.0F);
		head.addBox(-4.0F, -4.8F, -4.0F, 8, 5, 8, 0.0F);
		ModelRenderer headTop = new ModelRenderer(this, 60, 20);
		headTop.setRotationPoint(0.0F, 0.0F, 0.0F);
		headTop.addBox(-3.5F, -5.5F, -3.5F, 7, 5, 7, 0.0F);
		ModelRenderer antenna = new ModelRenderer(this, 0, 0);
		antenna.setRotationPoint(0.0F, 0.0F, 0.0F);
		antenna.addBox(-2.7F, -8.9F, -0.5F, 1, 4, 1, 0.0F);

		head.addChild(smallAntenna);
		base.addChild(shapeRight);
		base.addChild(shapeDown);
		head.addChild(eyeEye);
		base.addChild(shapeFront);
		base.addChild(shapeUp);
		base.addChild(shapeBack);
		head.addChild(antenna);
		head.addChild(headTop);
		head.addChild(eye);
		base.addChild(shapeLeft);
	}

	@Override public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.0F, 0);
		head.render(scale);
		GlStateManager.popMatrix();

		base.render(scale);
	}

	@Override public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch, float scaleFactor, Entity entity) {
		if (entity.prevPosX != entity.posX) {
			base.rotateAngleX = entity.getEntityWorld().getWorldTime();
		} else {
			base.rotateAngleX = 0;
		}
	}
}
