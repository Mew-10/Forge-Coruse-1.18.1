package net.benjamin.mccourse.integration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.benjamin.mccourse.MCCourseMod;
import net.benjamin.mccourse.block.ModBlocks;
import net.benjamin.mccourse.item.Moditems;
import net.benjamin.mccourse.recipe.BlacklosTableRecipe;
import net.benjamin.mccourse.recipe.BlacklosTableRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class BlacklosTableRecipeCategory implements IRecipeCategory<BlacklosTableRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(MCCourseMod.MOD_ID, "blacklos_crafting");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(MCCourseMod.MOD_ID, "textures/gui/blacklos_table_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public BlacklosTableRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.BLACKLOS_TABLE.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends BlacklosTableRecipe> getRecipeClass() {
        return BlacklosTableRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Blacklos Table");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull BlacklosTableRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 18, 50).addIngredients(Ingredient.of((Items.COAL).getDefaultInstance()));
        builder.addSlot(RecipeIngredientRole.INPUT, 66, 16).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 114, 33).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 33).addItemStack(recipe.getResultItem());
    }
}
