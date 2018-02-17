package com.lcm.sea.starwars.init;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.client.InitStages;
import com.lcm.sea.starwars.common.ItemBanthaBlaster;
import com.lcm.sea.starwars.common.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@GameRegistry.ObjectHolder(StarWars.MODID)
@Mod.EventBusSubscriber
public class ItemReg {

    public static List<Item> ITEMS = new ArrayList<>();

    public static final Item TEST = null;

    @SubscribeEvent
    public static final void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> reg = event.getRegistry();

        reg(reg,
                //Bullet
                new ItemBase("test"),
                new ItemBanthaBlaster(4,true));

        if(StarWars.FML.getSide().isClient()){InitStages.items();}

    }


    private static void reg(IForgeRegistry<Item> reg, Item... items){
        for(Item item : items){
            ITEMS.add(item);
        }
        reg.registerAll(items);
    }

}
