package net.phoboss.decobeacon.client.rendering;

import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import net.minecraft.client.render.RenderLayer;
import net.phoboss.decobeacon.blocks.ModBlockEntities;
import net.phoboss.decobeacon.blocks.ModBlocks;
import net.phoboss.decobeacon.blocks.decobeacon.DecoBeaconBlockEntityRenderer;
import net.phoboss.decobeacon.blocks.omnibeacon.OmniBeaconBlockEntityRenderer;


public class ModRendering {

    public static void registerRenderType() {
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.DECO_BEACON.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.DECO_BEACON_FAKE.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.DECO_BEACON_GHOST.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.DECO_BEACON_GHOST_FAKE.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.OMNI_BEACON.get());
        RenderTypeRegistry.register(RenderLayer.getTranslucent(),ModBlocks.OMNI_BEACON_GHOST.get());


    }

    public static void registerBlockEntityRenderers() {
        BlockEntityRendererRegistry.register(ModBlockEntities.DECO_BEACON.get(), DecoBeaconBlockEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.OMNI_BEACON.get(), OmniBeaconBlockEntityRenderer::new);
    }

    public static void registerAll() {
        registerRenderType();
        registerBlockEntityRenderers();
    }
}
