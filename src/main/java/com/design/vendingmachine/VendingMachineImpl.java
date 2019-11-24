package com.design.vendingmachine;

public class VendingMachineImpl implements VendingMachine {
    private Inventory inventory = new Inventory();

    @Override
    public void insertCash(Cash cash, String name) {
        System.out.println("inserting cash.");
        boolean flag = validate(cash, name);
        System.out.println("Validation is done.");
        if (flag == true) {
            System.out.println("Item is dispensed successfully.");
        }

    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("selecting item.");
        if (checkItem(itemName)) {
            System.out.println("item " + itemName + " is available. please insert cash to get it.");
        }
    }


    @Override
    public void loadItem(Item item) {
        System.out.println("Loading item into Inventory.");
        inventory.addItem(item);
    }

    @Override
    public void resetItem() {
    }

    private boolean checkItem(String item) {
        if (inventory.getItem(item) != null) {
            return true;
        }
        return false;
    }
    private boolean validate(Cash cash, String name) {
        Item item=inventory.getItem(name);
        if (item.getPrice()==cash.name&&item.getQuantity()>=1) {
            return true;
        }
        return false;
    }
}
