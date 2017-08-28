package gruk.minegard.blocks;

import gruk.minegard.Minegard;
import gruk.minegard.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import gruk.minegard.TabMinegardBlocks;

public class BlockMidrockBrick_cracked extends Block {

	

	public BlockMidrockBrick_cracked() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCKBRICK_CRACKED.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCKBRICK_CRACKED.getRegistryName());
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}
