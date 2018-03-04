package com.lcm.sea.starwars.common.superpower;

import java.awt.Color;
import java.util.List;
import java.util.UUID;


import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.common.abilities.AbilityForceJump;
import lucraft.mods.lucraftcore.superpowers.Superpower;
import lucraft.mods.lucraftcore.superpowers.SuperpowerHandler;
import lucraft.mods.lucraftcore.superpowers.SuperpowerPlayerHandler;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import lucraft.mods.lucraftcore.superpowers.capabilities.ISuperpowerCapability;
import lucraft.mods.lucraftcore.superpowers.gui.GuiCustomizer;
import lucraft.mods.lucraftcore.superpowers.items.SuperpowerItems.InjectionSuperpower;
import lucraft.mods.lucraftcore.superpowers.render.SuperpowerRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SuperPowerForce extends Superpower {

    public static final SuperPowerForce INSTANCE = new SuperPowerForce();

    public SuperPowerForce() {
        super("force_sensitive");
        this.setRegistryName(StarWars.MODID, "force_sensitive");
    }

    @Override
    public SuperpowerPlayerHandler getNewSuperpowerHandler(ISuperpowerCapability iSuperpowerCapability) {
        ForceSensitiveHandler handler = SuperpowerHandler.getSpecificSuperpowerPlayerHandler(iSuperpowerCapability.getPlayer(), ForceSensitiveHandler.class);
        return (handler == null) ? new ForceSensitiveHandler(iSuperpowerCapability, this) : handler;
    }

    @Override
    protected List<Ability> addDefaultAbilities(EntityPlayer player, List<Ability> list) {
        UUID uuid = UUID.fromString("885fa2e6-1fdf-11e8-b467-0ed5f89f718b");

        list.add(new AbilityForceJump(player, uuid, 2.0f, 0));


        return list;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public SuperpowerRenderer.ISuperpowerRenderer getPlayerRenderer() {
       return null;
    }

    @Override
    public boolean canCustomize() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public GuiCustomizer getCustomizerGui(EntityPlayer player) {
        //return new GuiRegenCustomizer();
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public GuiScreen getAbilityGui(EntityPlayer player) {
        //return new GuiTimelordPowerTab(player);
        return null;
    }

    @Override
    public void renderIcon(Minecraft mc, Gui gui, int x, int y) {
        float zLevel = Minecraft.getMinecraft().getRenderItem().zLevel;
        Minecraft.getMinecraft().getRenderItem().zLevel = -100.5F;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, 0);
        GlStateManager.scale(2, 2, 1);
       //Minecraft.getMinecraft().getRenderItem().renderItemIntoGUI(new ItemStack(ATGObjects.Items.chameleonArch), 0, 0);
        GlStateManager.popMatrix();
        Minecraft.getMinecraft().getRenderItem().zLevel = zLevel;
    }

    @Override
    public NBTTagCompound getDefaultStyleTag() {
        NBTTagCompound nbt = new NBTTagCompound();
        return nbt;
    }

    @Override
    public int getCapsuleColor() {
        return Color.green.getRGB();
    }

    public static class Injection extends InjectionSuperpower {

        public Injection() {
            super(SuperPowerForce.INSTANCE);
        }

        @Override
        public ItemStack inject(EntityPlayer player, ItemStack stack) {
            super.inject(player, stack);
            ForceSensitiveHandler handler = SuperpowerHandler.getSpecificSuperpowerPlayerHandler(player, ForceSensitiveHandler.class);
            SuperpowerHandler.syncToAll(player);
            return stack;
        }

    }

}
