package com.lcm.sea.starwars.common.superpower.forcesensitive;

import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.capabilities.ISuperpowerCapability;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class ForceSensitiveHandler extends SuperpowerPlayerHandler {

	public ForceSensitiveHandler(ISuperpowerCapability cap, Superpower superpower) {
		super(cap, superpower);
	}

	@Override public void onUpdate(Phase phase) {
		super.onUpdate(phase);
	}


}
