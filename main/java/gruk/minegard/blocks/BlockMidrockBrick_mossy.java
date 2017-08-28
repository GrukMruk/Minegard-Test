package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMidrockBrick_mossy extends Block {

	public BlockMidrockBrick_mossy() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCKBRICK_MOSSY.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCKBRICK_MOSSY.getRegistryName());
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}
