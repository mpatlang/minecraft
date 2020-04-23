package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public class ExampleMod implements ModInitializer {
	public static final Block FABRIC_ORE = new OreOne();
	@Override
	public void onInitialize() {
		//Registry.register(Registry.BLOCK,new Identifier("ores","test"),FABRIC_ORE);
		//Registry.register(Registry.ITEM, new Identifier("ores","test"), new BlockItem(FABRIC_ORE, new Item.Settings().group(ItemGroup.MATERIALS)));
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

	}
}
