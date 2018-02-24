package com.lcm.sea.starwars.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(Material blockMaterialIn, MapColor blockMapColorIn, String name) {
        super(blockMaterialIn, blockMapColorIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
