package com.lcm.sea.starwars.common.superpower.force_sensitive;

import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import lucraft.mods.lucraftcore.superpowers.capabilities.ISuperpowerCapability;
import lucraft.mods.lucraftcore.superpowers.keys.AbilityKeys;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class ForceSensitiveHandler extends SuperpowerPlayerHandler {

    public ForceSensitiveHandler(ISuperpowerCapability cap, Superpower superpower) {
        super(cap, superpower);
    }

    @Override
    public Ability getAbilityForKey(AbilityKeys key) {
        return super.getAbilityForKey(key);
    }

    @Override
    public void onUpdate(Phase phase) {
        super.onUpdate(phase);
    }

}
