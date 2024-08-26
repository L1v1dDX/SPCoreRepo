package net.mcreator.survivalpluscore.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.survivalpluscore.world.inventory.FusionStationGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FusionStationGUIScreen extends AbstractContainerScreen<FusionStationGUIMenu> {
	private final static HashMap<String, Object> guistate = FusionStationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FusionStationGUIScreen(FusionStationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("spcore:textures/screens/fusion_station_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("spcore:textures/screens/unburnt.png"), this.leftPos + 91, this.topPos + 35, 0, 0, 30, 21, 30, 21);

		guiGraphics.blit(new ResourceLocation("spcore:textures/screens/unlit.png"), this.leftPos + 42, this.topPos + 38, 0, 0, 19, 16, 19, 16);

		guiGraphics.blit(new ResourceLocation("spcore:textures/screens/bigslot.png"), this.leftPos + 129, this.topPos + 33, 0, 0, 26, 26, 26, 26);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.spcore.fusion_station_gui.label_fusion_station"), 51, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
