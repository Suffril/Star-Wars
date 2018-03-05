package com.lcm.sea.starwars.common.commands;

import com.lcm.sea.starwars.utils.SWTeleporter;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class CommandDimTravel extends CommandBase {

    @Override
    public String getName() {
        return "dt";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/dt <dimid>";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (args.length != 1) {
            throw new WrongUsageException(getUsage(sender));
        }
        if (sender instanceof EntityPlayer) {
            int dim;
            try {
                dim = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new WrongUsageException(getUsage(sender));
            }

            SWTeleporter.teleportToDimension((EntityPlayer) sender, dim, 0, 100,0);
        }
    }
}