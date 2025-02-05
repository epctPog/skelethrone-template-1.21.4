package net.epct.skelethrone;

import net.epct.skelethrone.Block.ModBlocks;
import net.epct.skelethrone.Item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skelethrone implements ModInitializer {
	public static final String MOD_ID = "skelethrone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}