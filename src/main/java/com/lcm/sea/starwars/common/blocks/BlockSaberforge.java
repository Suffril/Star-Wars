package com.lcm.sea.starwars.common.blocks;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import com.lcm.sea.starwars.common.utils.GuiHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSaberforge extends BlockContainer {

    public static final AxisAlignedBB BOX = new AxisAlignedBB(-0.9375,0,0, 1.9375, 1, 1);

    public BlockSaberforge() {
        super(Material.IRON);
        this.setTranslationKey("saberforge");
        this.setRegistryName("saberforge");

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySaberforge();
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.getTileEntity(pos) != null) {
            playerIn.openGui(StarWars.instance, GuiHandler.SABERFORGE, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOX;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return BOX;
    }
}
