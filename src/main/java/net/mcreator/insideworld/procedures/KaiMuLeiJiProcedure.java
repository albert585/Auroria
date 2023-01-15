package net.mcreator.insideworld.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KaiMuLeiJiProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u6B64\u6A21\u7EC4\u76EE\u524D\u5728\u5F00\u53D1\u9636\u6BB5"),
						false);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("Mcreator \u7248 \u5C06\u53EA\u505C\u7559\u5728 Alpha \u9636\u6BB5"),
						false);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u540E\u7EED\u7248\u672C\u5C06\u7528IDEA\u8FDB\u884C\u5F00\u53D1"),
						false);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u611F\u8C22\u6E38\u73A9\u672C\u6A21\u7EC4"), false);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u795D\u60A8\u73A9\u7684\u6109\u5FEB~"), false);
		}
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u963F\u7F57\u5229\u4E9A\u4E16\u754C\u89C2 by \u67F4\u5317\u9E66"),
						false);
		}
	}
}
