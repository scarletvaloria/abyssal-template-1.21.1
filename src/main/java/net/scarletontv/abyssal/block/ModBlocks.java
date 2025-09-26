package net.scarletontv.abyssal.block;

import net.minecraft.block.*;
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
                    .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_LOG = registerBlock("empty_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM)));

    public static final Block STRIPPED_EMPTY_LOG = registerBlock("stripped_empty_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)));

    public static final Block EMPTY_STAIRS = registerBlock("empty_stairs",
    new StairsBlock(ModBlocks.EMPTY_PLANKS.getDefaultState(),
            AbstractBlock.Settings.create().strength(0.75f)
                    .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_SLAB = registerBlock("empty_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.75f)
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_BUTTON = registerBlock("empty_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.create().strength(0.75f).noCollision()
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_PRESSURE_PLATE = registerBlock("empty_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.75f)
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_FENCE = registerBlock("empty_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(0.75f)
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_FENCE_GATE = registerBlock("empty_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(0.75f)
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_DOOR = registerBlock("empty_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.75f).nonOpaque()
                            .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_TRAPDOOR = registerBlock("empty_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.75f).nonOpaque()
                    .sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block EMPTY_LEAVES = registerBlock("empty_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES)));

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
