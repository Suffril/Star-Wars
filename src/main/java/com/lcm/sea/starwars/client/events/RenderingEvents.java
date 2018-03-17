package com.lcm.sea.starwars.client.events;

import com.lcm.sea.starwars.common.mobs.vehicles.EntitySpeeder;
import com.lcm.sea.starwars.common.utils.LimbManipulationUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class RenderingEvents {

    @SubscribeEvent
    public static void onRenderPlayerPost(RenderPlayerEvent.Post e) {
        System.out.println(e.getEntity());
        if(e.getEntity() instanceof EntityPlayer && e.getEntity().getRidingEntity() instanceof EntitySpeeder)
        {
         //   LimbManipulationUtil.getLimbManipulator(e.getRenderer(), LimbManipulationUtil.Limb.LEFT_ARM).setAngles(-75, 0, 75);
         //   LimbManipulationUtil.getLimbManipulator(e.getRenderer(), LimbManipulationUtil.Limb.RIGHT_ARM).setAngles(-75, 0, 75);
         //   LimbManipulationUtil.getLimbManipulator(e.getRenderer(), LimbManipulationUtil.Limb.BODY).setAngles(35, 0, 0).setOffsets(0,-0.04F,0.07F);
        }
    }

}
