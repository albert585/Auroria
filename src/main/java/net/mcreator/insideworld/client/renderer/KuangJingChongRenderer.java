
package net.mcreator.insideworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.insideworld.entity.KuangJingChongEntity;

public class KuangJingChongRenderer extends MobRenderer<KuangJingChongEntity, SilverfishModel<KuangJingChongEntity>> {
	public KuangJingChongRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KuangJingChongEntity entity) {
		return new ResourceLocation("inside_world:textures/entities/2023-01-10-142608_1920x1080_scrot.png");
	}
}
