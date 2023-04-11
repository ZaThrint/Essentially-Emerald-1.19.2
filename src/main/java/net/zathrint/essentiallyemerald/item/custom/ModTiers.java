package net.zathrint.essentiallyemerald.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier EMERALD = new ForgeTier(3, 50, 8.0f,
            3.0f, 7, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(Items.EMERALD));
}
