package com.example.playerlocatorhud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerLocatorHUDEventHandler {
    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent.Post event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            Minecraft mc = Minecraft.getMinecraft();
            ScaledResolution scaled = new ScaledResolution(mc);
            int width = scaled.getScaledWidth();
            int height = scaled.getScaledHeight();

            // Draw the HUD overlay
            Gui.drawRect(width / 2 - 50, height - 30, width / 2 + 50, height - 20, 0x80000000);

            // Draw directional markers
            mc.fontRenderer.drawString("N", width / 2 - 4, height - 28, 0xFFFFFF);
            mc.fontRenderer.drawString("S", width / 2 - 4, height - 12, 0xFFFFFF);
            mc.fontRenderer.drawString("E", width / 2 + 40, height - 24, 0xFFFFFF);
            mc.fontRenderer.drawString("W", width / 2 - 48, height - 24, 0xFFFFFF);
        }
    }
}