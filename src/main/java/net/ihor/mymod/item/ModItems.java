package net.ihor.mymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.ihor.mymod.MyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ELECTRO_CRYSTAL = registerItem("electro_crystal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MyMod.MOD_ID, name), item);
    }

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(ELECTRO_CRYSTAL);
    }

    public static void registerModItems(){
        MyMod.LOGGER.info("Registering Mod Items for " + MyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
