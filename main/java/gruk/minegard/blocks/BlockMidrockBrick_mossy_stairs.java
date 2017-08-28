package gruk.minegard.blocks;

import gruk.minegard.Reference;
import gruk.minegard.TabMinegardBlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockMidrockBrick_mossy_stairs extends BlockStairs {

	public BlockMidrockBrick_mossy_stairs(String name, IBlockState modelState) {
		super(modelState);
		setUnlocalizedName(Reference.MinegardBlocks.MIDROCKBRICK_MOSSY_STAIRS.getUnlocalizedName());
		setRegistryName(Reference.MinegardBlocks.MIDROCKBRICK_MOSSY_STAIRS.getRegistryName());
		this.useNeighborBrightness = true;
		setHardness(1.5F);
		setCreativeTab(TabMinegardBlocks.CREATIVE_TAB);
	}

}
