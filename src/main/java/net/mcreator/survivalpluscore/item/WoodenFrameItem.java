
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WoodenFrameItem extends Item {
	public WoodenFrameItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
