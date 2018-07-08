package com.lcm.sea.starwars;

import com.lcm.sea.starwars.client.events.RenderingEvents;
import com.lcm.sea.starwars.common.commands.CommandDimTravel;
import com.lcm.sea.starwars.common.dimensions.DimensionSetup;
import com.lcm.sea.starwars.common.init.SWObjects;
import com.lcm.sea.starwars.common.tileEntities.TileEntitySaberforge;
import com.lcm.sea.starwars.common.utils.GuiHandler;
import com.lcm.sea.starwars.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = StarWars.MODID, name = StarWars.NAME, version = StarWars.VERSION, dependencies = "required:forge@[14.23.1.2574,); required-after:lucraftcore@[1.12-2.0.4,)", acceptedMinecraftVersions = "1.12, 1.12.1, 1.12.2") public class StarWars {
	public static final String MODID = "lcm-star-wars";
	public static final String NAME = "Star Wars";
	public static final String VERSION = "1.1";

	public static FMLCommonHandler FML = FMLCommonHandler.instance();

	public static Logger logger;

	@Mod.Instance(StarWars.MODID)
	public static StarWars instance;

	@SidedProxy(clientSide = "com.lcm.sea.starwars.proxy.ClientProxy", serverSide = "com.lcm.starwars.proxy.CommonProxy") public static CommonProxy proxy;

	@EventHandler public static void serverStart(FMLServerStartingEvent e) {
		e.registerServerCommand(new CommandDimTravel());
	}

	@EventHandler public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.registerEntityRenderers();
		if(FML.getSide().isClient())
		{
			MinecraftForge.EVENT_BUS.register(new RenderingEvents());
		}
		GameRegistry.registerTileEntity(TileEntitySaberforge.class, SWObjects.Blocks.saberForge.getRegistryName().toString());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}

	@EventHandler public void init(FMLInitializationEvent event) {
		proxy.init();
		DimensionSetup.init();

	}
}
