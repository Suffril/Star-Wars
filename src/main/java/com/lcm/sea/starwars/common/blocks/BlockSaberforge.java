package com.lcm.sea.starwars.common.blocks;

import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSaberforge extends BlockContainer {

    public BlockSaberforge() {
        super(Material.IRON);
        this.setUnlocalizedName("saberforge");
        this.setRegistryName("saberforge");

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySaberforge();
    }
}
