
package tms.chabry.auroria.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Test2Item extends RecordItem {
	public Test2Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("auroria:somebody.that.i.used.know")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
