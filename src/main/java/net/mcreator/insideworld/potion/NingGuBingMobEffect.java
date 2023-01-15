
package net.mcreator.insideworld.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.insideworld.procedures.Ngb2Procedure;

public class NingGuBingMobEffect extends MobEffect {
	public NingGuBingMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.inside_world.ning_gu_bing";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Ngb2Procedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
