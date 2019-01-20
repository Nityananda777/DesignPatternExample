package com.design.observer;

public class Consumer1 implements ConsumerGroup {

	private Topic topic;

	Consumer1(Topic topic) {
		this.topic = topic;
	}

	@Override
	public void consume(Message msg) {
		// TODO Auto-generated method stub
		System.out.println("Receiving  message from  Consumer1 is ."+msg.getMessageDetails());
		System.out.println("Receiving  message from  Consumer1 is ." + msg.getMessageDetails());
	}

}
