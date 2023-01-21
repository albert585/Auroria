
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.world.inventory.WhatMenu;
import tms.chabry.auroria.AuroriaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class AuroriaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AuroriaMod.MODID);
	public static final RegistryObject<MenuType<WhatMenu>> WHAT = REGISTRY.register("what", () -> IForgeMenuType.create(WhatMenu::new));
}
