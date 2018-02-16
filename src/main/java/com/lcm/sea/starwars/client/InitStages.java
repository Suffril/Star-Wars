package com.lcm.sea.starwars.client;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.init.ItemReg;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class InitStages {

    public static void items()
    {
        for (int i = 0; i < ItemReg.ITEMS.size(); i++) {
            Item item = ItemReg.ITEMS.get(i);
            ModelResourceLocation mrl = new ModelResourceLocation(StarWars.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
            ItemReg.ITEMS.clear();
            StarWars.logger.info("Finished adding model renders");
        }
    }

}
