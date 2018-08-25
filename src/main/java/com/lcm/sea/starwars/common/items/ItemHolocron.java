package com.lcm.sea.starwars.common.items;

import com.lcm.sea.starwars.client.render.RenderHolocron;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemHolocron extends Item {

    public ItemHolocron(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setTileEntityItemStackRenderer(new RenderHolocron());
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {



        return new ActionResult<>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
