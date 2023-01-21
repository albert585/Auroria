
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.item.TickItem;
import tms.chabry.auroria.item.Test2Item;
import tms.chabry.auroria.item.SwordaaaItem;
import tms.chabry.auroria.item.RatherItem;
import tms.chabry.auroria.item.RainbowIceItem;
import tms.chabry.auroria.item.MagicwItem;
import tms.chabry.auroria.item.MagicfItem;
import tms.chabry.auroria.item.MagicStrickItem;
import tms.chabry.auroria.item.FunnelItem;
import tms.chabry.auroria.item.EmmItem;
import tms.chabry.auroria.AuroriaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class AuroriaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AuroriaMod.MODID);
	public static final RegistryObject<Item> RAINBOW_ICE = REGISTRY.register("rainbow_ice", () -> new RainbowIceItem());
	public static final RegistryObject<Item> RAINBOW_ORE = block(AuroriaModBlocks.RAINBOW_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FUNNEL = REGISTRY.register("funnel", () -> new FunnelItem());
	public static final RegistryObject<Item> MAGICW = REGISTRY.register("magicw", () -> new MagicwItem());
	public static final RegistryObject<Item> MAGICGRASS = block(AuroriaModBlocks.MAGICGRASS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SWORDAAA = REGISTRY.register("swordaaa", () -> new SwordaaaItem());
	public static final RegistryObject<Item> MAGIC_STRICK = REGISTRY.register("magic_strick", () -> new MagicStrickItem());
	public static final RegistryObject<Item> MAGICF = REGISTRY.register("magicf", () -> new MagicfItem());
	public static final RegistryObject<Item> RATHER = REGISTRY.register("rather", () -> new RatherItem());
	public static final RegistryObject<Item> TEST_2 = REGISTRY.register("test_2", () -> new Test2Item());
	public static final RegistryObject<Item> EMM = REGISTRY.register("emm", () -> new EmmItem());
	public static final RegistryObject<Item> TICK = REGISTRY.register("tick", () -> new TickItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
