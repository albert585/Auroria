
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package tms.chabry.auroria.init;

import tms.chabry.auroria.AuroriaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class AuroriaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AuroriaMod.MODID);
	public static final RegistryObject<SoundEvent> RATHER_BE_OGG = REGISTRY.register("rather.be.ogg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("auroria", "rather.be.ogg")));
	public static final RegistryObject<SoundEvent> SOMEBODY_THAT_I_USED_KNOW = REGISTRY.register("somebody.that.i.used.know", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("auroria", "somebody.that.i.used.know")));
	public static final RegistryObject<SoundEvent> SOMEBODY_THAT_I_USED_TO_KNOW = REGISTRY.register("somebody.that.i.used.to.know", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("auroria", "somebody.that.i.used.to.know")));
}
