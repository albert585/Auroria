
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class AuroriaModTabs {
	public static CreativeModeTab TAB_AURORIA;

	public static void load() {
		TAB_AURORIA = FabricItemGroupBuilder.create(new ResourceLocation("auroria", "auroria")).icon(() -> new ItemStack(AuroriaModItems.RAINBOW_ICE))
				.build();
	}
}
