package tms.chabry.auroria.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OpenProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u6B22\u8FCE\u4F7F\u7528\u672C\u6A21\u7EC4"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u672C\u6A21\u7EC4\u76EE\u524D\u4ECD\u5728\u5F00\u53D1\u9636\u6BB5\uFF0C\u5982\u9047\u5230bug\u53EF\u901A\u8FC7issus\u53CD\u9988\u81F3gitee\u6216github"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Mcreator\u7248\u5C06\u5728Alpha\u9636\u6BB5\u7EC8\u6B62\u65F6\u505C\u6B62\u652F\u6301"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u5C4A\u65F6\u4F1A\u7528IDEA\u7B49\u5DE5\u5177\u8FDB\u884C\u8FDB\u4E00\u6B65\u5F00\u53D1"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u611F\u8C22\u60A8\u6E38\u73A9\u672C\u6A21\u7EC4"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u795D\u60A8\u73A9\u7684\u6109\u5FEB~"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u963F\u7F57\u5229\u4E9A\u4E16\u754C\u89C2 By \u67F4\u5317\u9E66"), false);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Mod version 0.0.2a"), false);
	}
}
