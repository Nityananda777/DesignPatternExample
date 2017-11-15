package com.design.abstractFactory;

public interface VehicleParts {
	BodyFactory getVechicleBody();

	EngineFactory getEngine();
}
