package gruk.minegard.proxy;

import gruk.minegard.init.ModBlocks;
import gruk.minegard.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
