package com.lcm.sea.starwars.proxy;

import com.lcm.sea.starwars.client.events.RenderingEvents;
import com.lcm.sea.starwars.client.models.mobs.ModelBB8;
import com.lcm.sea.starwars.client.models.mobs.ModelSpeeder;
import com.lcm.sea.starwars.client.render.RenderEntityBase;
import com.lcm.sea.starwars.common.mobs.EntityBB8;
import com.lcm.sea.starwars.common.mobs.vehicles.EntitySpeeder;
import com.lcm.sea.starwars.common.utils.LimbManipulationUtil;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nullable;

/**
 * Created by Nictogen on 3/6/18.
 */
public class ClientProxy extends CommonProxy {

	@Override public void registerEntityRenderers() {

        RenderingRegistry.registerEntityRenderingHandler(EntitySpeeder.class, manager -> new RenderEntityBase<>(manager, new ModelSpeeder(), "speeder", 1.0F));

        //Bb8
		RenderingRegistry.registerEntityRenderingHandler(EntityBB8.class, manager -> new RenderLiving<EntityBB8>(manager, new ModelBB8(), 0.5f) {

			@Nullable @Override protected ResourceLocation getEntityTexture(EntityBB8 entity) {
				return ModelBB8.texture;
			}
		});
	}
}
