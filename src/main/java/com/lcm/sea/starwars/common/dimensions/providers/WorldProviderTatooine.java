package com.lcm.sea.starwars.common.dimensions.providers;

import com.lcm.sea.starwars.common.dimensions.DimensionSetup;
import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderTatooine extends WorldProvider {

	public WorldProviderTatooine() {
		this.biomeProvider = new BiomeProviderSingle(Biomes.DESERT);
	}

	@Override public DimensionType getDimensionType() {
		return DimensionSetup.tatooine;
	}

	@Override public IChunkGenerator createChunkGenerator() {
		return super.createChunkGenerator();
	}
}
