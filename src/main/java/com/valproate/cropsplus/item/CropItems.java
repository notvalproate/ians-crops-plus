package com.valproate.cropsplus.item;

import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class CropItems extends IansCropsPlusItems {
    public static final Item TOMATO = register("tomato",  Item::new, new Item.Settings().food(FoodComponents.BEETROOT));

    public static void initialize() {
        addItemToItemGroups(TOMATO, ItemGroups.INGREDIENTS, ItemGroups.FOOD_AND_DRINK);
    }
}
