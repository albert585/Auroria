package tms.chabry.auroria.procedures;

import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class NgbProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		while (0 == 0) {
			AuroriaMod.queueServerWork(9000, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
						@Override
						public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
							return Component.translatable("death.attack." + "custom");
						}
					}, 6);
			});
		}
	}
}
