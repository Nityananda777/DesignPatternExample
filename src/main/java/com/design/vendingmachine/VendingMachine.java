package com.design.vendingmachine;

public interface VendingMachine {
    void insertCash(Cash cash,String name);

    void selectItem(String name);

    void loadItem(Item item);

    void resetItem();
}
