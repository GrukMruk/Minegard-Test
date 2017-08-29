package gruk.minegard;

import gruk.minegard.init.ModBlocks;
import gruk.minegard.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabMinegardDecorations extends CreativeTabs {
	
	public static final TabMinegardDecorations CREATIVE_TAB = new TabMinegardDecorations();

	public TabMinegardDecorations() {
		super("TabMinegardDecorations");
	}

	@Override
	public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.lantern));
    }

	private ItemStack ItemStack(Block midrock) {
		return null;
	}
	
}
