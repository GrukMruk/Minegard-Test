package gruk.minegard.init;

import gruk.minegard.blocks.BlockLantern;
import gruk.minegard.blocks.BlockMidrock;
import gruk.minegard.blocks.BlockMidrockBrick;
import gruk.minegard.blocks.BlockMidrockBrick_cracked;
import gruk.minegard.blocks.BlockMidrockBrick_cracked_slab_double;
import gruk.minegard.blocks.BlockMidrockBrick_cracked_slab_half;
import gruk.minegard.blocks.BlockMidrockBrick_cracked_stairs;
import gruk.minegard.blocks.BlockMidrockBrick_mossy;
import gruk.minegard.blocks.BlockMidrockBrick_mossy_slab_double;
import gruk.minegard.blocks.BlockMidrockBrick_mossy_slab_half;
import gruk.minegard.blocks.BlockMidrockBrick_mossy_stairs;
import gruk.minegard.blocks.BlockMidrockBrick_slab_double;
import gruk.minegard.blocks.BlockMidrockBrick_slab_half;
import gruk.minegard.blocks.BlockMidrockBrick_stairs;
import gruk.minegard.blocks.BlockMidrock_mossy;
import gruk.minegard.blocks.BlockMidrock_mossy_slab_double;
import gruk.minegard.blocks.BlockMidrock_mossy_slab_half;
import gruk.minegard.blocks.BlockMidrock_mossy_stairs;
import gruk.minegard.blocks.BlockMidrock_slab_double;
import gruk.minegard.blocks.BlockMidrock_slab_half;
import gruk.minegard.blocks.BlockMidrock_stairs;
import gruk.minegard.blocks.BlockRunesteel_block;
import gruk.minegard.blocks.BlockRunesteel_ore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block midrock;
	public static BlockMidrock_slab_half midrock_slab_half;
	public static BlockMidrock_slab_double midrock_slab_double;
	public static Block midrock_stairs;

	public static Block midrock_mossy;
	public static BlockMidrock_mossy_slab_half midrock_mossy_slab_half;
	public static BlockMidrock_mossy_slab_double midrock_mossy_slab_double;
	public static Block midrock_mossy_stairs;
	
	public static Block midrockBrick;
	public static BlockMidrockBrick_slab_half midrockBrick_slab_half;
	public static BlockMidrockBrick_slab_double midrockBrick_slab_double;
	public static Block midrockBrick_stairs;
	
	public static Block midrockBrick_cracked;
	public static BlockMidrockBrick_cracked_slab_half midrockBrick_cracked_slab_half;
	public static BlockMidrockBrick_cracked_slab_double midrockBrick_cracked_slab_double;
	public static Block midrockBrick_cracked_stairs;
	
	public static Block midrockBrick_mossy;
	public static BlockMidrockBrick_mossy_slab_half midrockBrick_mossy_slab_half;
	public static BlockMidrockBrick_mossy_slab_double midrockBrick_mossy_slab_double;
	public static Block midrockBrick_mossy_stairs;
	
	public static Block lantern;
	
	public static Block runesteel_ore;
	public static Block runesteel_block;
	
	public static void init() {
		midrock = new BlockMidrock();
		midrock_stairs = new BlockMidrock_stairs("midrock_stairs", midrock.getDefaultState());
		midrock_slab_half = new BlockMidrock_slab_half("midrock_slab_half");
		midrock_slab_double = new BlockMidrock_slab_double("midrock_slab_double");
		midrock_mossy = new BlockMidrock_mossy();
		midrock_mossy_stairs = new BlockMidrock_mossy_stairs("midrock_mossy_stairs", midrock_mossy.getDefaultState());
		midrock_mossy_slab_half = new BlockMidrock_mossy_slab_half("midrock_mossy_slab_half");
		midrock_mossy_slab_double = new BlockMidrock_mossy_slab_double("midrock_mossy_slab_double");
		midrockBrick = new BlockMidrockBrick();
		midrockBrick_stairs = new BlockMidrockBrick_stairs("midrockBrick_stairs", midrockBrick.getDefaultState());
		midrockBrick_slab_half = new BlockMidrockBrick_slab_half("midrockBrick_slab_half");
		midrockBrick_slab_double = new BlockMidrockBrick_slab_double("midrockBrick_slab_double");
		midrockBrick_cracked = new BlockMidrockBrick_cracked();
		midrockBrick_cracked_stairs = new BlockMidrockBrick_cracked_stairs("midrockBrick_cracked_stairs", midrockBrick.getDefaultState());
		midrockBrick_cracked_slab_half = new BlockMidrockBrick_cracked_slab_half("midrockBrick_cracked_slab_half");
		midrockBrick_cracked_slab_double = new BlockMidrockBrick_cracked_slab_double("midrockBrick_cracked_slab_double");
		midrockBrick_mossy = new BlockMidrockBrick_mossy();
		midrockBrick_mossy_stairs = new BlockMidrockBrick_mossy_stairs("midrockBrick_mossy_stairs", midrockBrick_mossy.getDefaultState());
		midrockBrick_mossy_slab_half = new BlockMidrockBrick_mossy_slab_half("midrockBrick_mossy_slab_half");
		midrockBrick_mossy_slab_double = new BlockMidrockBrick_mossy_slab_double("midrockBrick_mossy_slab_double");
		lantern = new BlockLantern();
		runesteel_ore = new BlockRunesteel_ore();
		runesteel_block = new BlockRunesteel_block();
		
		}
		
		public static void register() {
			registerBlock(midrock);
			registerBlock(midrock_stairs);
			registerBlock(midrock_slab_half, new ItemSlab(midrock_slab_half, midrock_slab_half, midrock_slab_double));
			registerBlock(midrock_mossy);
			registerBlock(midrock_mossy_stairs);
			registerBlock(midrock_mossy_slab_half, new ItemSlab(midrock_mossy_slab_half, midrock_mossy_slab_half, midrock_mossy_slab_double));
			registerBlock(midrockBrick);
			registerBlock(midrockBrick_stairs);
			registerBlock(midrockBrick_slab_half, new ItemSlab(midrockBrick_slab_half, midrockBrick_slab_half, midrockBrick_slab_double));
			registerBlock(midrockBrick_cracked);
			registerBlock(midrockBrick_cracked_stairs);
			registerBlock(midrockBrick_cracked_slab_half, new ItemSlab(midrockBrick_cracked_slab_half, midrockBrick_cracked_slab_half, midrockBrick_cracked_slab_double));
			registerBlock(midrockBrick_mossy);
			registerBlock(midrockBrick_mossy_stairs);
			registerBlock(midrockBrick_mossy_slab_half, new ItemSlab(midrockBrick_mossy_slab_half, midrockBrick_mossy_slab_half, midrockBrick_mossy_slab_double));
			registerBlock(lantern);
			registerBlock(runesteel_ore);
			registerBlock(runesteel_block);
			GameRegistry.register(midrock_slab_double);
			GameRegistry.register(midrock_mossy_slab_double);
			GameRegistry.register(midrockBrick_slab_double);
			GameRegistry.register(midrockBrick_cracked_slab_double);
			GameRegistry.register(midrockBrick_mossy_slab_double);
		}
		
		private static void registerBlock(Block block) {
			GameRegistry.register(block);
			ItemBlock item = new ItemBlock(block);
			item.setRegistryName(block.getRegistryName());
			GameRegistry.register(item);
		}
		
		private static void registerBlock(Block block, ItemBlock itemblock) {
			GameRegistry.register(block);
			itemblock.setRegistryName(block.getRegistryName());
			GameRegistry.register(itemblock);
		}
		
		public static void registerRenders() {
			registerRender(midrock);
			registerRender(midrock_stairs);
			registerRender(midrock_slab_half);
			registerRender(midrock_slab_double);
			registerRender(midrock_mossy);
			registerRender(midrock_mossy_stairs);
			registerRender(midrock_mossy_slab_half);
			registerRender(midrock_mossy_slab_double);
			registerRender(midrockBrick);
			registerRender(midrockBrick_stairs);
			registerRender(midrockBrick_slab_half);
			registerRender(midrockBrick_slab_double);
			registerRender(midrockBrick_cracked);
			registerRender(midrockBrick_cracked_stairs);
			registerRender(midrockBrick_cracked_slab_half);
			registerRender(midrockBrick_cracked_slab_double);
			registerRender(midrockBrick_mossy);
			registerRender(midrockBrick_mossy_stairs);
			registerRender(midrockBrick_mossy_slab_half);
			registerRender(midrockBrick_mossy_slab_double);
			registerRender(lantern);
			registerRender(runesteel_ore);
			registerRender(runesteel_block);
		}
		
		private static void registerRender(Block block) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
}
