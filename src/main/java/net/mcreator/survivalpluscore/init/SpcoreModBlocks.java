
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalpluscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.survivalpluscore.block.WrappedCopperBlock;
import net.mcreator.survivalpluscore.block.VerteriumOreBlock;
import net.mcreator.survivalpluscore.block.TerracottaWrappedCopperBlock;
import net.mcreator.survivalpluscore.block.GroundedRockBlock;
import net.mcreator.survivalpluscore.block.FusionStationFrameBlock;
import net.mcreator.survivalpluscore.block.FusionStationBlock;
import net.mcreator.survivalpluscore.block.EnchantedBlockOfVerteriumBlock;
import net.mcreator.survivalpluscore.block.CampfirePlaceBlock;
import net.mcreator.survivalpluscore.block.BlockOfVerteriumBlock;
import net.mcreator.survivalpluscore.SpcoreMod;

public class SpcoreModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SpcoreMod.MODID);
	public static final DeferredHolder<Block, Block> VERTERIUM_ORE = REGISTRY.register("verterium_ore", VerteriumOreBlock::new);
	public static final DeferredHolder<Block, Block> BLOCK_OF_VERTERIUM = REGISTRY.register("block_of_verterium", BlockOfVerteriumBlock::new);
	public static final DeferredHolder<Block, Block> ENCHANTED_BLOCK_OF_VERTERIUM = REGISTRY.register("enchanted_block_of_verterium", EnchantedBlockOfVerteriumBlock::new);
	public static final DeferredHolder<Block, Block> FUSION_STATION = REGISTRY.register("fusion_station", FusionStationBlock::new);
	public static final DeferredHolder<Block, Block> FUSION_STATION_FRAME = REGISTRY.register("fusion_station_frame", FusionStationFrameBlock::new);
	public static final DeferredHolder<Block, Block> WRAPPED_COPPER = REGISTRY.register("wrapped_copper", WrappedCopperBlock::new);
	public static final DeferredHolder<Block, Block> TERRACOTTA_WRAPPED_COPPER = REGISTRY.register("terracotta_wrapped_copper", TerracottaWrappedCopperBlock::new);
	public static final DeferredHolder<Block, Block> CAMPFIRE_PLACE = REGISTRY.register("campfire_place", CampfirePlaceBlock::new);
	public static final DeferredHolder<Block, Block> GROUNDED_ROCK = REGISTRY.register("grounded_rock", GroundedRockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
