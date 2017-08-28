package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRunesteel_ore extends Block {

	public BlockRunesteel_ore() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.RUNESTEEL_ORE.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.RUNESTEEL_ORE.getRegistryName());
		setHardness(3F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}
