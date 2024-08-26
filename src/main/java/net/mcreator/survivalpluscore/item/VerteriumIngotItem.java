
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VerteriumIngotItem extends Item {
	public VerteriumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
