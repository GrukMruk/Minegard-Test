package gruk.minegard;

public class Reference {

	public static final String MOD_ID = "minegard";
	public static final String NAME = "Minegard Mod";
	public static final String VERSION = "1.0 Alpha";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "gruk.minegard.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "gruk.minegard.proxy.ServerProxy";
	
	public static enum MinegardItems {
		RUNESTEEL("runesteel", "runesteel"),
		PINESTICK("pinestick", "pinestick");
		
		private String unlocalizedName;
		private String registryName;
		
		MinegardItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}

	public static enum MinegardBlocks {
	MIDROCK("midrock", "midrock"),
	MIDROCK_STAIRS("midrock_stairs", "midrock_stairs"),
	MIDROCK_SLAB("midrock_slab", "midrock_slab"),
	MIDROCK_MOSSY("midrock_mossy", "midrock_mossy"),
	MIDROCK_MOSSY_STAIRS("midrock_mossy_stairs", "midrock_mossy_stairs"),
	MIDROCK_MOSSY_SLAB("midrock_mossy_slab", "midrock_mossy_slab"),
	MIDROCKBRICK("midrockbrick", "midrockbrick"),
	MIDROCKBRICK_STAIRS("midrockbrick_stairs","midrockbrick_stairs"),
	MIDROCKBRICK_SLAB("midrockbrick_slab", "midrockbrick_slab"),
	MIDROCKBRICK_CRACKED("midrockbrick_cracked", "midrockbrick_cracked"),
	MIDROCKBRICK_CRACKED_STAIRS("midrockbrick_cracked_stairs", "midrockbrick_cracked_stairs"),
	MIDROCKBRICK_CRACKED_SLAB("midrockbrick_cracked_slab", "midrockbrick_cracked_slab"),
	MIDROCKBRICK_MOSSY("midrockbrick_mossy", "midrockbrick_mossy"),
	MIDROCKBRICK_MOSSY_STAIRS("midrockbrick_mossy_stairs", "midrockbrick_mossy_stairs"),
	MIDROCKBRICK_MOSSY_SLAB("midrockbrick_mossy_slab", "midrockbrick_mossy_slab"),
	LANTERN("lantern", "lantern"),
	RUNESTEEL_ORE("runesteel_ore", "runesteel_ore"),
	RUNESTEEL_BLOCK("runesteel_block", "runesteel_block"),
	MIDROCK_PILLAR("midrock_pillar","midrock_pillar");
	
	private String unlocalizedName;
	private String registryName;
	
	MinegardBlocks(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
	}
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	
	public String getRegistryName() {
		return registryName;
	}

	}
}
