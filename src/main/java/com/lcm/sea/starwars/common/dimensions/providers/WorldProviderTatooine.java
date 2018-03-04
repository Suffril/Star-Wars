package com.lcm.sea.starwars.common.dimensions.providers;

import com.lcm.sea.starwars.common.dimensions.DimensionSetup;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderTatooine extends WorldProvider {

    @Override
    public DimensionType getDimensionType() {
        return DimensionSetup.tatooine;
    }
}
