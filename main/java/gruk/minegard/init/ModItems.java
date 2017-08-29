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
	public static Item pinestick;

	public static void init() {
	runesteel = new ItemRunesteel();
	pinestick = new ItemPineStick();
	}
	
	public static void register() {
		GameRegistry.register(runesteel);
		GameRegistry.register(pinestick);
	}
	
	public static void registerRenders() {
		registerRender(runesteel);
		registerRender(pinestick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}