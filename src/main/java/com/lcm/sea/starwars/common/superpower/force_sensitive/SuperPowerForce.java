package com.lcm.sea.starwars.common.superpower.force_sensitive;

import java.util.List;
import java.util.UUID;

import com.lcm.sea.starwars.StarWars;
import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import lucraft.mods.lucraftcore.superpowers.abilities.AbilityFallResistance;
import lucraft.mods.lucraftcore.superpowers.abilities.AbilityHealing;
import lucraft.mods.lucraftcore.superpowers.abilities.AbilityJumpBoost;
import lucraft.mods.lucraftcore.superpowers.abilities.AbilitySprint;
import lucraft.mods.lucraftcore.superpowers.capabilities.ISuperpowerCapability;
import lucraft.mods.lucraftcore.superpowers.render.SuperpowerRenderer.ISuperpowerRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(modid = StarWars.MODID)
public class SuperPowerForce extends Superpower {

    public static SuperPowerForce force_sensitive = new SuperPowerForce();

    @SideOnly(Side.CLIENT)
    private ForceSensitiveRenderer renderer = new ForceSensitiveRenderer();


    public SuperPowerForce() {
        super("force_sensitive");
        this.setRegistryName(StarWars.MODID, "force_sensitive");
    }

    @Override
    public SuperpowerPlayerHandler getNewSuperpowerHandler(ISuperpowerCapability cap) {
        return new ForceSensitiveHandler(cap, this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ISuperpowerRenderer getPlayerRenderer() {
        return renderer;
    }

    @Override
    public boolean canLevelUp() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void renderIcon(Minecraft mc, Gui gui, int x, int y) {

    }

    public UUID uuid = UUID.fromString("f1a375cb-327d-4103-89ba-479511c4062b");

    @Override
    public List<Ability> addDefaultAbilities(EntityPlayer player, List<Ability> list) {
        list.add(new AbilitySprint(player, uuid, 0.1F).setUnlocked(true));
        list.add(new AbilityHealing(player, 20, 2).setUnlocked(true));
        list.add(new AbilityJumpBoost(player, uuid, 3.5F, 1).setUnlocked(true));
        list.add(new AbilityFallResistance(player, uuid, 3, 0).setUnlocked(true));
        System.out.println(list);
        System.out.println("jedi!?!?!");
        return super.addDefaultAbilities(player, list);
    }

}
