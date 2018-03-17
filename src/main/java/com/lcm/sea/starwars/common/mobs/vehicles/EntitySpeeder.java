package com.lcm.sea.starwars.common.mobs.vehicles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class EntitySpeeder extends EntityAnimal {
    
    public EntitySpeeder(World world) {
        super(world);
        setSize(2F, 1.5F);
    }
    
    @Override
    public boolean canBePushed() {
        return true;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1000.0D);
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        player.rotationYaw = rotationYaw;
        player.rotationPitch = rotationPitch;

        if (!world.isRemote) {
            player.startRiding(this);
        }
        return true;
    }


    @Override
    protected boolean canFitPassenger(Entity passenger) {
        return getPassengers().size() < 2;
    }

    @Override
    public boolean canBeSteered() {
        Entity entity = getControllingPassenger();
        return entity instanceof EntityLivingBase;
    }

    @Override
    public void travel(float strafe, float forward, float unused) {
        if (isBeingRidden() && canBeSteered()) {
            EntityLivingBase entitylivingbase = (EntityLivingBase) getControllingPassenger();
            prevRotationYaw = rotationYaw = entitylivingbase.rotationYaw;
            rotationPitch = entitylivingbase.rotationPitch * 0.5F;
            setRotation(rotationYaw, rotationPitch);
            rotationYawHead = renderYawOffset = rotationYaw;
            strafe = entitylivingbase.moveStrafing * 0.5F;
            forward = entitylivingbase.moveForward;

            if (forward <= 0.0F) {
                forward *= 0.25F;
            }

            stepHeight = 1.0F;
            jumpMovementFactor = 0.1F;

            if (canPassengerSteer()) {
                setAIMoveSpeed((float) getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
                super.travel(strafe, 0.0F, forward);
            } else if (entitylivingbase instanceof EntityPlayer) {
                motionX = 0.0D;
                motionY = 0.0D;
                motionZ = 0.0D;
            }

            prevLimbSwingAmount = limbSwingAmount;
            double d1 = posX - prevPosX;
            double d0 = posZ - prevPosZ;
            float f2 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;

            if (f2 > 1.0F) {
                f2 = 1.0F;
            }

            limbSwingAmount += (f2 - limbSwingAmount) * 0.4F;
            limbSwing += limbSwingAmount;
        } else {
            stepHeight = 0.0F;
            jumpMovementFactor = 0.00F;
            super.travel(strafe, 0.0F, forward);
        }
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    @Override
    public void updatePassenger(Entity passenger) {
        if (isPassenger(passenger)) {
            float f = 0.0F;
            float f1 = (float) ((isDead ? 0.009999999776482582D : getMountedYOffset()) + passenger.getYOffset());

            if (getPassengers().size() > 1) {
                int i = getPassengers().indexOf(passenger);

                if (!(i == 0)) {
                    f = -1F;
                }

                if (passenger instanceof EntityAnimal) {
                    f = (float) (f + 0.2D);
                }
            }

            Vec3d vec3d = (new Vec3d(f, 0.0D, 0.0D)).rotateYaw(-rotationYaw * 0.017453292F - ((float) Math.PI / 2F));
            passenger.setPosition(posX + vec3d.x, posY + f1, posZ + vec3d.z);
            if(FMLCommonHandler.instance().getSide().isClient()) {
                applyOrientationToEntity(passenger);
            }

            if (passenger instanceof EntityAnimal && getPassengers().size() > 1) {
                int j = passenger.getEntityId() % 2 == 0 ? 90 : 270;
                passenger.setRenderYawOffset(((EntityAnimal) passenger).renderYawOffset + j);
                passenger.setRotationYawHead(passenger.getRotationYawHead() + j);
            }
        }
    }


    @Override
    protected boolean canTriggerWalking() {
        return false;
    }

    @Override
    public double getMountedYOffset() {
        return 0.6D;
    }

    @Override
    public Entity getControllingPassenger() {
        return getPassengers().isEmpty() ? null : getPassengers().get(0);
    }
}