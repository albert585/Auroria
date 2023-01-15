package net.mcreator.insideworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.insideworld.init.InsideWorldModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NgbProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(InsideWorldModMobEffects.NING_GU_BING.get(), 60, 1));
	}
}
