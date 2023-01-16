
package tms.chabry.auroria.item;

import tms.chabry.auroria.procedures.CCCProcedure;
import tms.chabry.auroria.procedures.AAProcedure;

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
import net.minecraft.world.entity.Entity;
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
		}, 3, 28.767f, new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u4E00 \u51FB \u5FC5 \u6740"));
		list.add(Component.literal("\u65E0 \u61C8 \u53EF \u51FB"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			AAProcedure.execute();
		CCCProcedure.execute(entity);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
