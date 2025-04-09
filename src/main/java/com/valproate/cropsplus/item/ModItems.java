package com.valproate.cropsplus.item;

import com.valproate.cropsplus.IansCropsPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public abstract class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IansCropsPlus.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    @SafeVarargs
    public static void addItemToItemGroups(Item item, RegistryKey<ItemGroup>... itemGroups) {
        for(var group : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(group).register(itemGroup -> itemGroup.add(item));
        }
    }
}
