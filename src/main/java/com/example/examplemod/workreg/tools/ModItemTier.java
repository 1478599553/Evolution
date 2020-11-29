package com.example.examplemod.workreg.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier {
    //参数（挖掘等级，耐久，效率，伤害，）

    PRIMAL(3,23,1.0F,3.0F,)

    @Override
    public int getMaxUses() {
        return 0;
    }

    @Override
    public float getEfficiency() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getHarvestLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
