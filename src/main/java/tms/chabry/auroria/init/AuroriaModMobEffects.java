
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.potion.BoneCoagulationMobEffect;
import tms.chabry.auroria.AuroriaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class AuroriaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AuroriaMod.MODID);
	public static final RegistryObject<MobEffect> BONE_COAGULATION = REGISTRY.register("bone_coagulation", () -> new BoneCoagulationMobEffect());
}
