package net.mcreator.survivalpluscore.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class VerteriumSwordItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.LOOTING, 2);
	}
}
