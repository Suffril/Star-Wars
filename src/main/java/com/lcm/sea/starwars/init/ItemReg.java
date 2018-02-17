package com.lcm.sea.starwars.init;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.client.InitStages;
import com.lcm.sea.starwars.common.items.ItemBase;
import com.lcm.sea.starwars.common.items.ItemConsumeableBase;
import com.lcm.sea.starwars.common.items.ItemLightsaberBase;

import net.minecraft.item.EnumAction;
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
                new ItemBase("test"),
                new ItemConsumeableBase(4,true,"bantha_blaster",EnumAction.DRINK),
                new ItemLightsaberBase("saber_test")


        );

        if(StarWars.FML.getSide().isClient()){InitStages.items();}

    }


    private static void reg(IForgeRegistry<Item> reg, Item... items){
        for(Item item : items){
            ITEMS.add(item);
        }
        reg.registerAll(items);
    }

}
