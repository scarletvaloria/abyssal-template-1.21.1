package net.scarletontv.abyssal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.scarletontv.abyssal.block.ModBlocks;
import net.scarletontv.abyssal.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMPTY_WOOD);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMPTY_PLANKS);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMPTINESS);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMPTY_LEAVES);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ABYSSAL_FRACTURE);
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMPTY_LOG);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
itemModelGenerator.register(ModItems.HOLLOW_FRUIT, Models.GENERATED);
itemModelGenerator.register(ModItems.VOID_BLOOD_BUCKET, Models.GENERATED);
    }
}
