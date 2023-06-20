
package tms.chabry.auroria.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SwordaaaItem extends SwordItem {
	public SwordaaaItem() {
		super(new Tier() {
			public int getUses() {
				return 32771;
			}

			public float getSpeed() {
				return 32767f;
			}

			public float getAttackDamageBonus() {
				return 32765f;
			}

			public int getLevel() {
				return 32767;
			}

			public int getEnchantmentValue() {
				return 32767;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.BARRIER));
			}
		}, 3, 28.767f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u4EC5\u7528\u4E8E\u6D4B\u8BD5"));
		list.add(Component.literal("\u5C06\u4E8Ebeta\u7248\u5220\u9664"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
