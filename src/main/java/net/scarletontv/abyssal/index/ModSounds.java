package net.scarletontv.abyssal.index;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;


public class ModSounds {

    public static final SoundEvent ULTRASONIC_FAITH = registerSoundEvent("ultrasonic_faith");
    public static final RegistryKey<JukeboxSong> ULTRASONIC_FAITH_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Abyssal.MOD_ID, "ultrasonic_faith"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Abyssal.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Abyssal.LOGGER.info("Registering Mod Sounds for " + Abyssal.MOD_ID);
    }
}
