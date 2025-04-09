package com.valproate.cropsplus.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class FoodItems extends IansCropsPlusItems {
    public static final Item TOMATO_SOUP = register("tomato_soup", Item::new,
            new Item.Settings()
                    .maxCount(1)
                    .useRemainder(Items.BOWL)
                    .food((new FoodComponent.Builder()).nutrition(6).saturationModifier(0.3F).build()));

    public static final Item TOMATO_SOUP_AND_BREADSTICKS = register("tomato_soup_and_breadsticks",  Item::new,
            new Item.Settings()
                    .maxCount(1)
                    .useRemainder(Items.BOWL)
                    .food((new FoodComponent.Builder()).nutrition(10).saturationModifier(0.5F).build()));

    public static void initialize() {
        addItemToItemGroups(TOMATO_SOUP, ItemGroups.FOOD_AND_DRINK);
        addItemToItemGroups(TOMATO_SOUP_AND_BREADSTICKS, ItemGroups.FOOD_AND_DRINK);
    }
}
