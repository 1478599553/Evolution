package com.example.examplemod.workreg;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> PAxe = ItemRegistryHandler.ITEMS.register("primal_axe",() ->
            new Item(new Item.Properties().group(ItemGroup.TOOLS)));
    static void register () {

    }
}

