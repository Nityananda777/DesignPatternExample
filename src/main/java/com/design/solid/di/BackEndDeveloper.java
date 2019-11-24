package com.design.solid.di;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("Write java code..");
    }

}
