
package tms.chabry.auroria.potion;

import tms.chabry.auroria.procedures.NgbProcedure;
import tms.chabry.auroria.procedures.HJProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BoneCoagulationMobEffect extends MobEffect {
	public BoneCoagulationMobEffect() {
		super(MobEffectCategory.HARMFUL, -3355444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.auroria.bone_coagulation";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		NgbProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HJProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
