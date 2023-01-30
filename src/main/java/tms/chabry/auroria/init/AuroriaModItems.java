
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.item.RainbowIceItem;
import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class AuroriaModItems {
	public static Item RAINBOW_ICE;

	public static void load() {
		RAINBOW_ICE = Registry.register(Registry.ITEM, new ResourceLocation(AuroriaMod.MODID, "rainbow_ice"), new RainbowIceItem());
	}
}
