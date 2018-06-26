package com.lcm.sea.starwars.common.items;

import com.lcm.sea.starwars.common.utils.NBTKeys;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKyberCrystal extends Item {

    private int colour;

    public ItemKyberCrystal(String name, int colour) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(1);
        this.colour = colour;
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        stack.getTagCompound().setInteger(NBTKeys.COLOUR, this.colour);
    }

    public int getColour() {
        return this.colour;
    }


}
