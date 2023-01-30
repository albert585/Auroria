
package tms.chabry.auroria.client.renderer;

import tms.chabry.auroria.entity.OreinEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

public class OreinRenderer extends MobRenderer<OreinEntity, SilverfishModel<OreinEntity>> {
	public OreinRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OreinEntity entity) {
		return new ResourceLocation("auroria:textures/entities/teart.png");
	}
}
