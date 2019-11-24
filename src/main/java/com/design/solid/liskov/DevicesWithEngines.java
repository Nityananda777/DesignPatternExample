package com.design.solid.liskov;

public class DevicesWithEngines extends   TrasportationDevice{
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
