package net.scarletontv.abyssal.index;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.scarletontv.abyssal.Abyssal;

public interface ModDamageTypes {
    RegistryKey<DamageType> ABYSS_KILL = of("abyss_damage");
    RegistryKey<DamageType> ORCHID_KILL = of("orchid_damage");

    static DamageSource abyssal_kill(LivingEntity entity) {
        return entity.getDamageSources().create(ABYSS_KILL); }
    static DamageSource orchid_damage(LivingEntity entity) {
        return entity.getDamageSources().create(ORCHID_KILL); }

    private static RegistryKey<DamageType> of(String name) {
        return RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Abyssal.id(name));
    }
}

