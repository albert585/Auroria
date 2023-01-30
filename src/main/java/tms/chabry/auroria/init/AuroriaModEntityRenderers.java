
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.client.renderer.OreinRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AuroriaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AuroriaModEntities.FUNNEL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AuroriaModEntities.MAGICF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AuroriaModEntities.OREIN.get(), OreinRenderer::new);
	}
}
