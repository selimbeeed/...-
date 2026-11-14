package com.olivia.client;

import net.fabricmc.api.ClientModInitializer;

public class BypassClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Mod yüklendiğinde hiçbir şey yapma, arkada çalış
    }
}
