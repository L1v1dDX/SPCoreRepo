
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalpluscore.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.survivalpluscore.client.gui.FusionStationGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpcoreModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SpcoreModMenus.FUSION_STATION_GUI.get(), FusionStationGUIScreen::new);
	}
}
