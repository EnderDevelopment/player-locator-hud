package com.example.playerlocatorhud;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PlayerLocatorHUDMod.MODID, version = PlayerLocatorHUDMod.VERSION)
public class PlayerLocatorHUDMod {
    public static final String MODID = "playerlocatorhud";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PlayerLocatorHUDEventHandler());
    }
}