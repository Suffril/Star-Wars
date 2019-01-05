package com.lcm.sea.starwars.common.items;

import com.lcm.sea.starwars.client.render.RenderLightsaber;
import com.lcm.sea.starwars.common.init.SWObjects;
import com.lcm.sea.starwars.common.utils.EnumSaberParts;
import com.lcm.sea.starwars.common.utils.NBTKeys;
import com.lcm.sea.starwars.common.utils.Utils;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
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
import java.util.List;

public class ItemLightsaberBase extends Item {

	public static float bladeLength;
	public static ItemKyberCrystal crystal;

	public ItemLightsaberBase(String name, float bladeLength, ItemSaberPart pommel, ItemSaberPart handle, ItemSaberPart emitter, ItemKyberCrystal crystal) {
		setMaxStackSize(1);

		this.setTranslationKey(name);
		this.setRegistryName(name);
		this.bladeLength = bladeLength;
		this.setTileEntityItemStackRenderer(new RenderLightsaber(pommel, handle, emitter, crystal));
		this.setFull3D();
		this.crystal = crystal;


		//For model animation
		addPropertyOverride(new ResourceLocation(NBTKeys.IGNITED), new IItemPropertyGetter() {
			@Override @SideOnly(Side.CLIENT) public float apply(ItemStack stack, @Nullable World world, @Nullable EntityLivingBase entityIn) {
				if (stack.getTagCompound() == null) {
					return 1.0F;
				} else
					return stack.getTagCompound().getBoolean(NBTKeys.IGNITED) ? 0.0F : 1.0F;
			}
		});
	}

	@Override public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

		ItemStack stack = player.getHeldItemMainhand();

		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
		}
		if(player.isSneaking()) {
			if (!stack.getTagCompound().getBoolean(NBTKeys.IGNITED)) {
				Utils.playSound(player, SWObjects.SoundEvents.SABER_IGNITE);
				stack.getTagCompound().setBoolean(NBTKeys.IGNITED, true);

			} else {
				Utils.playSound(player, SWObjects.SoundEvents.SABER_UNIGNITE);
				stack.getTagCompound().setBoolean(NBTKeys.IGNITED, false);

			}
		}

		return new ActionResult<>(EnumActionResult.PASS, player.getHeldItem(hand));
	}

	@Override public boolean onEntitySwing(EntityLivingBase player, ItemStack stack) {
		if (stack.getTagCompound() == null) {
			stack.setTagCompound(new NBTTagCompound());
			stack.getTagCompound().setBoolean(NBTKeys.IGNITED, false);
		}

		if (stack.getTagCompound().getBoolean(NBTKeys.IGNITED)) {
			//TO-DO Swinging sound

			Utils.playSound(player, SWObjects.SoundEvents.SABER_SWING);
		}

		return super.onEntitySwing(player, stack);
	}

	@Override public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if(stack.getTagCompound().getBoolean(NBTKeys.IGNITED) == true) {
			target.setHealth(target.getHealth() - 12);
		}

		return true;
	}

	@Override public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (stack.hasTagCompound()) {
			if (stack.getTagCompound().getFloat(NBTKeys.EXTENSION) < bladeLength && stack.getTagCompound().getBoolean(NBTKeys.IGNITED) == true) {
				stack.getTagCompound().setFloat(NBTKeys.EXTENSION, stack.getTagCompound().getFloat(NBTKeys.EXTENSION) + 0.1F);
				//System.out.println(stack.getTagCompound().getFloat(NBTKeys.EXTENSION));
			}

			if (stack.getTagCompound().getFloat(NBTKeys.EXTENSION) > 0 && stack.getTagCompound().getBoolean(NBTKeys.IGNITED) == false) {
				stack.getTagCompound().setFloat(NBTKeys.EXTENSION, stack.getTagCompound().getFloat(NBTKeys.EXTENSION) - 0.1F);
				//System.out.println(stack.getTagCompound().getFloat(NBTKeys.EXTENSION));
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("An elegant weapon for a more civilized age");
	}

	public static ItemKyberCrystal getCrystal() {
		return crystal;
	}

}
