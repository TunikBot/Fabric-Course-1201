package net.tuna.mccourse;

import net.fabricmc.api.ModInitializer;

import net.tuna.mccourse.block.ModBlocks;
import net.tuna.mccourse.item.ModItemGroup;
import net.tuna.mccourse.item.ModItems;
import net.tuna.mccourse.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModblocks();

		ModRegistries.registerModStuffs();
	}
}