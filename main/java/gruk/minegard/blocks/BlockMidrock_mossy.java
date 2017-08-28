package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMidrock_mossy extends Block {

	public BlockMidrock_mossy() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCK_MOSSY.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCK_MOSSY.getRegistryName());
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}
}
