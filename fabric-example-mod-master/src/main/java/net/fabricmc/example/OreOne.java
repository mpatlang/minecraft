package net.fabricmc.example;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class OreOne extends Block {
	public OreOne() {
		super(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(2,0.2f).build());
	}
}