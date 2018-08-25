package com.lcm.sea.starwars.common.superpower.forcesensitive;

import com.lcm.sea.starwars.StarWars;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = StarWars.MODID) public class SuperpowerJedi extends SuperpowerForceSensitive {

    public static final SuperpowerJedi INSTANCE = new SuperpowerJedi();

    private UUID uuid = UUID.fromString("f1a375cb-327d-4103-89ba-479511c4062c");

    public SuperpowerJedi() {
        super("jedi");
    }

}
