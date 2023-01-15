package net.mcreator.insideworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.insideworld.InsideWorldMod;

public class Ngb2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		InsideWorldMod.queueServerWork(12000, () -> {
			entity.hurt(DamageSource.MAGIC, 2);
		});
	}
}
