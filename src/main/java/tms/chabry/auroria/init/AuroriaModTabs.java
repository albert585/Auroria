
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AuroriaModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AuroriaModBlocks.RAINBOW_ORE.get().asItem());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("auroria", "a_luo_li_ya"),
				builder -> builder.title(Component.translatable("item_group.auroria.a_luo_li_ya")).icon(() -> new ItemStack(AuroriaModItems.RAINBOW_ICE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AuroriaModItems.RAINBOW_ICE.get());
					tabData.accept(AuroriaModItems.FUNNEL.get());
					tabData.accept(AuroriaModItems.MAGICF.get());
					tabData.accept(AuroriaModItems.RATHER.get());
					tabData.accept(AuroriaModItems.TEST_2.get());
					tabData.accept(AuroriaModItems.GEL.get());
					tabData.accept(AuroriaModItems.OREIN_SPAWN_EGG.get());
					tabData.accept(AuroriaModItems.ENERGYGEL.get());
				})

		);
	}
}
