package net.benjamin.mccourse;

import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.block.entity.ModBlockEntities;
import net.benjamin.mccourse.config.MCCourseClientConfigs;
import net.benjamin.mccourse.config.MCCourseCommonConfigs;
import net.benjamin.mccourse.effect.ModEffects;
import net.benjamin.mccourse.enchantment.ModEnchantments;
import net.benjamin.mccourse.entity.ModEntityTypes;
import net.benjamin.mccourse.entity.client.RaccoonRenderer;
import net.benjamin.mccourse.entity.client.TigerRenderer;
import net.benjamin.mccourse.fluid.ModFluids;
import net.benjamin.mccourse.item.Moditems;
import net.benjamin.mccourse.painting.ModPaintings;
import net.benjamin.mccourse.potion.ModPotions;
import net.benjamin.mccourse.screen.GemCuttingStationScreen;
import net.benjamin.mccourse.screen.ModMenuTypes;
import net.benjamin.mccourse.sound.ModSounds;
import net.benjamin.mccourse.util.ModItemProperties;
import net.benjamin.mccourse.villager.ModVillagers;
import net.benjamin.mccourse.world.structure.ModStructures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MCCourseMod.MOD_ID)
public class MCCourseMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mccourse";

    public MCCourseMod() {
        // Register the setup method for modloading
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditems.register(eventbus);
        ModBlocks.register(eventbus);
        ModFluids.register(eventbus);
        ModEnchantments.register(eventbus);
        ModEffects.register(eventbus);
        ModPotions.register(eventbus);
        ModPaintings.register(eventbus);
        ModSounds.register(eventbus);
        ModBlockEntities.register(eventbus);
        ModMenuTypes.register(eventbus);
        ModEntityTypes.register(eventbus);
        ModVillagers.register(eventbus);
        ModStructures.register(eventbus);


        GeckoLib.initialize();

        eventbus.addListener(this::setup);
        eventbus.addListener(this::clientSetup);


        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MCCourseClientConfigs.SPEC, "mccourse-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MCCourseCommonConfigs.SPEC, "mccourse-common.toml");



        eventbus.addListener(this::setup);
        // Register the enqueueIMC method for modloading


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.HONEY_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TURNIP_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GEM_CUTTING_STATION.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_WINDOW.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BLOSSOM_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());
        MenuScreens.register(ModMenuTypes.GEM_CUTTING_STATION_MENU.get(), GemCuttingStationScreen::new);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());
        EntityRenderers.register(ModEntityTypes.RACCOON.get(), RaccoonRenderer::new);
        EntityRenderers.register(ModEntityTypes.TIGER.get(), TigerRenderer::new);


        ModItemProperties.addCustomItemProperties();


    }
    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(Moditems.TURNIP_SEEDS.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(Moditems.TURNIP.get(), 0.65f);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_ROSE.getId(), ModBlocks.POTTED_PINK_ROSE);
            ModVillagers.registerPOIs();
        });
    }
    }


