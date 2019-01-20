package com.design.observer;

public class Consumer2 implements ConsumerGroup {

	private Topic topic;

	Consumer2(Topic topic) {
		this.topic = topic;
	}

	@Override
	public void consume(Message msg) {
		System.out.println("Receiving  message from  Consumer2 is ." + msg.getMessageDetails());
		System.out.println("Receiving  message from  Consumer2 is ." + msg.getMessageDetails());
		
	}

}
