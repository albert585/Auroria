package tms.chabry.auroria.procedures;

import tms.chabry.auroria.init.AuroriaModMobEffects;
import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.Map;

public class RbProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuroriaMod.LOGGER.warn("Failed to load dependency entity for procedure Rb!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AuroriaModMobEffects.BONE, 60, 1));
	}
}
