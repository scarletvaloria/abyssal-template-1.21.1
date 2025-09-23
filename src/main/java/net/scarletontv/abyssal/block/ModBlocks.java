package net.scarletontv.abyssal.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;

public class ModBlocks {
    public static final Block EMPTY_PLANKS = registerBlock("empty_planks",
            new Block(AbstractBlock.Settings.create().strength(0.75f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block EMPTY_WOOD = registerBlock("empty_wood",
            new Block(AbstractBlock.Settings.create().strength(0.75f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block EMPTY_LOG = registerBlock("empty_log",
            new Block(AbstractBlock.Settings.create().strength(0.75f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block EMPTY_LEAVES = registerBlock("empty_leaves",
            new Block(AbstractBlock.Settings.create().strength(0.1f)
                    .requiresTool().sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block EMPTINESS = registerBlock("emptiness",
            new Block(AbstractBlock.Settings.create().strength(-1)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ABYSSAL_FRACTURE = registerBlock("abyssal_fracture",
            new Block(AbstractBlock.Settings.create().strength(-1)
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

    }
}
