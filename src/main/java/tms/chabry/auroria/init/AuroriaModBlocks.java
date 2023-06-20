
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.block.RainbowOreBlock;
import tms.chabry.auroria.AuroriaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class AuroriaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AuroriaMod.MODID);
	public static final RegistryObject<Block> RAINBOW_ORE = REGISTRY.register("rainbow_ore", () -> new RainbowOreBlock());
}
