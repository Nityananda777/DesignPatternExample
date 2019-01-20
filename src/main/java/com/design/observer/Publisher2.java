package com.design.observer;

public class Publisher2  implements IPublisher{

	private Topic topic;

	Publisher2(Topic topic) {
		this.topic = topic;
	}
	@Override
	public void publish(String meesageKey,Message message) {
		topic.publishMessage(meesageKey,message);
	}

}
