package net.benjamin.mccourse.fluid;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.item.Moditems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, MCCourseMod.MOD_ID);


    public static final RegistryObject<FlowingFluid> HONEY_FLUID
            = FLUIDS.register("honey_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.HONEY_PROPERTIES));

    public static final RegistryObject<FlowingFluid> HONEY_FLOWING
            = FLUIDS.register("honey_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.HONEY_PROPERTIES));


    public static final ForgeFlowingFluid.Properties HONEY_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> HONEY_FLUID.get(), () -> HONEY_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0xbffcba03)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.HONEY_BLOCK.get()).bucket(() -> Moditems.HONEY_BUCKET.get());

    public static final RegistryObject<LiquidBlock> HONEY_BLOCK = ModBlocks.BLOCKS.register("honey",
            () -> new LiquidBlock(() -> ModFluids.HONEY_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops()));

    public static final RegistryObject<FlowingFluid> CITRINE_SLIME_FLUID
            = FLUIDS.register("citrine_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.CITRINE_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> CITRINE_SLIME_FLUID_FLOWING
            = FLUIDS.register("citrine_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.CITRINE_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> ZIRCON_SLIME_FLUID
            = FLUIDS.register("zircon_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.ZIRCON_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ZIRCON_SLIME_FLUID_FLOWING
            = FLUIDS.register("zircon_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.ZIRCON_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> DIAMOND_SLIME_FLUID
            = FLUIDS.register("diamond_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.DIAMOND_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> DIAMOND_SLIME_FLUID_FLOWING
            = FLUIDS.register("diamond_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.DIAMOND_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> EMERALD_SLIME_FLUID
            = FLUIDS.register("emerald_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.EMERALD_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> EMERALD_SLIME_FLUID_FLOWING
            = FLUIDS.register("emerald_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.EMERALD_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TANZANITE_SLIME_FLUID
            = FLUIDS.register("tanzanite_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.TANZANITE_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> TANZANITE_SLIME_FLUID_FLOWING
            = FLUIDS.register("tanzanite_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.TANZANITE_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BLACK_OPAL_SLIME_FLUID
            = FLUIDS.register("black_opal_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.BLACK_OPAL_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BLACK_OPAL_SLIME_FLUID_FLOWING
            = FLUIDS.register("black_opal_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.BLACK_OPAL_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PINK_SLIME_PEARL_SLIME_FLUID
            = FLUIDS.register("pink_slime_pearl_slime_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.PINK_SLIME_PEARL_SLIME_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PINK_SLIME_PEARL_SLIME_FLUID_FLOWING
            = FLUIDS.register("pink_slime_pearl_slime_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.PINK_SLIME_PEARL_SLIME_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOAPY_WATER_FLUID
            = FLUIDS.register("soapy_water_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.SOAPY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> SOAPY_WATER_FLUID_FLOWING
            = FLUIDS.register("soapy_water_flowing_fluid", () -> new ForgeFlowingFluid.Flowing(ModFluids.SOAPY_WATER_FLUID_PROPERTIES));



    public static final ForgeFlowingFluid.Properties CITRINE_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(CITRINE_SLIME_FLUID, CITRINE_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbff39517)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.CITRINE_SLIME_FLUID_BLOCK).bucket(Moditems.CITRINE_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties ZIRCON_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(ZIRCON_SLIME_FLUID, ZIRCON_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbfc65b60)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.ZIRCON_SLIME_FLUID_BLOCK).bucket(Moditems.ZIRCON_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties DIAMOND_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(DIAMOND_SLIME_FLUID, DIAMOND_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbf2cd1c1)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.DIAMOND_SLIME_FLUID_BLOCK).bucket(Moditems.DIAMOND_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties EMERALD_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(EMERALD_SLIME_FLUID, EMERALD_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbf2bd557)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.EMERALD_SLIME_FLUID_BLOCK).bucket(Moditems.EMERALD_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties TANZANITE_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(TANZANITE_SLIME_FLUID, TANZANITE_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbf213de5)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.TANZANITE_SLIME_FLUID_BLOCK).bucket(Moditems.TANZANITE_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties BLACK_OPAL_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(BLACK_OPAL_SLIME_FLUID, BLACK_OPAL_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbf1c4766)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.BLACK_OPAL_SLIME_FLUID_BLOCK).bucket(Moditems.BLACK_OPAL_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties PINK_SLIME_PEARL_SLIME_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(PINK_SLIME_PEARL_SLIME_FLUID, PINK_SLIME_PEARL_SLIME_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbfd41111)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.PINK_SLIME_PEARL_SLIME_FLUID_BLOCK).bucket(Moditems.PINK_SLIME_PEARL_SLIME_FLUID_BUCKET);

    public static final ForgeFlowingFluid.Properties SOAPY_WATER_FLUID_PROPERTIES
            = new ForgeFlowingFluid.Properties(SOAPY_WATER_FLUID, SOAPY_WATER_FLUID_FLOWING,
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
                    .color(0xbffcb6ea)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModBlocks.SOAPY_WATER_BLOCK).bucket(Moditems.SOAPY_WATER_FLUID_BUCKET);


    //FlowingFluidBlock
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}