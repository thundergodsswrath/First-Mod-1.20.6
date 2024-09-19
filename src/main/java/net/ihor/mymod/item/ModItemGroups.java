package net.ihor.mymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ihor.mymod.MyMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELECTRO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MyMod.MOD_ID, "electro"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.electro"))
                    .icon(() -> new ItemStack(ModItems.ELECTRO_CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ELECTRO_CRYSTAL);
                    }).build());


    public static void registerItemGroups(){
        MyMod.LOGGER.info("Registering Item Groups for " + MyMod.MOD_ID);
    }
}
