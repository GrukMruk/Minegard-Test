package gruk.minegard;

import gruk.minegard.init.ModBlocks;
import gruk.minegard.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabMinegardBlocks extends CreativeTabs {
	
	public static final TabMinegardBlocks CREATIVE_TAB = new TabMinegardBlocks();

	public TabMinegardBlocks() {
		super("TabMinegardBlocks");
	}

	@Override
	public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.midrock));
    }

	private ItemStack ItemStack(Block midrock) {
		return null;
	}
	
}
