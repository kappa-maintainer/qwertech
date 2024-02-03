package com.kbi.qwertech.loaders.mod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import gregapi.code.ModData;
import gregapi.data.IL;
import gregapi.data.MD;
import gregapi.util.ST;

public class ModLoad_AETHER extends ModLoadBase {

    @Override
    public ModData getMod() {
        return MD.AETHER;
    }

    @Override
    public void addOreDict() {
        ItemStack skyPlank = IL.AETHER_Skyroot_Planks.get(1);
        if (ST.valid(skyPlank)) {
            OreDictionary.registerOre("plankWoodSkyroot", skyPlank);
        }
    }
}
