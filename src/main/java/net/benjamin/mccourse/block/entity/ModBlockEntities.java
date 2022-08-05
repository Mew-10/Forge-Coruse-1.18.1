package net.benjamin.mccourse.block.entity;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.block.entity.custom.AnimatedBlockEntity;
import net.benjamin.mccourse.block.entity.custom.BlacklosTableBlockEntity;
import net.benjamin.mccourse.block.entity.custom.GemCuttingStationBlockEntity;
import net.benjamin.mccourse.block.entity.custom.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MCCourseMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<GemCuttingStationBlockEntity>> GEM_CUTTING_STATION_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("gem_cutting_station_block_entity", () ->
                    BlockEntityType.Builder.of(GemCuttingStationBlockEntity::new,
                            ModBlocks.GEM_CUTTING_STATION.get()).build(null));

    public static final RegistryObject<BlockEntityType<AnimatedBlockEntity>> ANIMATED_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("animated_block_entity", () ->
                    BlockEntityType.Builder.of(AnimatedBlockEntity::new,
                            ModBlocks.ANIMATED_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.CHERRY_BLOSSOM_WALL_SIGN.get(),
                            ModBlocks.CHERRY_BLOSSOM_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlacklosTableBlockEntity>> BLACKLOS_TABLE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("blacklos_table", () ->
                    BlockEntityType.Builder.of(BlacklosTableBlockEntity::new,
                            ModBlocks.BLACKLOS_TABLE.get()).build(null));




    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
