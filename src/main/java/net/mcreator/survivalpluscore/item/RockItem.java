
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RockItem extends Item {
	public RockItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
