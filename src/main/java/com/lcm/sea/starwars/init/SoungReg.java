package com.lcm.sea.starwars.init;

import java.util.ArrayList;
import java.util.List;

import com.lcm.sea.starwars.StarWars;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = StarWars.MODID)
public class SoungReg {
    private static List<SoundEvent> SOUNDS = new ArrayList<>();

    public static final SoundEvent SABER_IGNITE = create("ignite"); //ignore this rn

    @SubscribeEvent
    public static void registerSoundEvents(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(SOUNDS.toArray(new SoundEvent[SOUNDS.size()]));
    }

    private static SoundEvent create(String name) {
        ResourceLocation rl = new ResourceLocation(StarWars.MODID, name);
        SoundEvent sound = new SoundEvent(rl).setRegistryName(name);
        SOUNDS.add(sound);
        return sound;
    }

}
