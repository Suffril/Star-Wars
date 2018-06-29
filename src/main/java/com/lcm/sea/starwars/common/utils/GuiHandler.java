package com.lcm.sea.starwars.common.utils;

import com.lcm.sea.starwars.client.gui.GuiSaberforge;
import com.lcm.sea.starwars.common.container.ContainerSaberforge;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {

    public static final int SABERFORGE = 0;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case SABERFORGE:
                return new ContainerSaberforge(player, (TileEntitySaberforge)world.getTileEntity(new BlockPos(x,y,z)));
            default:
                return null;
        }
    }


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch(ID) {
            case SABERFORGE:
                return new GuiSaberforge(player, (TileEntitySaberforge)world.getTileEntity(new BlockPos(x,y,z)));
            default:
                return null;
        }
    }
}
