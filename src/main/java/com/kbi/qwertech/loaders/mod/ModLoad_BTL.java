package com.kbi.qwertech.loaders.mod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import gregapi.code.ModData;
import gregapi.data.IL;
import gregapi.data.MD;
import gregapi.util.ST;

public class ModLoad_BTL extends ModLoadBase {

    @Override
    public ModData getMod() {
        return MD.BTL;
    }

    @Override
    public void addOreDict() {
        ItemStack weedwoodPlank = IL.BTL_Weedwood_Planks.get(1);
        if (ST.valid(weedwoodPlank)) {
            OreDictionary.registerOre("plankWoodWeedwood", weedwoodPlank);
        }
    }
}
