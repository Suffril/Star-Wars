package com.lcm.sea.starwars.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEatableBase extends ItemFood {

	EnumAction action;
	String regName;

	public ItemEatableBase(int amount, boolean isWolfFood, String regName, EnumAction action) {
		super(amount, isWolfFood);
		setTranslationKey(regName);
		setRegistryName(regName);
		setCreativeTab(CreativeTabs.BREWING);
		this.action = action;
		this.regName = regName;
	}

	@Override protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (regName.equals("bantha_blaster")) {
			if (!worldIn.isRemote) {
				player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 500));
			}
		}
		super.onFoodEaten(stack, worldIn, player);
	}

	@Override public EnumAction getItemUseAction(ItemStack stack) {
		return action;
	}

}
