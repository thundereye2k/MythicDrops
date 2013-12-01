package net.nunnerycode.bukkit.mythicdrops.api.items;

import java.util.List;
import java.util.Map;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public interface CustomItem {

	/**
	 * Gets the chance for the item to be given to a monster.
	 *
	 * @return chance to be given to a monster
	 */
	double getChanceToBeGivenToAMonster();

	/**
	 * Gets the chance for the item to drop on death.
	 *
	 * @return chance to drop item on death
	 */
	double getChanceToDropOnDeath();

	/**
	 * Gets the internal name of the CustomItem.
	 *
	 * @return iternal name
	 */
	String getName();

	/**
	 * Gets the name that is displayed on the item.
	 *
	 * @return display name
	 */
	String getDisplayName();

	/**
	 * Gets a {@link Map} of {@link Enchantment}s and their {@link Integer} values for the CustomItem.
	 *
	 * @return Map of Enchantments and levels
	 */
	Map<Enchantment, Integer> getEnchantments();

	/**
	 * Gets a {@link List} of lore for the CustomItem.
	 *
	 * @return lore for the item
	 */
	List<String> getLore();

	/**
	 * Gets the {@link MaterialData} of the item.
	 *
	 * @return MaterialData of the CustomItem
	 */
	MaterialData getMaterialData();

	/**
	 * Converts the CustomItem to an {@link ItemStack}.
	 * <br>
	 * Preferably use {@link net.nunnerycode.bukkit.mythicdrops.api.managers
	 * .DropManager#generateItemStackFromCustomItem(CustomItem, ItemGenerationReason)} for this,
	 * as it calls an event that makes it easier for other developers to hook into plugin operations.
	 *
	 * @return CustomItem as an ItemStack
	 */
	ItemStack toItemStack();

}
