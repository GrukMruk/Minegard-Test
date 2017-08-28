package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.Minegard;
import net.minecraft.block.Block;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMidrock extends Block {

	public BlockMidrock() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCK.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCK.getRegistryName());
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}
