package tms.chabry.auroria.procedures;

import tms.chabry.auroria.init.AuroriaModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class HJProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(AuroriaModMobEffects.BONE_COAGULATION.get(), 60, 1));
	}
}
