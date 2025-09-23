package net.scarletontv.abyssal;

import net.fabricmc.api.ModInitializer;

import net.scarletontv.abyssal.block.ModBlocks;
import net.scarletontv.abyssal.item.ModItemGroups;
import net.scarletontv.abyssal.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abyssal implements ModInitializer {
	public static final String MOD_ID = "abyssal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}