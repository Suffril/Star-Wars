package com.lcm.sea.starwars.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	/**
	 * This item is basically just an outline for the rest
	 */

	public ItemBase(String name, CreativeTabs tab) {
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}

	public ItemBase(String name) {
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
	}
}
