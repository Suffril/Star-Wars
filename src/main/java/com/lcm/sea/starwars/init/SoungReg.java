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

    //I've yet to actually find and add sounds, ignore these in the meantime, they WILL be null etc

    public static final SoundEvent SABER_IGNITE = create("saber_ignite");
    public static final SoundEvent SABER_UNIGNITE = create("saber_unignite");

    @SubscribeEvent
    public static void addSounds(RegistryEvent.Register<SoundEvent> event) {
        event.getRegistry().registerAll(SOUNDS.toArray(new SoundEvent[SOUNDS.size()]));
    }

    private static SoundEvent create(String name) {
        ResourceLocation rl = new ResourceLocation(StarWars.MODID, name);
        SoundEvent sound = new SoundEvent(rl).setRegistryName(name);
        SOUNDS.add(sound);
        return sound;
    }

}
