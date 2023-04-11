package net.zathrint.essentiallyemerald.loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zathrint.essentiallyemerald.EssentiallyEmerald;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, EssentiallyEmerald.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_SWORD_IN_VILLAGE_WEAPONSMITH =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_sword_in_village_weaponsmith", EmeraldSwordInVillageWeaponsmith.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_AXE_IN_VILLAGE_WEAPONSMITH =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_axe_in_village_weaponsmith", EmeraldAxeInVillageWeaponsmith.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_PICKAXE_IN_VILLAGE_TOOLSMITH =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_pickaxe_in_village_toolsmith", EmeraldPickaxeInVillageToolsmith.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_SHOVEL_IN_VILLAGE_TOOLSMITH =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_shovel_in_village_toolsmith", EmeraldShovelInVillageToolsmith.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_HELMET_IN_VILLAGE_ARMORER =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_helmet_in_village_armorer", EmeraldHelmetInVillageArmorer.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_AXE_IN_PILLAGER_OUTPOST =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_axe_in_pillager_outpost", EmeraldAxeInPillagerOutpost.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_BOOTS_IN_PILLAGER_OUTPOST =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_boots_in_pillager_outpost", EmeraldBootsInPillagerOutpost.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_HOE_IN_WOODLAND_MANSION =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_hoe_in_woodland_mansion", EmeraldHoeInWoodlandMansion.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_CHESTPLATE_IN_WOODLAND_MANSION =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_chestplate_in_woodland_mansion", EmeraldChestplateInWoodlandMansion.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_HOE_IN_ANCIENT_CITY =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_hoe_in_ancient_city", EmeraldHoeInAncientCity.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> EMERALD_LEGGINGS_IN_ANCIENT_CITY =
            LOOT_MODIFIER_SERIALIZERS.register("emerald_leggings_in_ancient_city", EmeraldLeggingsInAncientCity.CODEC);



    public static void register(IEventBus bus) {
        LOOT_MODIFIER_SERIALIZERS.register(bus);
    }
}
