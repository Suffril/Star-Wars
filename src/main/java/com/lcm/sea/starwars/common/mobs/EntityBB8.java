package com.lcm.sea.starwars.common.mobs;

import com.lcm.sea.starwars.common.init.SWObjects;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBB8 extends EntityTameable {

	private SoundEvent[] bb8Sounds = new SoundEvent[] { SWObjects.SoundEvents.BB8_0, SWObjects.SoundEvents.BB8_1, SWObjects.SoundEvents.BB8_2, SWObjects.SoundEvents.BB8_3, SWObjects.SoundEvents.BB8_4 };

	public EntityBB8(World world) {
		super(world);
		setSize(0.6F, 0.85F);
	}

	@Nullable @Override public EntityAgeable createChild(EntityAgeable ageable) {
		return new EntityBB8(world);
	}

	@Override public boolean processInteract(EntityPlayer player, EnumHand hand) {
		ItemStack itemstack = player.getHeldItemMainhand();

		if (!this.isTamed() && itemstack.getItem() == SWObjects.Items.temp) {
			if (!player.capabilities.isCreativeMode) {
				itemstack.shrink(1);
			}

			if (!this.world.isRemote) {
				if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player)) {
					this.setTamedBy(player);
					this.navigator.clearPath();
					this.setAttackTarget((EntityLivingBase) null);
					this.aiSit.setSitting(true);
					this.setHealth(20.0F);
					this.playTameEffect(true);
					this.world.setEntityState(this, (byte) 7);
				} else {
					this.playTameEffect(false);
					this.world.setEntityState(this, (byte) 6);
				}
			}

			return true;
		}

		return super.processInteract(player, hand);
	}

	@Override protected void initEntityAI() {
		tasks.addTask(6, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		tasks.addTask(8, new EntityAIWanderAvoidWater(this, 1.0D));
		tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
		targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
	}

	@Override protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);

		if (isTamed()) {
			getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		} else {
			getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		}

		getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
	}

	@Override protected SoundEvent getAmbientSound() {
		return bb8Sounds[rand.nextInt(bb8Sounds.length)];
	}

	@Override protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SWObjects.SoundEvents.BB8_HURT;
	}

	@Override protected SoundEvent getDeathSound() {
		return SWObjects.SoundEvents.BB8_DEAD;
	}

}
