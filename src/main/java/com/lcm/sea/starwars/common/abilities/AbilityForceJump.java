package com.lcm.sea.starwars.common.abilities;

import java.util.UUID;

import lucraft.mods.lucraftcore.superpowers.abilities.AbilityAttributeModifier;
import lucraft.mods.lucraftcore.util.attributes.LCAttributes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AbilityForceJump extends AbilityAttributeModifier {

    public AbilityForceJump(EntityPlayer player, UUID uuid, float factor, int operation) {
        super(player, uuid, factor, operation);
    }

    @Override
    public IAttribute getAttribute() {
        return LCAttributes.FALL_RESISTANCE;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void drawIcon(Minecraft mc, Gui gui, int x, int y) {
      //  mc.renderEngine.bindTexture(AcrossTheGalaxy.ICONS);
        gui.drawTexturedModalRect(x, y, 0, 0, 16, 16);
    }
}
