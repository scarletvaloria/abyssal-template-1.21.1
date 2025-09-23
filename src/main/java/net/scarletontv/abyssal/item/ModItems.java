package net.scarletontv.abyssal.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;

public class ModItems {
public static final Item HOLLOW_FRUIT = registerItem("hollow_fruit", new Item(new Item.Settings().food(ModFoodComponents.HOLLOW_FRUIT)));
public static final Item VOID_BLOOD_BUCKET = registerItem("void_blood_bucket", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Abyssal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Abyssal.LOGGER.info("Registering Mod Items for " + Abyssal.MOD_ID);

    }
}
