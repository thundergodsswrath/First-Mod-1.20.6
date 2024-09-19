package net.ihor.mymod;

import net.fabricmc.api.ModInitializer;

import net.ihor.mymod.item.ModItemGroups;
import net.ihor.mymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMod implements ModInitializer {
	public static final String MOD_ID = "mymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}