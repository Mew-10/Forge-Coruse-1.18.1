package net.benjamin.mccourse.event;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.block.entity.ModBlockEntities;
import net.benjamin.mccourse.block.entity.client.AnimatedBlockRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.ANIMATED_BLOCK_ENTITY.get(), AnimatedBlockRenderer::new);
    }
    }
