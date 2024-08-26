
package net.mcreator.survivalpluscore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronGearItem extends Item {
	public IronGearItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
