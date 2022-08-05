package net.benjamin.mccourse.potion;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, MCCourseMod.MOD_ID);

    public static RegistryObject<Potion> FREEZE_POTION = POTIONS.register("freeze_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.FREEZE.get(), 200, 0)));

    public static RegistryObject<Potion> SLIMEY_POTION = POTIONS.register("slimey_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.SLIMEY.get(), 200, 0)));
    public static RegistryObject<Potion> SOAPY_POTION = POTIONS.register("soapy_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.SOAPY.get(), 200, 0)));
    public static RegistryObject<Potion> DIRTY_POTION = POTIONS.register("stinky_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.STINKY.get(), 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}