package com.lcm.sea.starwars.proxy;

import com.lcm.sea.starwars.client.models.mobs.ModelBB8;
import com.lcm.sea.starwars.common.mobs.EntityBB8;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import javax.annotation.Nullable;

/**
 * Created by Nictogen on 3/6/18.
 */
public class ClientProxy extends CommonProxy {

	@Override public void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBB8.class, manager -> new RenderLiving<EntityBB8>(manager, new ModelBB8(), 0.5f) {

			@Nullable @Override protected ResourceLocation getEntityTexture(EntityBB8 entity) {
				return ModelBB8.texture;
			}
		});
	}
}
