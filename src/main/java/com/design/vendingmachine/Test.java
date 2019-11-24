package com.design.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setName("Pepsi");
        item1.setPrice(10);
        item1.setType("Beverage");
        Item item2 = new Item();
        item2.setName("Sprite");
        item2.setPrice(5);
        item1.setType("Beverage");
        Item item3 = new Item();
        item3.setName("Meggi");
        item3.setPrice(15);
        item3.setType("Snaks");
        VendingMachine v = new VendingMachineImpl();
        v.loadItem(item1);
        v.loadItem(item2);
        v.loadItem(item3);
        v.selectItem("Pepsi");
        v.insertCash(Cash.TEN,"Pepsi");
    }
}
