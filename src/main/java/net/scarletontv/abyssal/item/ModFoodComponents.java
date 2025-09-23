package net.scarletontv.abyssal.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ModFoodComponents {
    public static final FoodComponent HOLLOW_FRUIT = new FoodComponent.Builder().nutrition(4).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1), 1.0F).build();
}
