package com.lcm.sea.starwars.common.superpower.forcesensitive;

import com.lcm.sea.starwars.StarWars;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import lucraft.mods.lucraftcore.superpowers.abilities.AbilityEnergyBlast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.UUID;

@Mod.EventBusSubscriber(modid = StarWars.MODID) public class SuperpowerSith extends SuperpowerForceSensitive {

    public static final SuperpowerSith INSTANCE = new SuperpowerSith();

    private UUID uuid = UUID.fromString("f1a375cb-327d-4103-89ba-479511c4062d");

    public SuperpowerSith() {
        super("sith");
    }

    @Override
    public List<Ability> addDefaultAbilities(EntityPlayer player, List<Ability> list) {
        return super.addDefaultAbilities(player, list);
    }


}
