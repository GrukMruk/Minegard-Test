package gruk.minegard.init;

import gruk.minegard.Reference;

import gruk.minegard.items.ItemPineStick;
import gruk.minegard.items.ItemRunesteel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item runesteel;
	public static Item pineStick;

	public static void init() {
	runesteel = new ItemRunesteel();
	pineStick = new ItemPineStick();
	}
	
	public static void register() {
		GameRegistry.register(runesteel);
		GameRegistry.register(pineStick);
	}
	
	public static void registerRenders() {
		registerRender(runesteel);
		registerRender(pineStick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}