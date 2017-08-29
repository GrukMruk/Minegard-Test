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
import gruk.minegard.blocks.BlockMidrock_pillar;
import gruk.minegard.blocks.BlockMidrock_slab_double;
import gruk.minegard.blocks.BlockMidrock_slab_half;
import gruk.minegard.blocks.BlockMidrock_stairs;
import gruk.minegard.blocks.BlockRunesteel_block;
import gruk.minegard.blocks.BlockRunesteel_ore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
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
	
	public static Block midrockbrick;
	public static BlockMidrockBrick_slab_half midrockbrick_slab_half;
	public static BlockMidrockBrick_slab_double midrockbrick_slab_double;
	public static Block midrockbrick_stairs;
	
	public static Block midrockbrick_cracked;
	public static BlockMidrockBrick_cracked_slab_half midrockbrick_cracked_slab_half;
	public static BlockMidrockBrick_cracked_slab_double midrockbrick_cracked_slab_double;
	public static Block midrockbrick_cracked_stairs;
	
	public static Block midrockbrick_mossy;
	public static BlockMidrockBrick_mossy_slab_half midrockbrick_mossy_slab_half;
	public static BlockMidrockBrick_mossy_slab_double midrockbrick_mossy_slab_double;
	public static Block midrockbrick_mossy_stairs;
	
	public static Block lantern;
	
	public static Block runesteel_ore;
	public static Block runesteel_block;
	
	public static BlockMidrock_pillar midrock_pillar;
	
	public static void init() {
		midrock = new BlockMidrock();
		midrock_stairs = new BlockMidrock_stairs("midrock_stairs", midrock.getDefaultState());
		midrock_slab_half = new BlockMidrock_slab_half("midrock_slab_half");
		midrock_slab_double = new BlockMidrock_slab_double("midrock_slab_double");
		midrock_mossy = new BlockMidrock_mossy();
		midrock_mossy_stairs = new BlockMidrock_mossy_stairs("midrock_mossy_stairs", midrock_mossy.getDefaultState());
		midrock_mossy_slab_half = new BlockMidrock_mossy_slab_half("midrock_mossy_slab_half");
		midrock_mossy_slab_double = new BlockMidrock_mossy_slab_double("midrock_mossy_slab_double");
		midrockbrick = new BlockMidrockBrick();
		midrockbrick_stairs = new BlockMidrockBrick_stairs("midrockbrick_stairs", midrockbrick.getDefaultState());
		midrockbrick_slab_half = new BlockMidrockBrick_slab_half("midrockbrick_slab_half");
		midrockbrick_slab_double = new BlockMidrockBrick_slab_double("midrockbrick_slab_double");
		midrockbrick_cracked = new BlockMidrockBrick_cracked();
		midrockbrick_cracked_stairs = new BlockMidrockBrick_cracked_stairs("midrockbrick_cracked_stairs", midrockbrick.getDefaultState());
		midrockbrick_cracked_slab_half = new BlockMidrockBrick_cracked_slab_half("midrockbrick_cracked_slab_half");
		midrockbrick_cracked_slab_double = new BlockMidrockBrick_cracked_slab_double("midrockbrick_cracked_slab_double");
		midrockbrick_mossy = new BlockMidrockBrick_mossy();
		midrockbrick_mossy_stairs = new BlockMidrockBrick_mossy_stairs("midrockbrick_mossy_stairs", midrockbrick_mossy.getDefaultState());
		midrockbrick_mossy_slab_half = new BlockMidrockBrick_mossy_slab_half("midrockbrick_mossy_slab_half");
		midrockbrick_mossy_slab_double = new BlockMidrockBrick_mossy_slab_double("midrockbrick_mossy_slab_double");
		lantern = new BlockLantern();
		runesteel_ore = new BlockRunesteel_ore();
		runesteel_block = new BlockRunesteel_block();
		midrock_pillar = new BlockMidrock_pillar();
		
		}
		
		public static void register() {
			registerBlock(midrock);
			registerBlock(midrock_stairs);
			registerBlock(midrock_slab_half, new ItemSlab(midrock_slab_half, midrock_slab_half, midrock_slab_double));
			registerBlock(midrock_mossy);
			registerBlock(midrock_mossy_stairs);
			registerBlock(midrock_mossy_slab_half, new ItemSlab(midrock_mossy_slab_half, midrock_mossy_slab_half, midrock_mossy_slab_double));
			registerBlock(midrockbrick);
			registerBlock(midrockbrick_stairs);
			registerBlock(midrockbrick_slab_half, new ItemSlab(midrockbrick_slab_half, midrockbrick_slab_half, midrockbrick_slab_double));
			registerBlock(midrockbrick_cracked);
			registerBlock(midrockbrick_cracked_stairs);
			registerBlock(midrockbrick_cracked_slab_half, new ItemSlab(midrockbrick_cracked_slab_half, midrockbrick_cracked_slab_half, midrockbrick_cracked_slab_double));
			registerBlock(midrockbrick_mossy);
			registerBlock(midrockbrick_mossy_stairs);
			registerBlock(midrockbrick_mossy_slab_half, new ItemSlab(midrockbrick_mossy_slab_half, midrockbrick_mossy_slab_half, midrockbrick_mossy_slab_double));
			registerBlock(lantern);
			registerBlock(runesteel_ore);
			registerBlock(runesteel_block);
			registerBlock(midrock_pillar);
			ForgeRegistries.BLOCKS.register(midrock_slab_double);
			ForgeRegistries.BLOCKS.register(midrock_mossy_slab_double);
			ForgeRegistries.BLOCKS.register(midrockbrick_slab_double);
			ForgeRegistries.BLOCKS.register(midrockbrick_cracked_slab_double);
			ForgeRegistries.BLOCKS.register(midrockbrick_mossy_slab_double);
		}
		
		private static void registerBlock(Block block) {
			ForgeRegistries.BLOCKS.register(block);
			ItemBlock item = new ItemBlock(block);
			item.setRegistryName(block.getRegistryName());
			ForgeRegistries.ITEMS.register(item);
		}
		
		private static void registerBlock(Block block, ItemBlock itemblock) {
			ForgeRegistries.BLOCKS.register(block);
			itemblock.setRegistryName(block.getRegistryName());
			ForgeRegistries.ITEMS.register(itemblock);
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
			registerRender(midrockbrick);
			registerRender(midrockbrick_stairs);
			registerRender(midrockbrick_slab_half);
			registerRender(midrockbrick_slab_double);
			registerRender(midrockbrick_cracked);
			registerRender(midrockbrick_cracked_stairs);
			registerRender(midrockbrick_cracked_slab_half);
			registerRender(midrockbrick_cracked_slab_double);
			registerRender(midrockbrick_mossy);
			registerRender(midrockbrick_mossy_stairs);
			registerRender(midrockbrick_mossy_slab_half);
			registerRender(midrockbrick_mossy_slab_double);
			registerRender(lantern);
			registerRender(runesteel_ore);
			registerRender(runesteel_block);
			registerRender(midrock_pillar);
		}
		
		private static void registerRender(Block block) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
}
