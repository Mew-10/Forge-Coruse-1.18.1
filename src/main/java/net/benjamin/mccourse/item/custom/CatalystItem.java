package net.benjamin.mccourse.item.custom;

import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.block.custom.KJPortalBlock;
import net.benjamin.mccourse.item.ModCreativeModeTabs;
import net.benjamin.mccourse.world.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class CatalystItem extends Item {
    public CatalystItem() {
        super(new Properties()
                .tab(ModCreativeModeTabs.MCMOD_TAB)
                .stacksTo(1)
                .rarity(Rarity.RARE)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(context.getPlayer() != null) {
            if(context.getPlayer().level.dimension() == ModDimensions.KJDIM_KEY
                    || context.getPlayer().level.dimension() == Level.OVERWORLD) {
                for(Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    if(((KJPortalBlock) ModBlocks.KAUPEN_PORTAL.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        context.getLevel().playSound(context.getPlayer(), framePos,
                                SoundEvents.PORTAL_TRIGGER, SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    }
                    else return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}