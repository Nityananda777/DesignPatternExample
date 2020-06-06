package com.design.adopter.assignmnet;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine oldCoffeeMachine;

    CoffeeTouchscreenAdapter() {
        oldCoffeeMachine = new OldCoffeeMachineImpl();
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
