package net.scarletontv.abyssal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.scarletontv.abyssal.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
            getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                    .add(ModBlocks.EMPTY_LOG)
                    .add(ModBlocks.EMPTY_PLANKS)
                    .add(ModBlocks.EMPTY_WOOD);

            getOrCreateTagBuilder(BlockTags.LEAVES)
                    .add(ModBlocks.EMPTY_LEAVES);

            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                    .add(ModBlocks.EMPTY_LEAVES);
    }
}
