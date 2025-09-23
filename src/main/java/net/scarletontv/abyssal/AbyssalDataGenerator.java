package net.scarletontv.abyssal;


import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.scarletontv.abyssal.datagen.ModBlockTagProvider;
import net.scarletontv.abyssal.datagen.ModLootTableProvider;
import net.scarletontv.abyssal.datagen.ModModelProvider;
import net.scarletontv.abyssal.datagen.ModRecipeProvider;

public class  AbyssalDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider((ModModelProvider::new));
        pack.addProvider(ModRecipeProvider::new);
    }
}
