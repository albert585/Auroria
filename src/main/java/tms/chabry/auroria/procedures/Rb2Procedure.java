package tms.chabry.auroria.procedures;

import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class Rb2Procedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AuroriaMod.LOGGER.warn("Failed to load dependency world for procedure Rb2!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuroriaMod.LOGGER.warn("Failed to load dependency entity for procedure Rb2!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		for (int index0 = 0; index0 < (int) (999999999); index0++) {
			new Object() {
				private int ticks = 0;

				public void startDelay(LevelAccessor world) {
					ServerTickEvents.END_SERVER_TICK.register((server) -> {
						this.ticks++;
						if (this.ticks == 6000) {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("custom").bypassArmor(), 6);
							return;
						}
					});
				}
			}.startDelay(world);
		}
	}
}
