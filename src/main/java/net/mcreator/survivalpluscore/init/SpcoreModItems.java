
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.survivalpluscore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.survivalpluscore.item.WoodenShaftItem;
import net.mcreator.survivalpluscore.item.WoodenFrameItem;
import net.mcreator.survivalpluscore.item.VerteriumSwordItem;
import net.mcreator.survivalpluscore.item.VerteriumIngotItem;
import net.mcreator.survivalpluscore.item.VerteriumCrystalItem;
import net.mcreator.survivalpluscore.item.SmithingHammerItem;
import net.mcreator.survivalpluscore.item.RockItem;
import net.mcreator.survivalpluscore.item.PrimitiveToolItem;
import net.mcreator.survivalpluscore.item.PlantFibersItem;
import net.mcreator.survivalpluscore.item.IronKnifeItem;
import net.mcreator.survivalpluscore.item.IronGearItem;
import net.mcreator.survivalpluscore.item.GoldenKnifeItem;
import net.mcreator.survivalpluscore.item.GoldenGearItem;
import net.mcreator.survivalpluscore.item.GearFrameItem;
import net.mcreator.survivalpluscore.item.FlintBladeItem;
import net.mcreator.survivalpluscore.item.FiberRopeItem;
import net.mcreator.survivalpluscore.item.CopperPickaxeHeadItem;
import net.mcreator.survivalpluscore.item.CopperNuggetItem;
import net.mcreator.survivalpluscore.item.CopperGearItem;
import net.mcreator.survivalpluscore.item.CopperDustItem;
import net.mcreator.survivalpluscore.item.CoalShardItem;
import net.mcreator.survivalpluscore.item.CoalDustItem;
import net.mcreator.survivalpluscore.SpcoreMod;

public class SpcoreModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpcoreMod.MODID);
	public static final DeferredHolder<Item, Item> VERTERIUM_ORE = block(SpcoreModBlocks.VERTERIUM_ORE);
	public static final DeferredHolder<Item, Item> VERTERIUM_CRYSTAL = REGISTRY.register("verterium_crystal", VerteriumCrystalItem::new);
	public static final DeferredHolder<Item, Item> BLOCK_OF_VERTERIUM = block(SpcoreModBlocks.BLOCK_OF_VERTERIUM);
	public static final DeferredHolder<Item, Item> ENCHANTED_BLOCK_OF_VERTERIUM = block(SpcoreModBlocks.ENCHANTED_BLOCK_OF_VERTERIUM);
	public static final DeferredHolder<Item, Item> VERTERIUM_SWORD = REGISTRY.register("verterium_sword", VerteriumSwordItem::new);
	public static final DeferredHolder<Item, Item> SMITHING_HAMMER = REGISTRY.register("smithing_hammer", SmithingHammerItem::new);
	public static final DeferredHolder<Item, Item> VERTERIUM_INGOT = REGISTRY.register("verterium_ingot", VerteriumIngotItem::new);
	public static final DeferredHolder<Item, Item> FUSION_STATION = block(SpcoreModBlocks.FUSION_STATION);
	public static final DeferredHolder<Item, Item> IRON_GEAR = REGISTRY.register("iron_gear", IronGearItem::new);
	public static final DeferredHolder<Item, Item> GEAR_FRAME = REGISTRY.register("gear_frame", GearFrameItem::new);
	public static final DeferredHolder<Item, Item> IRON_KNIFE = REGISTRY.register("iron_knife", IronKnifeItem::new);
	public static final DeferredHolder<Item, Item> GOLDEN_KNIFE = REGISTRY.register("golden_knife", GoldenKnifeItem::new);
	public static final DeferredHolder<Item, Item> COPPER_GEAR = REGISTRY.register("copper_gear", CopperGearItem::new);
	public static final DeferredHolder<Item, Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", CopperNuggetItem::new);
	public static final DeferredHolder<Item, Item> COPPER_DUST = REGISTRY.register("copper_dust", CopperDustItem::new);
	public static final DeferredHolder<Item, Item> GOLDEN_GEAR = REGISTRY.register("golden_gear", GoldenGearItem::new);
	public static final DeferredHolder<Item, Item> FUSION_STATION_FRAME = block(SpcoreModBlocks.FUSION_STATION_FRAME);
	public static final DeferredHolder<Item, Item> ROCK = REGISTRY.register("rock", RockItem::new);
	public static final DeferredHolder<Item, Item> PLANT_FIBERS = REGISTRY.register("plant_fibers", PlantFibersItem::new);
	public static final DeferredHolder<Item, Item> FLINT_BLADE = REGISTRY.register("flint_blade", FlintBladeItem::new);
	public static final DeferredHolder<Item, Item> FIBER_ROPE = REGISTRY.register("fiber_rope", FiberRopeItem::new);
	public static final DeferredHolder<Item, Item> PRIMITIVE_TOOL = REGISTRY.register("primitive_tool", PrimitiveToolItem::new);
	public static final DeferredHolder<Item, Item> WOODEN_SHAFT = REGISTRY.register("wooden_shaft", WoodenShaftItem::new);
	public static final DeferredHolder<Item, Item> WRAPPED_COPPER = block(SpcoreModBlocks.WRAPPED_COPPER);
	public static final DeferredHolder<Item, Item> TERRACOTTA_WRAPPED_COPPER = block(SpcoreModBlocks.TERRACOTTA_WRAPPED_COPPER);
	public static final DeferredHolder<Item, Item> CAMPFIRE_PLACE = block(SpcoreModBlocks.CAMPFIRE_PLACE);
	public static final DeferredHolder<Item, Item> COAL_SHARD = REGISTRY.register("coal_shard", CoalShardItem::new);
	public static final DeferredHolder<Item, Item> COAL_DUST = REGISTRY.register("coal_dust", CoalDustItem::new);
	public static final DeferredHolder<Item, Item> COPPER_PICKAXE_HEAD = REGISTRY.register("copper_pickaxe_head", CopperPickaxeHeadItem::new);
	public static final DeferredHolder<Item, Item> WOODEN_FRAME = REGISTRY.register("wooden_frame", WoodenFrameItem::new);
	public static final DeferredHolder<Item, Item> GROUNDED_ROCK = block(SpcoreModBlocks.GROUNDED_ROCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
