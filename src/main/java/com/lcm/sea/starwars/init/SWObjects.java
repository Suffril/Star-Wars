package com.lcm.sea.starwars.init;

import com.lcm.sea.starwars.StarWars;
import com.lcm.sea.starwars.common.items.ItemBanthaBlaster;
import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nictogen on 2/18/18
 */
@Mod.EventBusSubscriber
@SuppressWarnings({"unused"})
public class SWObjects
{
    public static class Items {
        public static final Item banthaBlaster = new ItemBanthaBlaster(4,true);
    }

    public static class Blocks
    {

    }

    public static class SoundEvents
    {
        public static final SoundEvent SABER_IGNITE = new SoundEvent(new ResourceLocation(StarWars.MODID, "saber_engage")).setRegistryName(StarWars.MODID, "saber_engage");
        public static final SoundEvent SABER_UNIGNITE = new SoundEvent(new ResourceLocation(StarWars.MODID, "saber_disengage")).setRegistryName(StarWars.MODID, "saber_disengagey");
    }

    public static class EntityEntries
    {
        // public static final EntityEntry example = EntityEntryBuilder.create().id(new ResourceLocation(StarWars.MODID, "NAME"), ID_NUMBER).name("NAME");
    }
    

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @SubscribeEvent
    public static void registerObjects(RegistryEvent event) throws Exception
    {
        if (event instanceof RegistryEvent.Register)
        {
            IForgeRegistry registry = ((RegistryEvent.Register) event).getRegistry();

            for (Class<?> aClass : SWObjects.class.getDeclaredClasses())
            {
                if (Arrays.stream(aClass.getDeclaredFields()).anyMatch(field -> registry.getRegistrySuperType().isAssignableFrom(field.getType())))
                {
                    ArrayList<IForgeRegistryEntry> entries = new ArrayList<>();

                    for (Field field : aClass.getDeclaredFields())
                    {
                        try
                        {
                            entries.add((IForgeRegistryEntry) field.get(null));
                        }
                        catch (IllegalAccessException e)
                        {
                            e.printStackTrace();
                        }
                    }

                    if (Arrays.stream(aClass.getDeclaredFields()).anyMatch(field -> Item.class.isAssignableFrom(field.getType())))
                    {
                        for (Field f : Blocks.class.getDeclaredFields())
                        {
                            Block block = (Block) f.get(null);
                            entries.add(new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName()));
                        }
                    }
                    entries.forEach(registry::register);
                }
            }
        }
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent e) throws ReflectiveOperationException
    {
        for (Field f : Items.class.getDeclaredFields())
        {
            Item item = (Item) f.get(null);
            ModelResourceLocation loc = new ModelResourceLocation(item.getRegistryName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, 0, loc);
        }

        for (Field f : Blocks.class.getDeclaredFields())
        {
            Block block = (Block) f.get(null);
            Item item = Item.getItemFromBlock(block);
            ModelResourceLocation loc = new ModelResourceLocation(item.getRegistryName(), "inventory");
            ModelLoader.setCustomModelResourceLocation(item, 0, loc);
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onModelBake(ModelBakeEvent e)
    {
        for (ModelResourceLocation loc : e.getModelRegistry().getKeys())
        {

        }
    }
}