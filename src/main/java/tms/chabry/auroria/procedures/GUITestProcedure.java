package tms.chabry.auroria.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class GUITestProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:label_wen_ben") instanceof EditBox _tf)
			_tf.setValue("\u6210\u529F");
	}
}
