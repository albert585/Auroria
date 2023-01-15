
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.insideworld.world.features.ores.HongJingbFeature;
import net.mcreator.insideworld.InsideWorldMod;

@Mod.EventBusSubscriber
public class InsideWorldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, InsideWorldMod.MODID);
	public static final RegistryObject<Feature<?>> HONG_JINGB = REGISTRY.register("hong_jingb", HongJingbFeature::feature);
}
