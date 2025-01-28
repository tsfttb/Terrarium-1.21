package net.tsfttb.terrarium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tsfttb.terrarium.Terrarium;
import net.tsfttb.terrarium.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TERRARIUM_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Terrarium.MOD_ID, "terrarium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TITANIUM_BAR))
                    .displayName(Text.translatable("itemgroup.terrarium.terrarium_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_BAR);

                    }).build());

    public static final ItemGroup TERRARIUM_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Terrarium.MOD_ID, "terrarium_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TITANIUM_ORE))
                    .displayName(Text.translatable("itemgroup.terrarium.terrarium_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.TITANIUM_BLOCK);

                    }).build());





    public static void registerItemGroups() {
        Terrarium.LOGGER.info("Registering Item Groups for" + Terrarium.MOD_ID);
    }
}
