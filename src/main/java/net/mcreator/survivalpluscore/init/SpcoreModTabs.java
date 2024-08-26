
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalpluscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.survivalpluscore.SpcoreMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SpcoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpcoreMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SpcoreModBlocks.BLOCK_OF_VERTERIUM.get().asItem());
			tabData.accept(SpcoreModBlocks.ENCHANTED_BLOCK_OF_VERTERIUM.get().asItem());
			tabData.accept(SpcoreModBlocks.FUSION_STATION_FRAME.get().asItem());
			tabData.accept(SpcoreModBlocks.WRAPPED_COPPER.get().asItem());
			tabData.accept(SpcoreModBlocks.TERRACOTTA_WRAPPED_COPPER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(SpcoreModBlocks.FUSION_STATION.get().asItem());
			tabData.accept(SpcoreModBlocks.CAMPFIRE_PLACE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SpcoreModItems.VERTERIUM_CRYSTAL.get());
			tabData.accept(SpcoreModItems.VERTERIUM_INGOT.get());
			tabData.accept(SpcoreModItems.IRON_GEAR.get());
			tabData.accept(SpcoreModItems.GEAR_FRAME.get());
			tabData.accept(SpcoreModItems.COPPER_GEAR.get());
			tabData.accept(SpcoreModItems.COPPER_NUGGET.get());
			tabData.accept(SpcoreModItems.COPPER_DUST.get());
			tabData.accept(SpcoreModItems.GOLDEN_GEAR.get());
			tabData.accept(SpcoreModItems.ROCK.get());
			tabData.accept(SpcoreModItems.PLANT_FIBERS.get());
			tabData.accept(SpcoreModItems.FIBER_ROPE.get());
			tabData.accept(SpcoreModItems.WOODEN_SHAFT.get());
			tabData.accept(SpcoreModItems.COAL_SHARD.get());
			tabData.accept(SpcoreModItems.COAL_DUST.get());
			tabData.accept(SpcoreModItems.COPPER_PICKAXE_HEAD.get());
			tabData.accept(SpcoreModItems.WOODEN_FRAME.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SpcoreModBlocks.VERTERIUM_ORE.get().asItem());
			tabData.accept(SpcoreModBlocks.GROUNDED_ROCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SpcoreModItems.VERTERIUM_SWORD.get());
			tabData.accept(SpcoreModItems.SMITHING_HAMMER.get());
			tabData.accept(SpcoreModItems.IRON_KNIFE.get());
			tabData.accept(SpcoreModItems.GOLDEN_KNIFE.get());
			tabData.accept(SpcoreModItems.FLINT_BLADE.get());
			tabData.accept(SpcoreModItems.PRIMITIVE_TOOL.get());
		}
	}
}
