package net.scarletontv.abyssal.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.scarletontv.abyssal.Abyssal;
import net.scarletontv.abyssal.index.ModSounds;

import static net.acoyt.acornlib.api.util.ItemUtils.modifyItemNameColor;

public class ModItems {
    public static final Item HOLLOW_FRUIT = registerItem("hollow_fruit", new Item(new Item.Settings().food(ModFoodComponents.HOLLOW_FRUIT)));
public static final Item DUSKBLADE = registerItem("duskblade",
        new DuskbladeItem(ModToolMaterials.ABYSSAL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ABYSSAL, 661, -2.4f))));

    public static final Item ULTRASONIC_FAITH_DISC = registerItem("ultrasonic_faith_music_disc",
            new Item(
                    new Item.Settings()
                            .jukeboxPlayable(ModSounds.ULTRASONIC_FAITH_KEY)
                            .maxCount(1)
                            .rarity(Rarity.RARE)
            ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Abyssal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        modifyItemNameColor(DUSKBLADE, 0x8B0000);

        Abyssal.LOGGER.info("Registering Mod Items for " + Abyssal.MOD_ID);

    }
}
