
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.insideworld.potion.NingGuBingMobEffect;
import net.mcreator.insideworld.InsideWorldMod;

public class InsideWorldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, InsideWorldMod.MODID);
	public static final RegistryObject<MobEffect> NING_GU_BING = REGISTRY.register("ning_gu_bing", () -> new NingGuBingMobEffect());
}
