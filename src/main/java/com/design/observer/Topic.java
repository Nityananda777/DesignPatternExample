package com.design.observer;

public interface Topic {

	public void addConsumer(ConsumerGroup observer);

	public void removeConsumer(ConsumerGroup observer);

	public void publishMessage(String meesageKey,Message message);
}
