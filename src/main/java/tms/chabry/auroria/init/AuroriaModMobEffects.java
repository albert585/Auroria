
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.potion.BoneMobEffect;
import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class AuroriaModMobEffects {
	public static MobEffect BONE;

	public static void load() {
		BONE = Registry.register(Registry.MOB_EFFECT, new ResourceLocation(AuroriaMod.MODID, "bone"), new BoneMobEffect());
	}
}
