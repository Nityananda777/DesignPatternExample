package com.design.adopter.assignmnet;

public class OldCoffeeMachineImpl implements OldCoffeeMachine {
    @Override
    public void selectA() {
        System.out.println("Coffee A selected");
    }

    @Override
    public void selectB() {
        System.out.println("Coffee B selected");
    }
}
