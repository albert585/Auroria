
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AuroriaModTabs {
	public static CreativeModeTab TAB_A_LUO_LI_YA;

	public static void load() {
		TAB_A_LUO_LI_YA = new CreativeModeTab("taba_luo_li_ya") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AuroriaModItems.RAINBOW_ICE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
