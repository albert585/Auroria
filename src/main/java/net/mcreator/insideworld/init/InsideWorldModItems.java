
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.insideworld.item.NingXiaoItem;
import net.mcreator.insideworld.item.NengLiangNingXiaoItem;
import net.mcreator.insideworld.item.HongJingItem;
import net.mcreator.insideworld.item.Fz1Item;
import net.mcreator.insideworld.item.FuYouPaoItem;
import net.mcreator.insideworld.item.ChangMaoItem;
import net.mcreator.insideworld.InsideWorldMod;

public class InsideWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InsideWorldMod.MODID);
	public static final RegistryObject<Item> HONG_JING = REGISTRY.register("hong_jing", () -> new HongJingItem());
	public static final RegistryObject<Item> KUANG_JING_CHONG = REGISTRY.register("kuang_jing_chong_spawn_egg",
			() -> new ForgeSpawnEggItem(InsideWorldModEntities.KUANG_JING_CHONG, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NING_XIAO = REGISTRY.register("ning_xiao", () -> new NingXiaoItem());
	public static final RegistryObject<Item> NENG_LIANG_NING_XIAO = REGISTRY.register("neng_liang_ning_xiao", () -> new NengLiangNingXiaoItem());
	public static final RegistryObject<Item> FU_YOU_PAO = REGISTRY.register("fu_you_pao", () -> new FuYouPaoItem());
	public static final RegistryObject<Item> FZ_1 = REGISTRY.register("fz_1", () -> new Fz1Item());
	public static final RegistryObject<Item> CHANG_MAO = REGISTRY.register("chang_mao", () -> new ChangMaoItem());
	public static final RegistryObject<Item> HONG_JINGB = block(InsideWorldModBlocks.HONG_JINGB, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
