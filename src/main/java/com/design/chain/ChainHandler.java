package com.design.chain;

public abstract class ChainHandler {
	abstract void approve(String name);

	abstract void handleRequest();

	abstract void setSuccessor(ChainHandler handler);
}
