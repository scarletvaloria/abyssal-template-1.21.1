package net.scarletontv.abyssal.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;

public class ModBlocks {
    public static final Block EMPTY_PLANKS = registerBlock("empty_planks",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block EMPTINESS = registerBlock("emptiness",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Abyssal.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Abyssal.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Abyssal.LOGGER.info("Registering Mod Blocks for" + Abyssal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.EMPTY_PLANKS);
            entries.add(ModBlocks.EMPTINESS);
        });
    }
}
