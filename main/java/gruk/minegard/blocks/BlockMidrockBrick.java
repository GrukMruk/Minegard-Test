package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMidrockBrick extends Block {

	public BlockMidrockBrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCKBRICK.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCKBRICK.getRegistryName());
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}
}
