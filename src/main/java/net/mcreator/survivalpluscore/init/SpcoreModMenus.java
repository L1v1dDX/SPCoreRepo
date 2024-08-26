
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalpluscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.survivalpluscore.world.inventory.FusionStationGUIMenu;
import net.mcreator.survivalpluscore.SpcoreMod;

public class SpcoreModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, SpcoreMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<FusionStationGUIMenu>> FUSION_STATION_GUI = REGISTRY.register("fusion_station_gui", () -> IMenuTypeExtension.create(FusionStationGUIMenu::new));
}
