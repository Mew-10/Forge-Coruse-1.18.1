package net.benjamin.mccourse.item.client;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.item.custom.AnimatedBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnimatedBlockItemModel extends AnimatedGeoModel<AnimatedBlockItem> {
    @Override
    public ResourceLocation getModelLocation(AnimatedBlockItem object) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "geo/animated_block.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AnimatedBlockItem object) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "textures/machines/animated_block.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AnimatedBlockItem animatable) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "animations/animated_block.animation.json");
    }
}