package com.design.vendingmachine;

public enum Cash {
    FIV(5), TEN(10), TWENTY(20);

    int name;

    Cash(int name) {
        this.name = name;
    }
}
