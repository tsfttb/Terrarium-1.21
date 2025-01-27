package net.tsfttb.terrarium.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tsfttb.terrarium.Terrarium;

public class ModItems {
    public static final Item TITANIUM_ORE = registerItem("titanium_ore", new Item(new Item.Settings()));
    public static final Item TITANIUM_BAR = registerItem("titanium_bar", new Item(new Item.Settings()));
    public static final Item IRON_BAR = registerItem("iron_bar", new Item(new Item.Settings()));
    public static final Item COPPER_BAR = registerItem("copper_bar", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item)  {
        return Registry.register(Registries.ITEM, Identifier.of(Terrarium.MOD_ID, name), item);
    }

    public static void registeredModItems() {
        Terrarium.LOGGER.info("Registering Mod Items for" + Terrarium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TITANIUM_ORE);
            entries.add(TITANIUM_BAR);
            entries.add(IRON_BAR);
            entries.add(COPPER_BAR);
        });
    }
}