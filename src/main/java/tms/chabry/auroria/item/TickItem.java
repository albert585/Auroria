
package tms.chabry.auroria.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TickItem extends Item {
	public TickItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.EPIC));
	}
}
