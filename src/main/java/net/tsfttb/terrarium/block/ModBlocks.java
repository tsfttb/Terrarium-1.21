package net.tsfttb.terrarium.block;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tsfttb.terrarium.Terrarium;

public class ModBlocks {

    public static final Block TITANIUM_ORE_BLOCK = registerBlock("titanium_ore_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Terrarium.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Terrarium.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Terrarium.LOGGER.info("Registering Mod Blocks for" + Terrarium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TITANIUM_ORE_BLOCK);
        });
    }
}
