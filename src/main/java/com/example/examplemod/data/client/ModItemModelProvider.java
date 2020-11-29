package com.example.examplemod.data.client;

import com.example.examplemod.Evolution;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

//public class ModItemModelProvider extends ItemModelProvider {
//    public ModItemModelProvider(DataGenerator generator,  ExistingFileHelper existingFileHelper) {
//        super(generator, Evolution.MOD_ID, existingFileHelper);
//    }
//
//    @Override
//    protected void registerModels() {
//        withExistingParent("primal_axe",modLoc("assets/evolution/item/primal_axe"));
//
//        ModelFile itemGenerated = getExistingFile(mcLoc("assets/evolution/item/generated"));
//        builder(itemGenerated);
//    }
//
//    private ItemModelBuilder builder(ModelFile itemGenerated) {
//        return getBuilder("primal_axe").parent(itemGenerated).texture("layer0", "assets/evolution/item/primal_axe");
//    }
//}
