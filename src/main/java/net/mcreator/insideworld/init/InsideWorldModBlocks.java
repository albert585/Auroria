
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.insideworld.block.HongJingbBlock;
import net.mcreator.insideworld.InsideWorldMod;

public class InsideWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InsideWorldMod.MODID);
	public static final RegistryObject<Block> HONG_JINGB = REGISTRY.register("hong_jingb", () -> new HongJingbBlock());
}
