
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GearFrameItem extends Item {
	public GearFrameItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
