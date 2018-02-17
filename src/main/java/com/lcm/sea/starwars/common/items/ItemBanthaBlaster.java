package com.lcm.sea.starwars.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemBanthaBlaster extends ItemFood {

	public ItemBanthaBlaster(int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName("banthablaster");
		setRegistryName("banthablaster");
		setCreativeTab(CreativeTabs.BREWING);
	}


}
