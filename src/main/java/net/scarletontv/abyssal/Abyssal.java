package net.scarletontv.abyssal;

import net.fabricmc.api.ModInitializer;

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

