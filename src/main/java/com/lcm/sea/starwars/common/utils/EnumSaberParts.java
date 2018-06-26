package com.lcm.sea.starwars.common.utils;

import com.lcm.sea.starwars.client.models.item.SaberParts.Emitter;
import com.lcm.sea.starwars.client.models.item.SaberParts.Handle;
import com.lcm.sea.starwars.client.models.item.SaberParts.ModelLightsaberPart;
import com.lcm.sea.starwars.client.models.item.SaberParts.Pommel;
import net.minecraft.client.model.ModelBase;

public enum EnumSaberParts {

    EMITTER(new Emitter()), HANDLE(new Handle()), POMMEL(new Pommel());

    private ModelLightsaberPart model;

    EnumSaberParts(ModelLightsaberPart model) {
        this.model = model;
    }

    public ModelLightsaberPart getModel() {
        return this.model;
    }
}
