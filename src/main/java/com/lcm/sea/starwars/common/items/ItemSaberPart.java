package com.lcm.sea.starwars.common.items;

import com.lcm.sea.starwars.client.models.item.SaberParts.ModelLightsaberPart;
import com.lcm.sea.starwars.common.utils.EnumSaberParts;
import net.minecraft.item.Item;

public class ItemSaberPart extends Item {

    private ModelLightsaberPart model;
    private EnumSaberParts type;

    public ItemSaberPart(String name, ModelLightsaberPart model, EnumSaberParts type) {
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.model = model;
        this.type = type;
    }

    public ModelLightsaberPart getModel() {
        return model;
    }

    public EnumSaberParts getType() {
        return type;
    }
}
