
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.insideworld.client.renderer.KuangJingChongRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InsideWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(InsideWorldModEntities.KUANG_JING_CHONG.get(), KuangJingChongRenderer::new);
		event.registerEntityRenderer(InsideWorldModEntities.FU_YOU_PAO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(InsideWorldModEntities.FZ_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(InsideWorldModEntities.CHANG_MAO.get(), ThrownItemRenderer::new);
	}
}
