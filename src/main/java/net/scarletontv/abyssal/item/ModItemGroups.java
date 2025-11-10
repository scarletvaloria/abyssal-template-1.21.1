package net.scarletontv.abyssal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;
import net.scarletontv.abyssal.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ABYSSAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Abyssal.MOD_ID, "abyssal_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.EMPTINESS))
                    .displayName(Text.translatable("itemgroup.abyssal.abyssal_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HOLLOW_FRUIT);
                        entries.add(ModItems.DUSKBLADE);
                        entries.add(ModBlocks.EMPTY_PLANKS);
                        entries.add(ModBlocks.EMPTINESS);
                        entries.add(ModBlocks.EMPTY_LEAVES);
                        entries.add(ModBlocks.EMPTY_LOG);
                        entries.add(ModBlocks.EMPTY_DOOR);
                        entries.add(ModBlocks.EMPTY_BUTTON);
                        entries.add(ModBlocks.EMPTY_FENCE);
                        entries.add(ModBlocks.EMPTY_FENCE_GATE);
                        entries.add(ModBlocks.EMPTY_PRESSURE_PLATE);
                        entries.add(ModBlocks.EMPTY_SLAB);
                        entries.add(ModBlocks.EMPTY_STAIRS);
                        entries.add(ModBlocks.EMPTY_TRAPDOOR);
                        entries.add(ModBlocks.STRIPPED_EMPTY_LOG);
                        entries.add(ModBlocks.ABYSSAL_FRACTURE);
                        entries.add(ModItems.ULTRASONIC_FAITH_DISC);


                    }).build());




    public static void registerItemGroups() {
        Abyssal.LOGGER.info("Registering Item Groups for " + Abyssal.MOD_ID);
    }
}
