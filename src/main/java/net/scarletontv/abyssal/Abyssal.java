package net.scarletontv.abyssal;

import com.sun.jdi.VoidType;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.DamageTypeTags;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.block.ModBlocks;
import net.scarletontv.abyssal.item.ModItemGroups;
import net.scarletontv.abyssal.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abyssal implements ModInitializer {
	public static final String MOD_ID = "abyssal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    public static Identifier id (String path){
        return Identifier.of(MOD_ID, path);
    }

    @Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        StrippableBlockRegistry.register(ModBlocks.EMPTY_LOG, ModBlocks.STRIPPED_EMPTY_LOG);
	}
}


