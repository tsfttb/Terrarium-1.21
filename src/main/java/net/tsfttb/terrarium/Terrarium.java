package net.tsfttb.terrarium;

import net.fabricmc.api.ModInitializer;

import net.tsfttb.terrarium.block.ModBlocks;
import net.tsfttb.terrarium.item.ModItemGroups;
import net.tsfttb.terrarium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//comment
public class Terrarium implements ModInitializer {
	public static final String MOD_ID = "terrarium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registeredModItems();
		ModBlocks.registerModBlocks();
	}
}