package com.lcm.sea.starwars.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }

    public BlockBase(Material materialIn) {
        super(materialIn);
    }
}
