package net.scarletontv.abyssal.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scarletontv.abyssal.Abyssal;

public class ModItems {
    public static final Item HOLLOW_FRUIT = registerItem("hollow_fruit", new Item(new Item.Settings().food(ModFoodComponents.HOLLOW_FRUIT)));
public static final Item DUSKBLADE = registerItem("duskblade",
        new DuskbladeItem(ModToolMaterials.ABYSSAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ABYSSAL, 661, -2.4f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Abyssal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Abyssal.LOGGER.info("Registering Mod Items for " + Abyssal.MOD_ID);

    }
}
