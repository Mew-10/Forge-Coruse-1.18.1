package net.benjamin.mccourse.util;
import net.benjamin.mccourse.MCCourseMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_VALUABLES =
                tag("dowsing_rod_valuables");
        public static final TagKey<Block> PAXEL_MINEABLE =
                tag("mineable/paxel");
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS
                = tag("portal_frame_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MCCourseMod.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items {
        public static final TagKey<Item> CITRINE = forgeTag("gems/citrine");
        public static final TagKey<Item> COBALT_NUGGETS = forgeTag("nuggets/cobalt");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MCCourseMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static class ConfiguredStructureFeatures {
            public static final TagKey<ConfiguredStructureFeature<?, ?>> CUSTOM_STRUCTURE_TAG = tag("custom_structure_tag");

            private static TagKey<ConfiguredStructureFeature<?, ?>> tag(String name) {
                return TagKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(MCCourseMod.MOD_ID, name));
            }
        }
    }
}