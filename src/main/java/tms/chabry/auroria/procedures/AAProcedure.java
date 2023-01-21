package tms.chabry.auroria.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

public class AAProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("\u730E \u6740 \u65F6 \u523B\uFF01\uFF01\uFF01\uFF01\uFF011"),
						false);
		}
	}
}
