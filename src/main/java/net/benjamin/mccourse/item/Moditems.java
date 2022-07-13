package net.benjamin.mccourse.item;

import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.entity.ModEntityTypes;
import net.benjamin.mccourse.fluid.ModFluids;
import net.benjamin.mccourse.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> COAL_SILVER = ITEMS.register("coal_silver",
            () -> new CoalSilverItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE = ITEMS.register("chipped_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));


    public static final RegistryObject<Item> CITRINE_SWORD = ITEMS.register("citrine_sword",
            () -> new LevitationSwordItem(ModTiers.CITRINE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_PICKAXE = ITEMS.register("citrine_pickaxe",
            () -> new PickaxeItem(ModTiers.CITRINE, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_SHOVEL = ITEMS.register("citrine_shovel",
            () -> new ShovelItem(ModTiers.CITRINE, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_AXE = ITEMS.register("citrine_axe",
            () -> new AxeItem(ModTiers.CITRINE, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_HOE = ITEMS.register("citrine_hoe",
            () -> new HoeItem(ModTiers.CITRINE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_STAFF = ITEMS.register("citrine_staff", CatalystItem::new);

    public static final RegistryObject<Item> CITRINE_HELMET = ITEMS.register("citrine_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_CHESTPLATE = ITEMS.register("citrine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_LEGGINGS = ITEMS.register("citrine_leggings",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_BOOTS = ITEMS.register("citrine_boots",
            () -> new ArmorItem(ModArmorMaterials.CITRINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).durability(16)));

    public static final RegistryObject<Item> GEM_CUTTER_TOOL = ITEMS.register("gem_cutter_tool",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).durability(32)));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword",
            () -> new LevitationSwordItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));
    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));
    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));
    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe",
            () -> new AxeItem(ModTiers.COBALT, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));
    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ModTiers.COBALT, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> HONEY_BUCKET = ITEMS.register("honey_bucket",
            () -> new BucketItem(ModFluids.HONEY_FLUID,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).durability(500)));

    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).food(ModFoods.TURNIP)));

    public static final RegistryObject<Item> CITRINE_HORSE_ARMOR = ITEMS.register("citrine_horse_armor",
            () -> new HorseArmorItem(12, "citrine",
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TURNIP_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CITRINE_PAXEL = ITEMS.register("citrine_paxel",
            () -> new PaxelItem(ModTiers.COBALT, 7, 6f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> RACCOON_SPAWN_EGG = ITEMS.register("raccoon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.RACCOON,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> TIGER_SPAWN_EGG = ITEMS.register("tiger_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TIGER,0xfcb603, 0x242321,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> ANIMATED_ITEM = ITEMS.register("animated_item",
            () -> new AnimatedItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE_SWORD = ITEMS.register("chipped_citrine_sword",
            () -> new LevitationSwordItem(ModTiers.CHIPPED_CITRINE, 4, 6f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE_PICKAXE = ITEMS.register("chipped_citrine_pickaxe",
            () -> new PickaxeItem(ModTiers.CHIPPED_CITRINE, 3, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE_SHOVEL = ITEMS.register("chipped_citrine_shovel",
            () -> new ShovelItem(ModTiers.CHIPPED_CITRINE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE_AXE = ITEMS.register("chipped_citrine_axe",
            () -> new AxeItem(ModTiers.CHIPPED_CITRINE, 6, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHIPPED_CITRINE_HOE = ITEMS.register("chipped_citrine_hoe",
            () -> new HoeItem(ModTiers.CHIPPED_CITRINE, 2, 2f,
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> ANIMATED_BLOCK_ITEM = ITEMS.register("animated_block",
            () -> new AnimatedBlockItem(ModBlocks.ANIMATED_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB)));

    public static final RegistryObject<Item> CHERRY_BLOSSOM_SIGN_ITEM = ITEMS.register("cherry_blossom_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTabs.MCMOD_TAB).stacksTo(16),
                    ModBlocks.CHERRY_BLOSSOM_SIGN.get(), ModBlocks.CHERRY_BLOSSOM_WALL_SIGN.get()));



    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
