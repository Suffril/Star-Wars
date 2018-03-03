package com.lcm.sea.starwars.utils;

import net.minecraft.entity.Entity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class Utils {

    /**
     * Simple as hell way of playing sounds
     */
    public static void playSound(Entity entity, SoundEvent sound) {
        entity.world.playSound(null, entity.posX, entity.posY, entity.posZ, sound, SoundCategory.PLAYERS, 0.5F, 1.0F);
    }
    
}
