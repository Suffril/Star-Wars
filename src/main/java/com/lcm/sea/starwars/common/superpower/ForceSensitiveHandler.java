package com.lcm.sea.starwars.common.superpower;

import java.util.ArrayList;
import java.util.stream.Collectors;

import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import lucraft.mods.lucraftcore.superpowers.capabilities.CapabilitySuperpower;
import lucraft.mods.lucraftcore.superpowers.capabilities.ISuperpowerCapability;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class ForceSensitiveHandler extends SuperpowerPlayerHandler {

    public ForceSensitiveHandler(ISuperpowerCapability cap, Superpower superpower) {
        super(cap, superpower);
    }

    @Override
    public void onUpdate(TickEvent.Phase phase) {
        if (phase.equals(TickEvent.Phase.END)) return;

        EntityPlayer player = cap.getPlayer();

    }

    @Override
    public void onApplyPower() {
        this.getAbilities().clear();
        SuperPowerForce.INSTANCE.addDefaultAbilities(this.getPlayer(), this.getAbilities());
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound = super.writeToNBT(compound);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);;

        ArrayList<Ability> abilities = new ArrayList<>();
        abilities.addAll(getAbilities());

        this.getAbilities().addAll(abilities);
    }
}
