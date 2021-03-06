package ganymedes01.headcrumbs.proxy;

import ganymedes01.headcrumbs.configs.ConfigHandler;
import ganymedes01.headcrumbs.eventHandlers.HandlerEvents;
import ganymedes01.headcrumbs.tileentities.TileEntityBlockPlayer;
import ganymedes01.headcrumbs.tileentities.TileEntityBlockSkull;
import ganymedes01.headcrumbs.utils.Utils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerEvents() {
		MinecraftForge.EVENT_BUS.register(ConfigHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(HandlerEvents.INSTANCE);
	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityBlockSkull.class, Utils.getUnlocalisedName("head"));
		GameRegistry.registerTileEntity(TileEntityBlockPlayer.class, Utils.getUnlocalisedName("player"));
	}

	public void registerEntityRenderers() {
	}

	public void registerRenderers() {
	}
}