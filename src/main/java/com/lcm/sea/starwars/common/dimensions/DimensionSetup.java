package com.lcm.sea.starwars.common.dimensions;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.common.dimensions.providers.WorldProviderTatooine;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionSetup {

    public static DimensionType tatooine;

    public static void init()
    {
        regTypes();
        registerDimensions();
    }

    public static void regTypes()
    {
        tatooine = DimensionType.register("tatooine", "_tatooine", 5, WorldProviderTatooine.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(5, tatooine);
    }

}
