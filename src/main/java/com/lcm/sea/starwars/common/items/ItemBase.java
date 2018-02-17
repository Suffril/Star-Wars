package com.lcm.sea.starwars.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name, CreativeTabs tab)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
