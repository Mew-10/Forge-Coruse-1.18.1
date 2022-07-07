package net.benjamin.mccourse.event;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.entity.ModEntityTypes;
import net.benjamin.mccourse.entity.custom.RaccoonEntity;
import net.benjamin.mccourse.entity.custom.TigerEntity;
import net.benjamin.mccourse.event.loot.DataTabletAdditionModifier;
import net.benjamin.mccourse.event.loot.DowsingRodInIglooAdditionModifier;
import net.benjamin.mccourse.recipe.GemCuttingStationRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new DataTabletAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MCCourseMod.MOD_ID,"data_tablet")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(MCCourseMod.MOD_ID,"dowsing_rod_in_igloo"))


        );
    }
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RACCOON.get(), RaccoonEntity.setAttributes());
        event.put(ModEntityTypes.TIGER.get(), TigerEntity.setAttributes());
    }
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, GemCuttingStationRecipe.Type.ID, GemCuttingStationRecipe.Type.INSTANCE);
    }
    }