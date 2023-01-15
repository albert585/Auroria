
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.insideworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.insideworld.entity.KuangJingChongEntity;
import net.mcreator.insideworld.entity.Fz1Entity;
import net.mcreator.insideworld.entity.FuYouPaoEntity;
import net.mcreator.insideworld.entity.ChangMaoEntity;
import net.mcreator.insideworld.InsideWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsideWorldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, InsideWorldMod.MODID);
	public static final RegistryObject<EntityType<KuangJingChongEntity>> KUANG_JING_CHONG = register("kuang_jing_chong",
			EntityType.Builder.<KuangJingChongEntity>of(KuangJingChongEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KuangJingChongEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<FuYouPaoEntity>> FU_YOU_PAO = register("projectile_fu_you_pao",
			EntityType.Builder.<FuYouPaoEntity>of(FuYouPaoEntity::new, MobCategory.MISC).setCustomClientFactory(FuYouPaoEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fz1Entity>> FZ_1 = register("projectile_fz_1",
			EntityType.Builder.<Fz1Entity>of(Fz1Entity::new, MobCategory.MISC).setCustomClientFactory(Fz1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChangMaoEntity>> CHANG_MAO = register("projectile_chang_mao",
			EntityType.Builder.<ChangMaoEntity>of(ChangMaoEntity::new, MobCategory.MISC).setCustomClientFactory(ChangMaoEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KuangJingChongEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KUANG_JING_CHONG.get(), KuangJingChongEntity.createAttributes().build());
	}
}
