package net.chukkthedukk.continuation;

import net.chukkthedukk.continuation.block.ModBlocks;
import net.chukkthedukk.continuation.item.ModItems;
import net.chukkthedukk.continuation.world.feature.ModConfiguredFeatures;
import net.chukkthedukk.continuation.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//very important comment
public class Continuation implements ModInitializer {
	public static final String MOD_ID = "continuation";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();

	}
}