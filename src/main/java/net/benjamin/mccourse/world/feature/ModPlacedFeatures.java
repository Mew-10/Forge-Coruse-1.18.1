package net.benjamin.mccourse.world.feature;

import net.benjamin.mccourse.config.MCCourseCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> CHERRY_BLOSSOM_PLACED =
            PlacementUtils.register("cherry_blossom_placed",
                    ModConfiguredFeature.CHERRY_BLOSSOM_SPAWN, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1f, 2)));

    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeature.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> CITRINE_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            ModConfiguredFeature.CITRINE_ORE, ModOrePlacement
                    .commonOrePlacement(MCCourseCommonConfigs.CITRINE_ORE_VEINS_PER_CHUNK.get(), // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
