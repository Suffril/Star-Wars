package com.lcm.sea.starwars.common.superpower.forcesensitive;

import com.lcm.sea.starwars.StarWars;
import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.render.SuperpowerRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = StarWars.MODID, value = Side.CLIENT) public class ForceSensitiveRenderer implements SuperpowerRenderer.ISuperpowerRenderer {

	@Override public void onRenderPlayer(RenderLivingBase<?> renderer, Minecraft mc, EntityPlayer player, Superpower superpower, SuperpowerPlayerHandler handler, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float mcScale) {
	}

	@Override public void applyColor() {
		SuperpowerRenderer.ISuperpowerRenderer.super.applyColor();
	}

}

