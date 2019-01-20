package com.design.observer;

public class Publisher1 implements IPublisher {

	private Topic topic;

	Publisher1(Topic topic) {
		this.topic = topic;
	}

	@Override
	public void publish(String meesageKey,Message message) {
		topic.publishMessage(meesageKey,message);
	}

}
