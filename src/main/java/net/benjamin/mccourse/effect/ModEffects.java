package net.benjamin.mccourse.effect;
import com.mojang.blaze3d.shaders.Effect;
import net.benjamin.mccourse.MCCourseMod;;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MCCourseMod.MOD_ID);

    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));

    public static final RegistryObject<MobEffect> STINKY = MOB_EFFECTS.register("stinky", () ->
            new StinkyEffect(MobEffectCategory.NEUTRAL, 0x3b2012));

    public static final RegistryObject<MobEffect> SLIMEY = MOB_EFFECTS.register("slimey", () ->
            new SlimeyEffect(MobEffectCategory.NEUTRAL, 0x36ebab).addAttributeModifier(Attributes.MOVEMENT_SPEED,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", -0.25F, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> SOAPY = MOB_EFFECTS.register("soapy", () ->
            new SoapyEffect(MobEffectCategory.NEUTRAL, 0xe85fd6));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}