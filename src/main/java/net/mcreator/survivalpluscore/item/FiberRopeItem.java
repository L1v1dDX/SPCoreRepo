
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FiberRopeItem extends Item {
	public FiberRopeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
