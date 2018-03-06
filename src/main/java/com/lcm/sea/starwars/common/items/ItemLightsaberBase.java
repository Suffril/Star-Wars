package com.lcm.sea.starwars.common.items;

import com.lcm.sea.starwars.common.init.SWObjects;
import com.lcm.sea.starwars.common.utils.Utils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ItemLightsaberBase extends Item {

	public ItemLightsaberBase(String name) {
		setMaxStackSize(1);

		this.setUnlocalizedName(name);
		this.setRegistryName(name);

		//For model animation
		addPropertyOverride(new ResourceLocation("ignited"), new IItemPropertyGetter() {
			@Override @SideOnly(Side.CLIENT) public float apply(ItemStack stack, @Nullable World world, @Nullable EntityLivingBase entityIn) {
				if (stack.getTagCompound() == null) {
					return 1.0F;
				} else
					return stack.getTagCompound().getBoolean("ignited") ? 0.0F : 1.0F;
			}
		});
	}

	@Override public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

		ItemStack stack = player.getHeldItemMainhand();

		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
		}

		if (!stack.getTagCompound().getBoolean("ignited")) {
			Utils.playSound(player, SWObjects.SoundEvents.SABER_IGNITE);
			stack.getTagCompound().setBoolean("ignited", true);
		} else {
			Utils.playSound(player, SWObjects.SoundEvents.SABER_UNIGNITE);
			stack.getTagCompound().setBoolean("ignited", false);
		}

		return new ActionResult<>(EnumActionResult.PASS, player.getHeldItem(hand));
	}

	@Override public boolean onEntitySwing(EntityLivingBase player, ItemStack stack) {
		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setBoolean("ignited", false);
		}

		if (stack.getTagCompound().getBoolean("ignited")) {
			//TO-DO Swinging sound
		}

		return super.onEntitySwing(player, stack);
	}

}
