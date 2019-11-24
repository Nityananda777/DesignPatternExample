package com.design.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> map = new HashMap<>();
    int count = 0;

    public void addItem(Item item) {
        int count = 0;
        if (map.get(item.getName()) != null) {
            Item items = map.get(item.getName());
        } else {
            map.put(item.getName(), item);
            item.setQuantity(count++);
        }

    }

    public Item getItem(String item) {
        return map.get(item);
    }

    public void removeItem(Item item) {
        map.get(item);
        count--;
    }
}
