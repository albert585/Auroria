
package tms.chabry.auroria.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GelItem extends Item {
	public GelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
