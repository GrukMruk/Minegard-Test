package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRunesteel_block extends Block {

	public BlockRunesteel_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.MinegardBlocks.RUNESTEEL_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.RUNESTEEL_BLOCK.getRegistryName());
		setHardness(5F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}