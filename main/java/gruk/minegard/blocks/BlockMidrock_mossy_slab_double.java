package gruk.minegard.blocks;

import gruk.minegard.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockMidrock_mossy_slab_double extends BlockMidrock_mossy_slab {

	public BlockMidrock_mossy_slab_double(String unlocalizedName) {
		super(unlocalizedName);
	}

	@Override
	public boolean isDouble() {
		return true;
	}

}
