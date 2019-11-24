package com.design.solid.di;

public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    private void writeJavascript() {
        System.out.println("Write javascript code..");
    }

}
