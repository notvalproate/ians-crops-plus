package com.valproate.cropsplus;

import com.valproate.cropsplus.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IansCropsPlus implements ModInitializer {
	public static final String MOD_ID = "ians_crops_plus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}