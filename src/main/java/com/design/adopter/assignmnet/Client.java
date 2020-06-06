package com.design.adopter.assignmnet;

public class Client {
    public static void main(String[] args) {
        CoffeeMachineInterface coffeeMachineInterface = new CoffeeTouchscreenAdapter();
        coffeeMachineInterface.chooseFirstSelection();
        coffeeMachineInterface.chooseSecondSelection();
    }
}
