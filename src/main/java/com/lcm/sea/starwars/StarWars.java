package com.lcm.sea.starwars;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = StarWars.MODID, name = StarWars.NAME, version = StarWars.VERSION)
public class StarWars
{
    public static final String MODID = "lcm-star-wars";
    public static final String NAME = "Star Wars";
    public static final String VERSION = "1.1";

    public static FMLCommonHandler FML = FMLCommonHandler.instance();

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
