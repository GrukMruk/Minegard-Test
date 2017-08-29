package gruk.minegard.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick, 4), "MM", "MM", 'M', ModBlocks.midrock);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrock_stairs, 4),"M  ", "MM ", "MMM", 'M', ModBlocks.midrock);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrock_slab_half, 6), "MMM", 'M', ModBlocks.midrock);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_stairs, 4),"M  ", "MM ", "MMM", 'M', ModBlocks.midrockbrick);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_slab_half, 6), "MMM", 'M', ModBlocks.midrockbrick);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_cracked_stairs, 4),"M  ", "MM ", "MMM", 'M', ModBlocks.midrockbrick_cracked);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_cracked_slab_half, 6), "MMM", 'M', ModBlocks.midrockbrick_cracked);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_mossy_stairs, 4),"M  ", "MM ", "MMM", 'M', ModBlocks.midrockbrick_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrockbrick_mossy_slab_half, 6), "MMM", 'M', ModBlocks.midrockbrick_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrock_mossy_stairs, 4),"M  ", "MM ", "MMM", 'M', ModBlocks.midrock_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrock_mossy_slab_half, 6), "MMM", 'M', ModBlocks.midrock_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.runesteel_block), "RRR", "RRR", "RRR", 'R', ModItems.runesteel);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.runesteel, 9),new ItemStack(ModBlocks.runesteel_block));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.midrock_pillar), "M", "M", 'M', ModBlocks.midrockbrick_slab_half);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.runesteel_ore), new ItemStack(ModItems.runesteel), 7);
	}
}
