package com.kbi.qwertech.api.recipe;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public interface IListRecipe extends IRecipe {

    ItemStack getCraftingResultList(List<ItemStack> input);

    boolean matchesList(List<ItemStack> input);

    List<Object> getInputList();
}
