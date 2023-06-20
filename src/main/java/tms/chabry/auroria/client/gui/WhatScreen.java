package tms.chabry.auroria.client.gui;

import tms.chabry.auroria.world.inventory.WhatMenu;
import tms.chabry.auroria.network.WhatButtonMessage;
import tms.chabry.auroria.AuroriaMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WhatScreen extends AbstractContainerScreen<WhatMenu> {
	private final static HashMap<String, Object> guistate = WhatMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox label_wen_ben;
	Button button_ce_shi;

	public WhatScreen(WhatMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		label_wen_ben.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("auroria:textures/screens/gui1.png"));
		this.blit(ms, this.leftPos + -99, this.topPos + 23, 0, 0, 200, 80, 200, 80);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (label_wen_ben.isFocused())
			return label_wen_ben.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		label_wen_ben.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.auroria.what.label_aaa"), -27, 68, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		label_wen_ben = new EditBox(this.font, this.leftPos + -54, this.topPos + 32, 120, 20, Component.translatable("gui.auroria.what.label_wen_ben")) {
			{
				setSuggestion(Component.translatable("gui.auroria.what.label_wen_ben").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.auroria.what.label_wen_ben").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.auroria.what.label_wen_ben").getString());
				else
					setSuggestion(null);
			}
		};
		label_wen_ben.setMaxLength(32767);
		guistate.put("text:label_wen_ben", label_wen_ben);
		this.addWidget(this.label_wen_ben);
		button_ce_shi = Button.builder(Component.translatable("gui.auroria.what.button_ce_shi"), e -> {
			if (true) {
				AuroriaMod.PACKET_HANDLER.sendToServer(new WhatButtonMessage(0, x, y, z));
				WhatButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 53, this.topPos + 77, 35, 20).build();
		guistate.put("button:button_ce_shi", button_ce_shi);
		this.addRenderableWidget(button_ce_shi);
	}
}
